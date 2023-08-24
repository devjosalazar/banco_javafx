package co.edu.uniquindio.banco.bancouq.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente extends Persona{

	Empleado empleadoAsociado;
	ArrayList<Cuenta> listCuentasCliente = new ArrayList<Cuenta>();
	
	
	public Cliente() {
		
	}


	public Empleado getEmpleadoAsociado() {
		return empleadoAsociado;
	}


	public void setEmpleadoAsociado(Empleado empleadoAsociado) {
		this.empleadoAsociado = empleadoAsociado;
	}


	public ArrayList<Cuenta> getListCuentasCliente() {
		return listCuentasCliente;
	}


	public void setListCuentasCliente(ArrayList<Cuenta> listCuentasCliente) {
		this.listCuentasCliente = listCuentasCliente;
	}
	
	
	
	

}
