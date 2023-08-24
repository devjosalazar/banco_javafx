package co.edu.uniquindio.banco.bancouq.viewController;

import co.edu.uniquindio.banco.bancouq.controller.BancoController;
import co.edu.uniquindio.banco.bancouq.controller.service.IBancoControllerService;
import javafx.fxml.FXML;

public class BancoViewController {
    IBancoControllerService bancoControllerService;

    @FXML
    void initialize() {
        bancoControllerService = new BancoController();
    }
}
