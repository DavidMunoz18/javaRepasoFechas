package Servicios;

import java.time.Period;
import java.util.List;
import java.util.Scanner;

import Dtos.ClienteDto;

public class EmpleadoImplementacion implements EmpleadoInterfaz {

	Scanner sc = new Scanner(System.in);

	@Override
	public void validarCliente(List<ClienteDto> listaClientes) {
		for (ClienteDto cliente : listaClientes) {

			if (cliente.isEsValidado() == false) {
				System.out.println("\\\\\\\\\\\\\\\\\\\\");
				
				System.out.println("DNI: " + cliente.getDniCliente());
				System.out.println("NOMBRE: " + cliente.getNombreCliente());
				
				System.out.println("\\\\\\\\\\\\\\\\\\\\");

				System.out.println("Introduce el dni a validar");
				String dni = sc.next();

				if (cliente.getDniCliente().equals(dni)) {

					cliente.setEsValidado(true);
				}
			}
		}

	}

	@Override
	public void borradoCliente(List<ClienteDto> listaClientes) {
		for (ClienteDto cliente : listaClientes) {
			System.out.println("\\\\\\\\\\\\\\\\\\\\");
			
			System.out.println("DNI: " + cliente.getDniCliente());
			System.out.println("NOMBRE: " + cliente.getNombreCliente());
			System.out.println("\\\\\\\\\\\\\\\\\\\\");
			System.out.println("Introduce el dni a borrar");
			String dni = sc.next();

			if (cliente.getDniCliente().equals(dni)) {

				listaClientes.remove(cliente);
				break;
			}

		}

	}

	@Override
	public void mostrarCliente(List<ClienteDto> listaClientes) {
		for (ClienteDto cliente : listaClientes) {
		 
			System.out.println("\\\\\\\\\\\\\\\\\\\\");
			System.out.println("DNI: " + cliente.getDniCliente());
			System.out.println("NOMBRE: " + cliente.getNombreCliente());
			System.out.println("ESTADO VALIDACIÓN :" + cliente.isEsValidado());
			
			Period periodo = Period.between(cliente.getFechaHoy(), cliente.getFechaNac());
			
			System.out.println(periodo);
			
			System.out.println("\\\\\\\\\\\\\\\\\\\\");
		}

	}

	
	/*
	private void calcularEdad(List<ClienteDto> listaClientes) {
		
		
		for(ClienteDto cliente : listaClientes) {
			
			
			Period periodo = Period.between(cliente.getFechaHoy(), cliente.getFechaNac());
			
			
			
			System.out.println(periodo);
			
			
		}
	*/
		

}
	/*
	private void burbuja(List<ClienteDto> listaClientes) {
		
		
		for(int i = 0; listaClientes.size() -1; i++) {
			
			for(int j = 0; listaClientes.size()-1-i ; i++) {
				
				if(listaClientes.get(j).getIdCliente() > listaClientes.get(j + 1 ).getIdCliente()) {
					
					ClienteDto aux = listaClientes.get(j);
					
					listaClientes.set(j, listaClientes.get(j +1));
					
					listaClientes.set(j +1 , aux);
					
					
					
				}
			}
		}
		
		
	}
}*/
