package co.edu.uniquindio.banco.bancouq.model;

import java.util.ArrayList;


public class Cuenta {

	private String numeroCuenta;
	private Double saldo;
	ArrayList<Transaccion> listaTransacciones = new ArrayList<Transaccion>();
	Cliente clienteAsociado;
	
	public Cuenta() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	public ArrayList<Transaccion> getListaTransacciones() {
		return listaTransacciones;
	}

	public void setListaTransacciones(ArrayList<Transaccion> listaTransacciones) {
		this.listaTransacciones = listaTransacciones;
	}

	public Cliente getClienteAsociado() {
		return clienteAsociado;
	}


	public void setClienteAsociado(Cliente clienteAsociado) {
		this.clienteAsociado = clienteAsociado;
	}

	
	
}
