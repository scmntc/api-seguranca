package br.edu.unidep.apiseguranca.apiseguranca.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.time.LocalDate;
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

    @Column(name = "nome", nullable = false)
    private String nome;

    @OneToOne(mappedBy = "usuario")
    private Carrinho carrinho;

    @Column(name = "dataCadastro")
    private LocalDateTime dataCadastro;

    @Column(name = "password", nullable = false)
    private String password;

    @CPF
    @Column(name = "cpf")
    private String cpf;

    @Email
    @Column(name = "email")
    private String email;

    @Column(name = "datanasc")
    private LocalDate dataNasc;

}
