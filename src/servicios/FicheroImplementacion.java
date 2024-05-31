package servicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;

import controladores.Inicio;
import dtos.AlumnoDto;

public class FicheroImplementacion implements FicheroInterfaz {
	
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
            BufferedReader bufferedReader = new BufferedReader(lector);
            String lineasAlumnosArray[];
            String AlumnosArray[];
            for (int x=0;bufferedReader.readLine() != null;x++) {
            	/*
            	 * 
            	 * falta el meter archivos y tal
            	 * 
            	 * */
            }
            
            
            // Cerrar el BufferedReader
            bufferedReader.close();
			
			fw.write("txt".concat("\n"));
			fw.close();
			AlumnoDto nuevoAlumno = new AlumnoDto(); 
			
			
		} catch (IOException ioex) {
			// TODO: handle exception
		}
	}

}
