package co.edu.uniquindio.banco.bancouq.viewController;

import co.edu.uniquindio.banco.bancouq.controller.EmpleadoController;
import co.edu.uniquindio.banco.bancouq.controller.service.IEmpleadoControllerService;
import javafx.fxml.FXML;

public class EmpleadoViewController {
    IEmpleadoControllerService empleadoControllerService;

    @FXML
    void initialize() {
        System.out.println("Invocación EmpleadoViewController");
        empleadoControllerService = new EmpleadoController();
    }
}
