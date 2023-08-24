package co.edu.uniquindio.banco.bancouq.services;

import co.edu.uniquindio.banco.bancouq.model.Empleado;

import java.util.ArrayList;


public interface IModelFactoryService {
	public Empleado crearEmpleado(String nombre, String apellido, String cedula, String fechaNacimiento);
	public Boolean eliminarEmpleado(String cedula);
	public Empleado obtenerEmpleado(String cedula);
	public ArrayList<Empleado> obtenerEmpleados();
	boolean actualizarEmpleado(String cedulaActual, String nombre, String apellido, String cedula, String fechaNacimiento);
}
