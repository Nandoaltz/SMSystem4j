package br.com.nandoaltz.smsystem.service;

import br.com.nandoaltz.smsystem.entity.Motorista;
import br.com.nandoaltz.smsystem.repository.MotoristaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class MotoristaService {

    private final MotoristaRepository motoristaRepository;

    public Mono<Motorista> save(Motorista motorista){
        return motoristaRepository.save(motorista);
    }
}
