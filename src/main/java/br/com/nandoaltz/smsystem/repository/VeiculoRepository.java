package br.com.nandoaltz.smsystem.repository;

import br.com.nandoaltz.smsystem.entity.Veiculo;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface VeiculoRepository extends R2dbcRepository<Veiculo, Long> {
}
