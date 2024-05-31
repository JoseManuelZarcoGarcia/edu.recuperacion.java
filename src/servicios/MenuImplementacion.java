package servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {
	
	public int mostrarMenu(Scanner sc) {
		
		System.out.println("------------------");
		System.out.println("0. cerrar menu");
		System.out.println("1. alta objeto");
		System.out.println("2. baja objeto");
		System.out.println("3. escribir alumno en fichero");
		System.out.println("4. tidavia nada");
		System.out.println("5. tidavia nada");
		System.out.println("------------------");
		int opcionSeleccionada = sc.nextInt();
		
		return opcionSeleccionada;
		
	}

}
