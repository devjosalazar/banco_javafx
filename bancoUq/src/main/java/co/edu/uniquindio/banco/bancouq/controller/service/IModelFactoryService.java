package co.edu.uniquindio.banco.bancouq.controller.service;

import co.edu.uniquindio.banco.bancouq.model.Empleado;

import java.util.ArrayList;


public interface IModelFactoryService {
	Empleado crearEmpleado(String nombre, String apellido, String cedula, String fechaNacimiento);
	Boolean eliminarEmpleado(String cedula);
	Empleado obtenerEmpleado(String cedula);
	ArrayList<Empleado> obtenerEmpleados();
	boolean actualizarEmpleado(String cedulaActual, String nombre, String apellido, String cedula, String fechaNacimiento);
}
