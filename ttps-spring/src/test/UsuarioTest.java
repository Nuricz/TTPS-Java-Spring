package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import ttps.spring.clasesDAOimplJPA.UsuarioDAOImplJPA;
import ttps.spring.model.Perfil;
import ttps.spring.model.Usuario;


public class UsuarioTest {

	@Test
	public void recuperarUsuario() {
		UsuarioDAOImplJPA uDAO = new UsuarioDAOImplJPA();
		Long IdUser = Long.valueOf(2);
		Usuario uBorrar = uDAO.recuperar(IdUser);
		assertNotNull(uBorrar);
	}
	
	@Test
	public void borrarUsuario() {
		UsuarioDAOImplJPA uDAO = new UsuarioDAOImplJPA();
		Long IdUser = Long.valueOf(2);
		uDAO.recuperar(IdUser);
		uDAO.borrar(IdUser);
		Usuario borrado = uDAO.recuperar(IdUser);
		assertNull(borrado);
	}
	
	@Test
	public void agregar() {
		UsuarioDAOImplJPA uDAO = new UsuarioDAOImplJPA();
		
		Usuario u = new Usuario();
		u.setNombre("Nuria");
		u.setApellido("Czajkowski");
		u.setEmail("nuria.czajko@gmail.com");
		u.setUsername("NuriCz");
		u.setContraseña("n1n2n3");
	
		Perfil p = new Perfil();
		p.setNombre("Alumno");
		u.setPerfil(p);
		
		uDAO.persistir(u);
	}
	
	@Test
	public void modificar() {
		UsuarioDAOImplJPA uDAO = new UsuarioDAOImplJPA();
		Usuario user = uDAO.recuperarPorUsername("NuriCz");
		user.setNombre("Pablo");
		Long userId = user.getId();
		uDAO.actualizar(user);
		user = uDAO.recuperar(userId);
		assert(user.getNombre() == "Pablo");
		
	}

}
