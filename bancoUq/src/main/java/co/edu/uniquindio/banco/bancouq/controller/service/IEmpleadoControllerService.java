package co.edu.uniquindio.banco.bancouq.controller.service;

import co.edu.uniquindio.banco.bancouq.mapping.dto.EmpleadoDto;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public interface IEmpleadoControllerService {
    List<EmpleadoDto> getEmpleados();
}
