package co.edu.uniquindio.banco.bancouq.controller;

import co.edu.uniquindio.banco.bancouq.controller.service.IEmpleadoControllerService;
import co.edu.uniquindio.banco.bancouq.mapping.dto.EmpleadoDto;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoController implements IEmpleadoControllerService {
    ModelFactoryController modelFactoryController;

    public EmpleadoController(){
        modelFactoryController = ModelFactoryController.getInstance();
    }


    @Override
    public List<EmpleadoDto> getEmpleados() {
        return modelFactoryController.obtenerEmpleados();
    }
}
