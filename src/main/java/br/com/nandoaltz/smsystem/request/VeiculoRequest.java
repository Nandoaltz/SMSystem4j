package br.com.nandoaltz.smsystem.request;

import lombok.Builder;

@Builder
public record VeiculoRequest(
        String modelo,
        String placa
) {
}
