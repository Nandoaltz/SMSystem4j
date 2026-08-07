package br.com.nandoaltz.smsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;

@EntityScan
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "Registro")
public class Registros {

    @Id
    private Long id;
    private Long motorista;
    private Long veiculo;
    @Column("tipoRegistro")
    private TipoRegistro tipoRegistro;
    @Column("dataRegistro")
    private LocalDateTime dataRegistro;
    @Column("quebrakm")
    private QuebraKm quebrakm;
    private Long km;
}