package br.com.nandoaltz.smsystem.request;

import br.com.nandoaltz.smsystem.entity.TipoRegistro;

public record RegistroRequest(
        Long motorista,
        Long veiculo,
        Long km,
        TipoRegistro tipoRegistro
) {
}
