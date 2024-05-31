package servicios;

import java.io.IOException;

public interface FicheroInterfaz {
	
	public void ficheroLog(String txt) throws IOException ;
	
	public void escribirFicheroListadoAlumnos(String ficheroListadoAlumnos) throws IOException;

}
