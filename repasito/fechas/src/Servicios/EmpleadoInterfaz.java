package Servicios;

import java.util.List;

import Dtos.ClienteDto;

public interface EmpleadoInterfaz {

	
	public void validarCliente(List<ClienteDto> listaClientes);
	
	public void borradoCliente(List<ClienteDto> listaClientes);
	
	public void mostrarCliente(List<ClienteDto> listaClientes);
}
