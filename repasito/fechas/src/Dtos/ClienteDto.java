package Dtos;

import java.time.LocalDate;

public class ClienteDto {
 
	long idCliente;
	String dniCliente = "aaaaa";
	String nombreCliente = "aaaaa";
	String apellido1Cliente = "aaaaa";
	String apellido2Cliente = "aaaaa";
	LocalDate fechaHoy = LocalDate.now();
	LocalDate fechaNac;
	String emailCliente = "aaaaa";
	String contraseniaCliente = "aaaaa";
	boolean esValidado = false;
	
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public String getDniCliente() {
		return dniCliente;
	}
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellido1Cliente() {
		return apellido1Cliente;
	}
	public void setApellido1Cliente(String apellido1Cliente) {
		this.apellido1Cliente = apellido1Cliente;
	}
	public String getApellido2Cliente() {
		return apellido2Cliente;
	}
	public void setApellido2Cliente(String apellido2Cliente) {
		this.apellido2Cliente = apellido2Cliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getContraseniaCliente() {
		return contraseniaCliente;
	}
	public void setContraseniaCliente(String contraseniaCliente) {
		this.contraseniaCliente = contraseniaCliente;
	}
	public boolean isEsValidado() {
		return esValidado;
	}
	public void setEsValidado(boolean esValidado) {
		this.esValidado = esValidado;
	}
	public LocalDate getFechaHoy() {
		return fechaHoy;
	}
	public void setFechaHoy(LocalDate fechaHoy) {
		this.fechaHoy = fechaHoy;
	}
	
	
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	
	public ClienteDto() {
		super();
	}
	public ClienteDto(long idCliente, String dniCliente, String nombreCliente, String apellido1Cliente,
			String apellido2Cliente, LocalDate fechaNac, String emailCliente,
			String contraseniaCliente) {
		super();
		this.idCliente = idCliente;
		this.dniCliente = dniCliente;
		this.nombreCliente = nombreCliente;
		this.apellido1Cliente = apellido1Cliente;
		this.apellido2Cliente = apellido2Cliente;
		
		this.fechaNac = fechaNac;
		this.emailCliente = emailCliente;
		this.contraseniaCliente = contraseniaCliente;
		
	}
	
	
	
}
