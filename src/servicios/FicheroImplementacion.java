package servicios;

import java.io.FileWriter;
import java.io.IOException;

import controladores.Inicio;

public class FicheroImplementacion implements FicheroInterfaz {
	
	public void ficheroLog() throws IOException {
		FileWriter fw = new FileWriter(Inicio.rutaCompletaLog, true);
		fw.write("Error al seleccionar una opciondel en el menu \n");
		fw.close();
	}

}
