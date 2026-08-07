package br.com.nandoaltz.smsystem.response;

import br.com.nandoaltz.smsystem.entity.Roles;

public record MotoristaResponse(
        Long id,
        String nome,
        String email,
        Roles role
) {
}