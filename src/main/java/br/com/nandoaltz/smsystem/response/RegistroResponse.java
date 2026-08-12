package br.com.nandoaltz.smsystem.response;

import br.com.nandoaltz.smsystem.enums.QuebraKm;
import br.com.nandoaltz.smsystem.enums.TipoRegistro;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record RegistroResponse(
        Long idv,
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