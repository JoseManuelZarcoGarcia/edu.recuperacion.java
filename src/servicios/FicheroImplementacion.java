package servicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.Date;
import java.util.Scanner;

import controladores.Inicio;
import dtos.AlumnoDto;

public class FicheroImplementacion implements FicheroInterfaz {
	
	Scanner sc = new Scanner(System.in);
	
	
	public void ficheroLog(String txt) throws IOException {
		try {
			FileWriter fw = new FileWriter(Inicio.rutaCompletaLog, true);
			fw.write(txt.concat("\n"));
			fw.close();
		} catch (IOException ioex) {
			// TODO: handle exception
		}
		
	}
	
	public void escribirFicheroListadoAlumnos(String ficheroListadoAlumnos) throws IOException
	{
		FileWriter sw = null;

	    try
	    {
	        sw = new FileWriter(ficheroListadoAlumnos, true);
	        
	            for(AlumnoDto alumno : controladores.Inicio.listaAlumno)
	            {
	                sw.write(alumno.toString());
	            }
	        
	    }
	    catch (IOException ioex)
	    {
	        //Console.WriteLine(ex.Message);
	    }
	    finally
	    {
	    	if (sw != null)
	    	    sw.close();
	    }
	}
	
	public void cargaInicialListaAlumno() throws IOException 
	{
		try {
			FileWriter fw = new FileWriter(controladores.Inicio.ficheroAlumno, true);
			
            FileReader lector = new FileReader(controladores.Inicio.ficheroAlumno);
            BufferedReader br = new BufferedReader(lector);
            String lineasAlumnos; //meter en bucle
            while((lineasAlumnos=br.readLine()) != null) {
            	
            	AlumnoDto alumno = new AlumnoDto();
            	String[] campos = lineasAlumnos.split(";");
            	
            	alumno.setIdAlumno(util.Utilidades.idAutogeneradoAlumno());
            	
            	alumno.setNombre(campos[0]);
            	
            	alumno.setDni(campos[1]);
            	
            	alumno.setTelefono(campos[2]);
            	
            	alumno.setFechaNacimiento(null);
            	
            	controladores.Inicio.listaAlumno.add(alumno);
            	
            }
            
            // Cerrar el BufferedReader
            br.close();
			
			fw.write("txt".concat("\n"));
			fw.close();
			AlumnoDto nuevoAlumno = new AlumnoDto(); 
			
			
		} catch (IOException ioex) {
			// TODO: handle exception
		}
	}

}
