package ttps.spring.clasesDAOimplJPA;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import ttps.spring.clasesDAO.GenericDAO;

@Transactional
public class GenericDAOImplJPA<T> implements GenericDAO<T> {

	protected Class<T> persistentClass;
	private EntityManager entityManager;

	
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.entityManager = em;
	}
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	public GenericDAOImplJPA() {
	}

	public GenericDAOImplJPA(Class<T> clase) {
		this.persistentClass = clase;
	}

	@Override
	public T persistir(T entity) {
		this.getEntityManager().persist(entity);
		return entity;
	}

	public void actualizar(T entity) {
		this.getEntityManager().merge(entity);
	}

	@Override
	public void borrar(T entity) {
			this.getEntityManager().remove(entity);		
	}

	public T borrar(Serializable id) {
		T entity = this.getEntityManager().find(this.getPersistentClass(), id);
		if (entity != null) {
			this.getEntityManager().remove(entity);
		}
		return entity;
	}

	public List<T> recuperarTodos(String columnOrder) {
		Query consulta = this.getEntityManager().createQuery(
				"select e from" + getPersistentClass().getSimpleName() + " e order by e	." + columnOrder);
		List<T> resultado = (List<T>) consulta.getResultList();
		return resultado;
	}

	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	public void setPersistentClass(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	@Override
	public boolean existe(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T recuperar(Long id) {
		T objeto = this.getEntityManager().find(getPersistentClass(), id);
		
		return objeto;
		
	}
}
