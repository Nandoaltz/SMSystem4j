package br.com.nandoaltz.smsystem.response;


import br.com.nandoaltz.smsystem.enums.Roles;

public record MotoristaResponse(
        Long id,
        String nome,
        String email,
        Roles role
) {
}