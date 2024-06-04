package dtos;

import java.sql.Date;
import java.time.LocalDate;

public class AlumnoDto {
	
	
	//Atributos
    private long idAlumno;
    private String nombre = "aaa";
    private String apellido1 = "aaa";
    private String apellido2 = "aaa";
    private String dni = "aaa";
    private String direccion = "aaa";
    private String telefono = "999999999";
    private String email = "aaa";
    private Date fechaNacimiento = new Date(9999, 12, 31);
    //private Date fchDate = new Date(System.currentTimeMillis());
    
    
    //Getter and Setter
    
    
	public long getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(long idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	

    //Constructores
	
	@Override
	public String toString() {
		String stringFicheroAlumno = getNombre().concat(",").concat(dni).concat(",").concat(telefono).concat(",").concat(fechaNacimiento.toString()).concat("\n");
		return stringFicheroAlumno;
	}

}
