package br.edu.unidep.apiseguranca.apiseguranca.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idusuario;

    @Column(name = "nome")
    private String nome;

    @OneToOne(mappedBy = "usuario")
    private Carrinho carrinho;

    @Column(name = "dataCadastro")
    private LocalDateTime dataCadastro;

    @Column(name = "password")
    private String password;

}
