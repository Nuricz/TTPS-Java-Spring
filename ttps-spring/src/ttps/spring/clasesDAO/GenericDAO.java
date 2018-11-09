package ttps.spring.clasesDAO;

import java.io.Serializable;

public interface GenericDAO<T> {
	public void actualizar(T entity);

	public void borrar(T entity);

	public T borrar(Serializable id);

	public boolean existe(Serializable id);

	public T persistir(T entity);

	public T recuperar(Long id);
}
