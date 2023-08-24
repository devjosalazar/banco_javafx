package co.edu.uniquindio.banco.bancouq.controller;

import co.edu.uniquindio.banco.bancouq.controller.service.IEmpleadoControllerService;

public class EmpleadoController implements IEmpleadoControllerService {
    ModelFactoryController modelFactoryController;

    public EmpleadoController(){
        System.out.println("Llamando al singleton desde EmpleadoServiceController");
        modelFactoryController = ModelFactoryController.getInstance();
    }
}
