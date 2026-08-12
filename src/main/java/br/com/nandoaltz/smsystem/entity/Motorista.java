package br.com.nandoaltz.smsystem.entity;

import br.com.nandoaltz.smsystem.enums.Roles;
import lombok.*;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@EntityScan
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "usuario")
public class Motorista {

    @Id
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private Roles role;
}