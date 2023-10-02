package co.edu.uniquindio.banco.bancouq.model;

import java.io.Serializable;

public class Transaccion implements Serializable {

	private static final long serialVersionUID = 1L;
	private String fecha;
	private String hora;
	private Double valor;
	
	public Transaccion() {
		// TODO Auto-generated constructor stub
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
