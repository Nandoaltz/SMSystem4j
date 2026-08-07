package br.com.nandoaltz.smsystem.service;

import br.com.nandoaltz.smsystem.entity.Registros;
import br.com.nandoaltz.smsystem.mapper.RegistroMapper;
import br.com.nandoaltz.smsystem.repository.RegistroRepository;
import br.com.nandoaltz.smsystem.response.RegistroResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class RegistroService {

    private final RegistroRepository registroRepository;

    public Mono<Registros> save(Registros registro){
        return registroRepository.save(registro);
    }

    public Flux<RegistroResponse> getAll(Long id){
        return registroRepository.retornarRegistrosDosVeiculos(id);
    }
}