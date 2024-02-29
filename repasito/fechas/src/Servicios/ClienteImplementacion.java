package Servicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import Dtos.ClienteDto;

public class ClienteImplementacion implements ClienteInterfaz {

	Scanner sc = new Scanner(System.in);
	@Override
	
	public void registroCliente(List<ClienteDto> listaClientes) {
		
		DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Introduce el id");
		Long id = idIterativo(listaClientes);
		
		System.out.println("Introduce el dni");
		String dniCliente = sc.next();
		
		
		
		System.out.println("Introduce el nombre");
		String nombre = sc.next();
		
		System.out.println("Introduce el apellido 1");
		String apellido1 = sc.next();
		
		System.out.println("Introduce el apellido 2");
		String apellido2 = sc.next();
		
		System.out.println("Introduce la fecha de nacimiento");
		LocalDate fechaNac = LocalDate.parse(sc.next(), Formatter);
		
		System.out.println("Introduce el email");
		String email = sc.next();
		
		System.out.println("Introduce la contraseña");
		String contrasenia = sc.next();
		
		ClienteDto nuevocliente = new ClienteDto(id, dniCliente, nombre, apellido1, apellido2, fechaNac, email, contrasenia);
		
		listaClientes.add(nuevocliente);
	}
	@Override
	public void accesoCliente(List<ClienteDto> listaClientes) {
		
		
		
		for(ClienteDto cliente : listaClientes) {
			
		if(listaClientes.size() > 0 && cliente.isEsValidado() == true) {
			System.out.println("Introduce el email");
		String email = sc.next();
		
		System.out.println("Introduce la contraseña");
		String contrasenia = sc.next();
		
		
			
			if(cliente.getEmailCliente().equals(email) && cliente.getContraseniaCliente().equals(contrasenia)) {
				
				System.out.println("INICIO DE SESION CORRECTO");
			}
			
			
		}
		}
		
		
	}
	
	private long idIterativo(List<ClienteDto> listaClientes) {

		long id;

		int tamanioLista = listaClientes.size();

		if (tamanioLista == 0) {

			id = 1;
		} else {
			id = listaClientes.get(tamanioLista - 1).getIdCliente() + 1;
		}
		return id;
	}

}
