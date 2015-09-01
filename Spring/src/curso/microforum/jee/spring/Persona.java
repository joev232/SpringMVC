package curso.microforum.jee.spring;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Persona {
	
	@Size(min=3)
	private String nombre;
	
	@Min(18)
	private int edad;
	@NotNull
	private String descripcion;
	@NotNull
	private String foto;
	@NotNull
	private String dni;
	
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Persona() {
		//super();
	}
	public Persona(String nombre, int edad, String descripcion,String foto,String dni) {
		//super();
		this.nombre = nombre;
		this.edad = edad;
		this.descripcion = descripcion;
		this.foto=foto;
		this.dni=dni;
	}
	

}
