package ttps.spring.model;

import javax.persistence.*;

@Entity
@Table(name="perfil")
public class Perfil {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="perfil_id")
	private Long id;
	private String nombre;
	
	public Perfil(){}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
