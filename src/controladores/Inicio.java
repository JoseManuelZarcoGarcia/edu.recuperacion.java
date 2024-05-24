package controladores;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import servicios.*;

public class Inicio {

	public static final String rutaRaizLogs = "C:\\Users\\csi22-jzarcia\\eclipse-workspace\\Workspace-recuperacion-java\\logs"; // final es para hacerlo constante
	public static final String nombreLog = "log.txt";
	public static final String rutaCompletaLog = rutaRaizLogs.concat("\\").concat(nombreLog);
	
	public static void main(String[] args) {

		MenuInterfaz mi = new MenuImplementacion();
		FicheroInterfaz fi = new FicheroImplementacion();
		Scanner sc = new Scanner(System.in);
		boolean cerrarMenu = false;
		int opcionSeleccionada;
		
		do {
			
			try {
				String s = null;
				s.length(); // solo para 
				opcionSeleccionada = mi.mostrarMenu(sc);
				switch(opcionSeleccionada)
				{
					case 0:
						cerrarMenu = true;
						break;
					case 1:
						break;
					default:
						break;
				}
				
			}catch(Exception ex) {
				System.out.println("ha ocurrido un error");
				try {
					fi.ficheroLog();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
		}while(!cerrarMenu);

	}

	

}
