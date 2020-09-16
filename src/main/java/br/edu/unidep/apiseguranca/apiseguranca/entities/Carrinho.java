package br.edu.unidep.apiseguranca.apiseguranca.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "carrinho")
@EqualsAndHashCode(of = "idcarrinho")
public class Carrinho implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonBackReference
    @OneToMany(mappedBy = "carrinho")
    private List<CarrinhoProduto> carrinhoProdutos;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idusuario", foreignKey = @ForeignKey(name = "fk_usuario_carrinho"))
    private Usuario usuario;

    @Column(name = "dataCriacao")
    private LocalDateTime dataCriacao;

    @Column(name = "finalizadoEm")
    private LocalDateTime finalizadoEm;
}
