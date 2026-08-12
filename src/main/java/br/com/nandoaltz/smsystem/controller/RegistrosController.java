package br.com.nandoaltz.smsystem.controller;

import br.com.nandoaltz.smsystem.entity.Registros;
import br.com.nandoaltz.smsystem.mapper.RegistroMapper;
import br.com.nandoaltz.smsystem.request.RegistroRequest;
import br.com.nandoaltz.smsystem.response.RegistroResponse;
import br.com.nandoaltz.smsystem.service.RegistroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Sinks;

import java.awt.*;
import java.time.Duration;

@RestController
@RequestMapping("registro")
@RequiredArgsConstructor
@CrossOrigin(originPatterns = "*")
public class RegistrosController {

    private final RegistroService registroService;
    private final RegistroMapper registroMapper;
    private final Sinks.Many<RegistroResponse> sink = Sinks.many().multicast().onBackpressureBuffer();

    @PostMapping("/save")
    public Mono<RegistroResponse> save(@RequestBody RegistroRequest registroRequest){
        Registros motorista = registroMapper.mapToregistroResponse(registroRequest);
        return registroService
                .save(motorista)
                .map(registroMapper::mapToregistroResponse)
                .doOnNext(sink::tryEmitNext);
    }

    @GetMapping(value = "/consult/{id}", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<RegistroResponse> getAll(@PathVariable Long id){

        Flux<RegistroResponse> all = registroService.getAll(id);

        return Flux.merge(all, sink.asFlux().filter(i -> i.idv().equals(id)));
    }
}