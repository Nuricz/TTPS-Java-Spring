package ttps.spring.model;
import javax.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="usuario_id")
	private Long id;
	private String nombre;
	private String contraseña;
	private String apellido;
	private String username;
	private String email;
	
	
	@OneToOne(optional=false, cascade={CascadeType.PERSIST,CascadeType.REMOVE})
	@JoinColumn(name="perfil_id")
	private Perfil perfil;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	public Long getId() {
		return id;
	}
	
}
