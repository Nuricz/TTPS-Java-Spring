package ttps.spring.clasesDAOimplJPA;

import ttps.spring.clasesDAO.ComentarioDAO;
import ttps.spring.model.Comentario;

public class ComentarioDAOImplJPA extends GenericDAOImplJPA<Comentario> implements ComentarioDAO{
	public ComentarioDAOImplJPA() {
		super(Comentario.class);
	}
}