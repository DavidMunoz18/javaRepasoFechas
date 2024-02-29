package Servicios;

import java.util.List;

import Dtos.ClienteDto;

public interface ClienteInterfaz {

	
	public void registroCliente(List<ClienteDto> listaClientes);
	
	public void accesoCliente(List<ClienteDto> listaClientes);
}
