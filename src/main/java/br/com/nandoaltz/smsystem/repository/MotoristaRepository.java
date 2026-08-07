package br.com.nandoaltz.smsystem.repository;

import br.com.nandoaltz.smsystem.entity.Motorista;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface MotoristaRepository extends R2dbcRepository<Motorista, Long> {
}
