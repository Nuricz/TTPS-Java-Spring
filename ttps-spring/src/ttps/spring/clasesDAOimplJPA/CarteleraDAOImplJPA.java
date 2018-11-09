package ttps.spring.clasesDAOimplJPA;

import ttps.spring.clasesDAO.CarteleraDAO;
import ttps.spring.model.Cartelera;

public class CarteleraDAOImplJPA extends GenericDAOImplJPA<Cartelera> implements CarteleraDAO{
	public CarteleraDAOImplJPA() {
		super(Cartelera.class);
	}
}
