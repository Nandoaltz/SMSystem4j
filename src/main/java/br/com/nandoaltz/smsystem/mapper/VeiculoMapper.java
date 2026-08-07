package br.com.nandoaltz.smsystem.mapper;

import br.com.nandoaltz.smsystem.entity.Veiculo;
import br.com.nandoaltz.smsystem.request.VeiculoRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VeiculoMapper {

    Veiculo mapToVeiculo(VeiculoRequest veiculoRequest);

}
