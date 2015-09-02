package curso.microforum.jee.spring;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

public class Persona {
	
	@Size(min=3, max=30)
	private String nombre;
	
	@Min(18)
	private int edad;
	@NotEmpty
	private String descripcion;
	
	private MultipartFile foto;
	@NotEmpty
	private String dni;
	

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	public Persona() {
		//super();
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad
				+ ", descripcion=" + descripcion + ", foto=" + foto + ", dni="
				+ dni + "]";
	}
	public Persona(String nombre, int edad, String descripcion,
			MultipartFile foto, String dni) {
		//super();
		this.nombre = nombre;
		this.edad = edad;
		this.descripcion = descripcion;
		this.foto = foto;
		this.dni = dni;
	}
	public MultipartFile getFoto() {
		return foto;
	}
	public void setFoto(MultipartFile foto) {
		this.foto = foto;
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


}
