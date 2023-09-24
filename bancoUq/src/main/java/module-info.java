module co.edu.uniquindio.banco.bancouq {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires org.mapstruct;

    opens co.edu.uniquindio.banco.bancouq to javafx.fxml;
    exports co.edu.uniquindio.banco.bancouq;
    exports co.edu.uniquindio.banco.bancouq.viewController;
    opens co.edu.uniquindio.banco.bancouq.viewController to javafx.fxml;
    exports co.edu.uniquindio.banco.bancouq.controller;
    exports co.edu.uniquindio.banco.bancouq.mapping.dto;
    exports co.edu.uniquindio.banco.bancouq.mapping.mappers;
    exports co.edu.uniquindio.banco.bancouq.model;
    opens co.edu.uniquindio.banco.bancouq.controller to javafx.fxml;
}