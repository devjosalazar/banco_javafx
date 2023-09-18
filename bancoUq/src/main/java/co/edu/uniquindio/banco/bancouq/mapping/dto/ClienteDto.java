package co.edu.uniquindio.banco.bancouq.mapping.dto;

import java.util.List;

public record ClienteDto(
        String nombreCliente,
        String apellido,
        List<CuentaDto> cuentaDtoList
) {
}
