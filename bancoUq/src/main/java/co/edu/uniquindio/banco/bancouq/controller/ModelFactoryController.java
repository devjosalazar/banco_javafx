package co.edu.uniquindio.banco.bancouq.controller;

import co.edu.uniquindio.banco.bancouq.model.*;
import co.edu.uniquindio.banco.bancouq.exceptions.*;
import co.edu.uniquindio.banco.bancouq.controller.service.IModelFactoryService;
import co.edu.uniquindio.banco.bancouq.utils.BancoUtils;

import java.util.ArrayList;

public class ModelFactoryController implements IModelFactoryService {
    Banco banco;

    //------------------------------  Singleton ------------------------------------------------
    // Clase estatica oculta. Tan solo se instanciara el singleton una vez
    private static class SingletonHolder {
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }

    // Método para obtener la instancia de nuestra clase
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    public ModelFactoryController() {
        System.out.println("invocación clase singleton");
        cargarDatosBase();
    }

    private void cargarDatosBase() {
        banco = BancoUtils.inicializarDatos();
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    @Override
    public Empleado crearEmpleado(String nombre, String apellido, String cedula, String fechaNacimiento) {
        Empleado empleado = null;
        try {
            empleado = getBanco().crearEmpleado(nombre, apellido, cedula, fechaNacimiento);
        } catch (EmpleadoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return empleado;
    }

    @Override
    public Boolean eliminarEmpleado(String cedula) {
        boolean flagExiste = false;
        try {
            flagExiste = getBanco().eliminarEmpleado(cedula);
        } catch (EmpleadoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flagExiste;
    }

    @Override
    public Empleado obtenerEmpleado(String cedula) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<Empleado> obtenerEmpleados() {
//		getBanco().getListaEmpleados();
        return getBanco().obtenerEmpleados();
    }

    @Override
    public boolean actualizarEmpleado(String cedulaActual, String nombre, String apellido, String cedula,
                                      String fechaNacimiento) {
        boolean flagExiste = false;
        try {
            flagExiste = getBanco().actualizarEmpleado(cedulaActual, nombre, apellido, cedula, fechaNacimiento);
        } catch (EmpleadoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flagExiste;
    }



}
