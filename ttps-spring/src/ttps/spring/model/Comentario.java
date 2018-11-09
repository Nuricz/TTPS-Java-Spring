package ttps.spring.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="comentario")
public class Comentario {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="comentario_id")
	private Long id;
	@OneToOne(optional=false)
	private Usuario usuario;
	private String texto;
	
	public Comentario(){}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
}
