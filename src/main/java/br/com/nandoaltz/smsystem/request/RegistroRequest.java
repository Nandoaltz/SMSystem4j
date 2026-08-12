package br.com.nandoaltz.smsystem.request;


import br.com.nandoaltz.smsystem.enums.TipoRegistro;

public record RegistroRequest(
        Long motorista,
        Long veiculo,
        Long km,
        TipoRegistro tipoRegistro
) {
}
