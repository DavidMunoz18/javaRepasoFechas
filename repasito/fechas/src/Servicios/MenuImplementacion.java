package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {
	
	Scanner sc = new Scanner(System.in);
	@Override
	public int mostrarMenuYSeleccion() {
		
		int opcion;
		System.out.println("#####################################");
		System.out.println("0. Cerrar menu");
		System.out.println("1. Versión empleado");
		System.out.println("2. Versión cliente");
		System.out.println("#####################################");
		opcion = sc.nextInt();
		return opcion;
	}

	@Override
	public int mostrarMenuEmpleado() {
		int opcion;
		System.out.println("#####################################");
		System.out.println("1. Validar cliente");
		System.out.println("2. Borrado de cliente");
		System.out.println("3. Mostrar cliente");
		System.out.println("#####################################");
		opcion = sc.nextInt();
		return opcion;
	
	}

	@Override
	public int mostrarMenuCliente() {
		int opcion;
		System.out.println("#####################################");
		System.out.println("1. Registro cliente");
		System.out.println("2. Acceso cliente(login)");
		System.out.println("#####################################");
		opcion = sc.nextInt();
		return opcion;
	}

}
