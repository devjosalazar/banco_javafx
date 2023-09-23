package co.edu.uniquindio.banco.bancouq.mapping.dto;

public record EmpleadoDto(
        String nombre,
        String apellido,
        String cedula,
        String telefono,
        String direccion,
        String correo,
        String fechaNacimiento,
        Double salario,
        String codigo) {
}