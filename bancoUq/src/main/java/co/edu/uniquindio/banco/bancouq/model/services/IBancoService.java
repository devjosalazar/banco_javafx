package co.edu.uniquindio.banco.bancouq.model.services;

import co.edu.uniquindio.banco.bancouq.exceptions.EmpleadoException;
import co.edu.uniquindio.banco.bancouq.model.Empleado;

import java.util.ArrayList;


public interface IBancoService {
	public Empleado crearEmpleado(String nombre, String apellido, String cedula, String fechaNacimiento) throws EmpleadoException;
	public Boolean eliminarEmpleado(String cedula)throws EmpleadoException;
	boolean actualizarEmpleado(String cedulaActual, Empleado empleado) throws EmpleadoException;
	public boolean  verificarEmpleadoExistente(String cedula) throws EmpleadoException;
	public Empleado obtenerEmpleado(String cedula);
	public ArrayList<Empleado> obtenerEmpleados();


}
