package br.edu.unidep.apiseguranca.apiseguranca.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

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

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "idcarrinho", foreignKey = @ForeignKey(name = "fk_carrinho_carrinhoproduto"))
    private Carrinho carrinho;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "idproduto", foreignKey = @ForeignKey(name = "fk_produto_carrinhoproduto"))
    private Produto produto;
}
