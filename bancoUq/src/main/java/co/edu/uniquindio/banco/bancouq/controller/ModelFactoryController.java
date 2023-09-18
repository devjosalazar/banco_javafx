package co.edu.uniquindio.banco.bancouq.controller;

import co.edu.uniquindio.banco.bancouq.mapping.dto.EmpleadoDto;
import co.edu.uniquindio.banco.bancouq.mapping.mappers.EmpleadoMapper;
import co.edu.uniquindio.banco.bancouq.model.*;
import co.edu.uniquindio.banco.bancouq.exceptions.*;
import co.edu.uniquindio.banco.bancouq.controller.service.IModelFactoryService;
import co.edu.uniquindio.banco.bancouq.utils.BancoUtils;

import java.util.ArrayList;
import java.util.List;

public class ModelFactoryController implements IModelFactoryService {
    Banco banco;
    EmpleadoMapper mapper = EmpleadoMapper.INSTANCE;

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
    public List<EmpleadoDto> obtenerEmpleados() {
        return mapper.getEmpleadosDto(banco.getListaEmpleados());
    }

    @Override
    public boolean agregarEmpleado(EmpleadoDto empleadoDto) {
        try{
            if(!banco.verificarEmpleadoExistente(empleadoDto.cedula())) {
                getBanco().agregarEmpleado(mapper.empleadoDtoToEmpleado(empleadoDto));
            }
            return true;
        }catch (EmpleadoException e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean eliminarEmpleado(String cedula) {
        boolean flagExiste = false;
        try {
            flagExiste = getBanco().eliminarEmpleado(cedula);
        } catch (EmpleadoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flagExiste;
    }

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
