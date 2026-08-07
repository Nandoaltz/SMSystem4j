package br.com.nandoaltz.smsystem.mapper;

import br.com.nandoaltz.smsystem.entity.Registros;
import br.com.nandoaltz.smsystem.request.RegistroRequest;
import br.com.nandoaltz.smsystem.response.RegistroResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface RegistroMapper {

    RegistroResponse mapToregistroResponse(Registros registros);
    Registros mapToregistroResponse(RegistroRequest registros);

}