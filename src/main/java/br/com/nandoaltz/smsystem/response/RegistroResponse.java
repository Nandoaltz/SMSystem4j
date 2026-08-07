package br.com.nandoaltz.smsystem.response;

import br.com.nandoaltz.smsystem.entity.QuebraKm;
import br.com.nandoaltz.smsystem.entity.TipoRegistro;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

@Builder
public record RegistroResponse(
        String nome,
        TipoRegistro tipoRegistro,
        @JsonFormat(pattern = "dd/mm/yyy")
        LocalDateTime data,
        @JsonFormat(pattern = "HH:MM:ss")
        LocalDateTime horario,
        Long km,
        QuebraKm quebrakm
) {
}
