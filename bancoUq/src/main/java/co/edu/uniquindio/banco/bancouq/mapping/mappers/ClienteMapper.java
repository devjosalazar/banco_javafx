package co.edu.uniquindio.banco.bancouq.mapping.mappers;

import co.edu.uniquindio.banco.bancouq.mapping.dto.ClienteDto;
import co.edu.uniquindio.banco.bancouq.model.Cliente;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ClienteMapper {

    @Mapping(target = "nombreCliente", source = "cliente.nombre")
    @IterableMapping(qualifiedByName = "cunetaToCuentaDto")
    ClienteDto clienteToClienteDto(Cliente cliente);


}
