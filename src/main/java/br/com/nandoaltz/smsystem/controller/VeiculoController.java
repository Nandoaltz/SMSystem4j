package br.com.nandoaltz.smsystem.controller;

import br.com.nandoaltz.smsystem.entity.Veiculo;
import br.com.nandoaltz.smsystem.mapper.VeiculoMapper;
import br.com.nandoaltz.smsystem.request.VeiculoRequest;
import br.com.nandoaltz.smsystem.service.VeiculoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("veiculo")
@RequiredArgsConstructor
public class VeiculoController {

    private final VeiculoService veiculoService;
    private final VeiculoMapper veiculoMapper;

    @PostMapping("/save")
    public Mono<Veiculo> saveVeiculo(@RequestBody VeiculoRequest veiculo){
        Veiculo veiculo1 = veiculoMapper.mapToVeiculo(veiculo);
        return veiculoService.save(veiculo1);
    }
}