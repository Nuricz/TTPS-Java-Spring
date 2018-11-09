package ttps.spring.model;
import javax.persistence.*;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="publicacion")
public class Publicacion {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="publicacion_id")
	private Long id;
	
	private String titulo;
	private String contenido;
	
	@OneToOne(optional = false)
	private Usuario publicador;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="cartelera_id")
	private Cartelera cartelera;
	
	@OneToMany
	@JoinColumn(name="comentario_id")
	private List<Comentario> comentarios;
	
	public Publicacion(){}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public Usuario getPublicador() {
		return publicador;
	}
	public void setPublicador(Usuario publicador) {
		this.publicador = publicador;
	}
	public List<Comentario> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	public Cartelera getCartelera() {
		return cartelera;
	}
	public void setCartelera(Cartelera cartelera) {
		this.cartelera = cartelera;
	}
}
