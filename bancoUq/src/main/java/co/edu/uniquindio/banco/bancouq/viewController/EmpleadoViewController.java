package co.edu.uniquindio.banco.bancouq.viewController;

import co.edu.uniquindio.banco.bancouq.controller.EmpleadoController;
import co.edu.uniquindio.banco.bancouq.controller.service.IEmpleadoControllerService;
import co.edu.uniquindio.banco.bancouq.mapping.dto.EmpleadoDto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class EmpleadoViewController {
    EmpleadoController empleadoControllerService;

    ObservableList<EmpleadoDto> listaEmpleadosDto = FXCollections.observableArrayList();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtFechaNacimieno;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtSalario;

    @FXML
    private TextField txtCodigo;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnNuevo;

    @FXML
    private Button btnAgregar;

    @FXML
    private TableView<EmpleadoDto> tableEmpleados;

    @FXML
    private TableColumn<EmpleadoDto, String> tcNombre;

    @FXML
    private TableColumn<EmpleadoDto, String> tcApellido;

    @FXML
    private TableColumn<EmpleadoDto, String> tcCedula;

    @FXML
    private TableColumn<EmpleadoDto, String> tcFechaNacimiento;

    @FXML
    private TableColumn<EmpleadoDto, String> tcTelefono;

    @FXML
    private TableColumn<EmpleadoDto, String> tcCorreo;

    @FXML
    private TableColumn<EmpleadoDto, Double> tcSalario;

    @FXML
    private TableColumn<EmpleadoDto, String> tcCodigo;



    @FXML
    void initialize() {
        empleadoControllerService = new EmpleadoController();
        inicializarView();
    }

    private void inicializarView() {
        getEmpleadosData();
        tableEmpleados.getItems().clear();
        tableEmpleados.setItems(listaEmpleadosDto);
    }

    private void getEmpleadosData() {
        listaEmpleadosDto.addAll(empleadoControllerService.getEmpleados());
    }
}
