package br.com.nandoaltz.smsystem.response;

import br.com.nandoaltz.smsystem.entity.QuebraKm;
import br.com.nandoaltz.smsystem.entity.TipoRegistro;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record RegistroResponse(
        String nome,
        TipoRegistro tipoRegistro,
        @JsonFormat(pattern = "dd/MM/yyyy")
        LocalDateTime data,
        @JsonFormat(pattern = "HH:mm:ss")
        LocalDateTime horario,
        Long km,
        QuebraKm quebrakm
) {
}