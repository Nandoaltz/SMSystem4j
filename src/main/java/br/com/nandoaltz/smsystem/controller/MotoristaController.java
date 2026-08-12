package br.com.nandoaltz.smsystem.controller;

import br.com.nandoaltz.smsystem.entity.Motorista;
import br.com.nandoaltz.smsystem.mapper.MotoristaMapper;
import br.com.nandoaltz.smsystem.request.MotoristaRequest;
import br.com.nandoaltz.smsystem.response.MotoristaResponse;
import br.com.nandoaltz.smsystem.service.MotoristaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("motorista")
@RequiredArgsConstructor
public class MotoristaController {

    private final MotoristaService motoristaService;
    private final MotoristaMapper motoristaMapper;

    @PostMapping("/save")
    public Mono<MotoristaResponse> saveMotorista(@RequestBody MotoristaRequest motorista){
        Motorista mot = motoristaMapper.mapToMorista(motorista);
        Mono<MotoristaResponse> map = motoristaService.save(mot).map(entity -> {
            motoristaService.save(entity);
            return motoristaMapper.mapToMotoristaResponse(entity);
        });
        return map;
    }
}