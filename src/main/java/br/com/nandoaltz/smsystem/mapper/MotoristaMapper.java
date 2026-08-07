package br.com.nandoaltz.smsystem.mapper;

import br.com.nandoaltz.smsystem.entity.Motorista;
import br.com.nandoaltz.smsystem.request.MotoristaRequest;
import br.com.nandoaltz.smsystem.response.MotoristaResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MotoristaMapper {

    Motorista mapToMorista(MotoristaRequest usuarioRequest);
    MotoristaResponse mapToMotoristaResponse(Motorista motorista);

}