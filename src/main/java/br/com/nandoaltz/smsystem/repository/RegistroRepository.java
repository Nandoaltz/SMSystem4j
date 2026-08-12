package br.com.nandoaltz.smsystem.repository;

import br.com.nandoaltz.smsystem.entity.Registros;
import br.com.nandoaltz.smsystem.response.RegistroResponse;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.query.Param;
import reactor.core.publisher.Flux;

public interface RegistroRepository extends R2dbcRepository<Registros, Long> {
    @Query("""
    select
    v.id as idv,
    u.nome,
    r.tipoRegistro,
    r.dataRegistro as data,
    r.dataRegistro as horario,
    r.km,
    CASE
        WHEN r.tipoRegistro = 'SAIDA'
            AND LAG(r.km) over (PARTITION BY r.veiculo ORDER BY r.dataRegistro) <> r.km
            AND LAG(r.tipoRegistro) over (PARTITION BY r.veiculo ORDER BY r.dataRegistro) = 'CHEGADA'
            THEN 'QUABRA'
        ELSE 'NORMAL'
    END as quebrakm
    from
    Registro r inner join Usuario u
    on r.motorista = u.id
    inner join Veiculo v
    on r.veiculo = v.id
    where v.id = :ID;
    """)
    Flux<RegistroResponse> retornarRegistrosDosVeiculos(@Param("ID") Long id);
}
