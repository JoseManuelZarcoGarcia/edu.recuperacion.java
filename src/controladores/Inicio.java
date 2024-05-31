package controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.AlumnoDto;
import servicios.*;

public class Inicio {

	public static final String rutaRaizLogs = "C:\\Users\\csi22-jzarcia\\eclipse-workspace\\Workspace-recuperacion-java\\logs\\\\"; // final es para hacerlo constante
	public static final String rutaCompletaLog = rutaRaizLogs.concat(util.Utilidades.construirNombreLog());
	public static final String ficheroAlumno = "C:\\Users\\csi22-jzarcia\\eclipse-workspace\\ficherosAlumnos\\FicheroAlumno.txt";
	public static List<AlumnoDto> listaAlumno = new ArrayList<AlumnoDto>();
	
	public static void main(String[] args) {

		MenuInterfaz mi = new MenuImplementacion();
		FicheroInterfaz fi = new FicheroImplementacion();
		AlumnoInterfaz al = new AlumnoImplementacion();
		Scanner sc = new Scanner(System.in);
		boolean cerrarMenu = false;
		int opcionSeleccionada;
		
		do {
			
			try {
				/* String s = null;
				*  s.length(); // solo para se fallo y comprobar que funcione el try-catch
				*/
				opcionSeleccionada = mi.mostrarMenu(sc);
				switch(opcionSeleccionada)
				{
					case 0:
						fi.ficheroLog("Se ha seleccionado la opcion 0");
						cerrarMenu = true;
						break;
					case 1:
						fi.ficheroLog("Se ha seleccionado la opcion 1");
						al.altaAlumno();
						break;
					case 2:
						fi.ficheroLog("Se ha seleccionado la opcion 2");
						al.bajaAlumno();
						break;
					case 3:
						fi.ficheroLog("Se ha seleccionado la opcion 3");
						fi.escribirFicheroListadoAlumnos(ficheroAlumno);
						//escribir en fichero con toString
						break;
					default:
						fi.ficheroLog("Se ha seleccionado no valida");
						break;
				}
				
			}catch(Exception ex) {
				//System.out.println("ha ocurrido un error");
				try {
					fi.ficheroLog("Ha ocurrido un error en el menu");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
		}while(!cerrarMenu);

	}

	

}
