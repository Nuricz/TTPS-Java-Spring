package ttps.spring.model;
import javax.persistence.*;


@Entity(name="CarteleraMateria")
public class CarteleraMateria extends Cartelera {
	
	public CarteleraMateria() {
		super();
	}

	private Integer año;

	public Integer getAño() {
		return año;
	}

	public void setAño(Integer año) {
		this.año = año;
	}

}
