package Controladores;

import java.util.ArrayList;
import java.util.List;

import Dtos.ClienteDto;
import Servicios.ClienteImplementacion;
import Servicios.ClienteInterfaz;
import Servicios.EmpleadoImplementacion;
import Servicios.EmpleadoInterfaz;
import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;

public class inicio {

	public static void main(String[] args) {
		
		List<ClienteDto> listaClientes = new ArrayList<ClienteDto>();
		
		EmpleadoInterfaz ei = new EmpleadoImplementacion();
		ClienteInterfaz ci = new ClienteImplementacion();
		MenuInterfaz mi = new MenuImplementacion();
		boolean cerrarMenu = false;
		
		int opcion;
		
		while(!cerrarMenu) {
			opcion = mi.mostrarMenuYSeleccion();
			switch(opcion) {
			
			case 0:
				cerrarMenu = true;
				break;
			case 1:
				int opcionEmpleado = mi.mostrarMenuEmpleado();
				switch(opcionEmpleado) {
				
				case 1:
					ei.validarCliente(listaClientes);
					break;
				case 2:
					ei.borradoCliente(listaClientes);
					break;
				case 3:
					ei.mostrarCliente(listaClientes);
					break;
				}
				break;
			case 2:
				int opcionCliente = mi.mostrarMenuCliente();
				switch(opcionCliente) {
				
				case 1:
					ci.registroCliente(listaClientes);
					break;
				case 2:
					ci.accesoCliente(listaClientes);
					break;
				}
				break;
			}
			
		}

	}

}
