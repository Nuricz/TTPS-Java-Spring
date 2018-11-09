package ttps.spring.clasesDAOimplJPA;

import java.util.List;



import org.springframework.stereotype.Repository;

import ttps.spring.model.Usuario;
@Repository
public class UsuarioDAOImplJPA extends GenericDAOImplJPA<Usuario>{
	
	public UsuarioDAOImplJPA() {
		super(Usuario.class);
	}
	public Usuario recuperarPorUsername(String nombre) {
		
		List<Usuario> lista = (List<Usuario>) this.getEntityManager().createQuery("select u from Usuario u where username = :nombre").getResultList();
		if(lista.isEmpty())
			return null;
		else
			return lista.get(0);
	}
}	
