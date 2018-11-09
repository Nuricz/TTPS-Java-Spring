package ttps.spring.clasesDAOimplJPA;

import ttps.spring.clasesDAO.PublicacionDAO;
import ttps.spring.model.Publicacion;

public class PublicacionDAOImplJPA extends GenericDAOImplJPA<Publicacion> implements PublicacionDAO{
	public PublicacionDAOImplJPA() {
		super(Publicacion.class);
	}
}
