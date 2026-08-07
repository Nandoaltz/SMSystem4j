package br.com.nandoaltz.smsystem.service;

import br.com.nandoaltz.smsystem.entity.Veiculo;
import br.com.nandoaltz.smsystem.repository.VeiculoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class VeiculoService {

    private final VeiculoRepository veiculoRepository;

    public Mono<Veiculo> save(Veiculo veiculo){
        return veiculoRepository.save(veiculo);
    }
}