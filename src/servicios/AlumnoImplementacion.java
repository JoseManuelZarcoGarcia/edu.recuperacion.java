package servicios;

import java.util.Scanner;

import dtos.AlumnoDto;

public class AlumnoImplementacion implements AlumnoInterfaz {
	
	public void altaAlumno()
	{
		Scanner sc= new Scanner(System.in);
	    do
	    {
	        AlumnoDto nuevoAlumno = new AlumnoDto();
	        
	        long nuevaId = util.Utilidades.idAutogeneradoAlumno();
	        nuevoAlumno.setIdAlumno(nuevaId);

	        System.out.println("Escriba su nombre");
	        String nombreString = sc.next();
	        nuevoAlumno.setNombre(nombreString);

	        System.out.println("Escriba su primer apellido");
	        String apellido1 = sc.next();
	        nuevoAlumno.setApellido1(apellido1);

	        System.out.println("Escriba su segundo apellido");
	        String apellido2 = sc.next();
	        nuevoAlumno.setApellido2(apellido2);

	        System.out.println("Escriba su dni");
	        String dni = sc.next();
	        nuevoAlumno.setDni(dni);

	        System.out.println("Escriba su telefono");
	        String telefono = sc.next();
	        nuevoAlumno.setTelefono(telefono);

	        System.out.println("Escriba su direccion");
	        String direccion = sc.next();
	        nuevoAlumno.setDireccion(direccion);

	        System.out.println("Escriba su email");
	        String email = sc.next();
	        nuevoAlumno.setEmail(email);

	        controladores.Inicio.listaAlumno.add(nuevoAlumno);
	    } while (controladores.Inicio.listaAlumno.size()<3);
	}
	
	
	 public void bajaAlumno()
	 {
	     String salirBajaAlumno = "n";
	     Scanner sc= new Scanner(System.in);
	     do
	     {
	    	 System.out.println("Indique el dni del alumno a borrar ");
	         String dniPedido = sc.next();
	         AlumnoDto alumnoABorrar = new AlumnoDto();

	         for(AlumnoDto alumno : controladores.Inicio.listaAlumno)
	         {
	             if (alumno.getDni().equals(dniPedido))
	             {
	                 alumnoABorrar = alumno;
	                 break;
	             }
	         }
	         /* borramos al alumno fuera del bucle foreach xq si hay 4 alumnos y borramos el 3,
	         * el 4 pasa a ser el 3 y el bucle da error al buscar el 4. 
	         * esto pasa xq el foreach tine un controlador que nosotros no controlamos
	         */
	         controladores.Inicio.listaAlumno.remove(alumnoABorrar);

	         System.out.println("Si quiere seguir borrando alumnos escriba s ");
	         salirBajaAlumno = sc.next();

	     } while (salirBajaAlumno=="s");

	 }
	
}
