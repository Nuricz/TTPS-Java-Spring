package ttps.spring.model;
import javax.persistence.*;

import java.util.List;

@Entity
@Table(name="cartelera")
public class Cartelera {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cartelera_id")
	private Long id;
	private String nombre;
	
	@OneToMany
    @JoinTable(name="cartelera_publicadores", 
    joinColumns=@JoinColumn(name="cartelera_id", 
                      referencedColumnName="cartelera_id"),
    inverseJoinColumns=@JoinColumn(name="usuario_id", 
                      referencedColumnName="usuario_id"))
	private List<Usuario> publicadores;
	
	@OneToMany
	@JoinTable(name="cartelera_interesados", 
    joinColumns=@JoinColumn(name="cartelera_id", 
                      referencedColumnName="cartelera_id"),
    inverseJoinColumns=@JoinColumn(name="usuario_id", 
                      referencedColumnName="usuario_id"))
	private List<Usuario> alumnosInteresados;
	
	@OneToMany(mappedBy="cartelera")
	private List<Publicacion> publicaciones;
	
	
	public Cartelera(){}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Usuario> getPublicadores() {
		return publicadores;
	}
	public void setPublicadores(List<Usuario> publicadores) {
		this.publicadores = publicadores;
	}
	public List<Usuario> getAlumnosInteresados() {
		return alumnosInteresados;
	}
	public void setAlumnosInteresados(List<Usuario> alumnosInteresados) {
		this.alumnosInteresados = alumnosInteresados;
	}
	public List<Publicacion> getPublicaciones() {
		return publicaciones;
	}
	public void setPublicaciones(List<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}

}
