package ttps.spring.clasesDAOimplJPA;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMF {
	private static final EntityManagerFactory em = Persistence.createEntityManagerFactory("carteleras1");

	public static EntityManagerFactory getEMF() {
		return em;
	}
}
