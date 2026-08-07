package br.com.nandoaltz.smsystem.request;

import br.com.nandoaltz.smsystem.entity.Roles;

public record MotoristaRequest(
        String nome,
        String email,
        String senha,
        Roles role
) {
}