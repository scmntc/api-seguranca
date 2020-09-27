package br.edu.unidep.apiseguranca.apiseguranca.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Clock;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "marca")
@EqualsAndHashCode(of = "idmarca")
public class Marca implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idmarca;

    @Column(name = "nome")
    private String nome;

    @Column(name = "criadaEm")
    private LocalDateTime criadaEm;

    @Column(name = "atualizadaEm")
    private LocalDateTime atualizadaEm;

    @PrePersist
    public void preSave() {
        this.criadaEm = LocalDateTime.now(Clock.systemUTC());
    }
}
