package ttps.spring.clasesDAOimplJPA;

import ttps.spring.clasesDAO.PerfilDAO;
import ttps.spring.model.Perfil;

public class PerfilDAOImplJPA extends GenericDAOImplJPA<Perfil> implements PerfilDAO{
	public PerfilDAOImplJPA() {
		super(Perfil.class);
	}
	

}
