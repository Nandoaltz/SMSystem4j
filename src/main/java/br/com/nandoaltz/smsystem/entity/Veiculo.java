package br.com.nandoaltz.smsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.annotation.Id;

@EntityScan
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Veiculo {

    @Id
    private Long id;
    private String modelo;
    private String placa;

}