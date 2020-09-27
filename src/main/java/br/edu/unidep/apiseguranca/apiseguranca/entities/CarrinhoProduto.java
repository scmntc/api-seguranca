package br.edu.unidep.apiseguranca.apiseguranca.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Clock;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "carrinhoproduto")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idcarrinhoproduto")
public class CarrinhoProduto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcarrinhoproduto;

    @JsonManagedReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idcarrinho", foreignKey = @ForeignKey(name = "fk_carrinho_carrinhoproduto"))
    private Carrinho carrinho;

    @JsonManagedReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idproduto", foreignKey = @ForeignKey(name = "fk_produto_carrinhoproduto"))
    private Produto produto;

    @Column(name = "qtdproduto")
    private Integer quantidadeProduto;

    @Column(name = "dataCriacao")
    private LocalDateTime dataCriacao;

    @PrePersist
    void generateDate() {
        this.dataCriacao = LocalDateTime.now(Clock.systemUTC());
    }
}
