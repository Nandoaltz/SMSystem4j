package br.com.nandoaltz.smsystem.request;


import br.com.nandoaltz.smsystem.enums.Roles;

public record MotoristaRequest(
        String nome,
        String email,
        String senha,
        Roles role
) {
}