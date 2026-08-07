package br.com.nandoaltz.smsystem.controller;

import br.com.nandoaltz.smsystem.entity.Motorista;
import br.com.nandoaltz.smsystem.entity.Registros;
import br.com.nandoaltz.smsystem.mapper.MotoristaMapper;
import br.com.nandoaltz.smsystem.mapper.RegistroMapper;
import br.com.nandoaltz.smsystem.request.RegistroRequest;
import br.com.nandoaltz.smsystem.response.RegistroResponse;
import br.com.nandoaltz.smsystem.service.RegistroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("registro")
@RequiredArgsConstructor
public class RegistrosController {

    private final RegistroService registroService;
    private final RegistroMapper registroMapper;

    @PostMapping("/save")
    public Mono<RegistroResponse> save(@RequestBody RegistroRequest registroRequest){
        Registros motorista = registroMapper.mapToregistroResponse(registroRequest);
        return registroService.save(motorista).map(registroMapper::mapToregistroResponse);
    }

    @GetMapping("/consult/{id}")
    public Flux<RegistroResponse> getAll(@PathVariable Long id){
        return registroService.getAll(id);
    }
}