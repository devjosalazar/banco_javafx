package co.edu.uniquindio.banco.bancouq.model;

import co.edu.uniquindio.banco.bancouq.exceptions.EmpleadoException;
import co.edu.uniquindio.banco.bancouq.mapping.dto.EmpleadoDto;
import co.edu.uniquindio.banco.bancouq.model.services.IBancoService;

import java.util.ArrayList;


public class Banco implements IBancoService {
	private static final long serialVersionUID = 1L;
	ArrayList<Cliente> listaClientes = new ArrayList<>();
	ArrayList<Empleado> listaEmpleados = new ArrayList<>();
	ArrayList<Cuenta> listaCuentas = new ArrayList<>();
	ArrayList<Transaccion> listaTransaccionesAsociadas = new ArrayList<Transaccion>();

	public Banco() {

	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	public ArrayList<Cuenta> getListaCuentas() {
		return listaCuentas;
	}


	public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
		this.listaCuentas = listaCuentas;
	}


	public ArrayList<Transaccion> getListaTransaccionesAsociadas() {
		return listaTransaccionesAsociadas;
	}


	public void setListaTransaccionesAsociadas(ArrayList<Transaccion> listaTransaccionesAsociadas) {
		this.listaTransaccionesAsociadas = listaTransaccionesAsociadas;
	}

	@Override
	public Empleado crearEmpleado(String nombre, String apellido, String cedula, String fechaNacimiento) throws EmpleadoException{
		Empleado nuevoEmpleado = null;
		boolean empleadoExiste = verificarEmpleadoExistente(cedula);
		if(empleadoExiste){
			throw new EmpleadoException("El empleado con cedula: "+cedula+" ya existe");
		}else{
			nuevoEmpleado = new Empleado();
			nuevoEmpleado.setNombre(nombre);
			nuevoEmpleado.setApellido(apellido);
			nuevoEmpleado.setCedula(cedula);
			nuevoEmpleado.setFechaNacimiento(fechaNacimiento);
			getListaEmpleados().add(nuevoEmpleado);
		}
		return nuevoEmpleado;
	}

	public void agregarEmpleado(Empleado nuevoEmpleado) throws EmpleadoException{
		getListaEmpleados().add(nuevoEmpleado);
	}

	@Override
	public boolean actualizarEmpleado(String cedulaActual, Empleado empleado) throws EmpleadoException {
		Empleado empleadoActual = obtenerEmpleado(cedulaActual);
		if(empleadoActual == null)
			throw new EmpleadoException("El empleado a actualizar no existe");
		else{
			empleadoActual.setNombre(empleado.getNombre());
			empleadoActual.setApellido(empleado.getApellido());
			empleadoActual.setCedula(empleado.getCedula());
			empleadoActual.setTelefono(empleado.getTelefono());
			empleadoActual.setCorreo(empleado.getCorreo());
			empleadoActual.setFechaNacimiento(empleado.getFechaNacimiento());
			empleadoActual.setSalario(empleado.getSalario());
			empleadoActual.setCodigo(empleado.getCodigo());
			return true;
		}
	}

	@Override
	public Boolean eliminarEmpleado(String cedula) throws EmpleadoException {
		Empleado empleado = null;
		boolean flagExiste = false;
		empleado = obtenerEmpleado(cedula);
		if(empleado == null)
			throw new EmpleadoException("El empleado a eliminar no existe");
		else{
			getListaEmpleados().remove(empleado);
			flagExiste = true;
		}
		return flagExiste;
	}

	@Override
	public boolean verificarEmpleadoExistente(String cedula) throws EmpleadoException {
		if(empleadoExiste(cedula)){
			throw new EmpleadoException("El empleado con cedula: "+cedula+" ya existe");
		}else{
			return false;
		}
	}


	@Override
	public Empleado obtenerEmpleado(String cedula) {
		Empleado empleadoEncontrado = null;
		for (Empleado empleado : getListaEmpleados()) {
			if(empleado.getCedula().equalsIgnoreCase(cedula)){
				empleadoEncontrado = empleado;
				break;
			}
		}
		return empleadoEncontrado;
	}

	@Override
	public ArrayList<Empleado> obtenerEmpleados() {
		// TODO Auto-generated method stub
		return getListaEmpleados();
	}

	public boolean empleadoExiste(String cedula) {
		boolean empleadoEncontrado = false;
		for (Empleado empleado : getListaEmpleados()) {
			if(empleado.getCedula().equalsIgnoreCase(cedula)){
				empleadoEncontrado = true;
				break;
			}
		}
		return empleadoEncontrado;
	}
}
