package br.edu.unidep.apiseguranca.apiseguranca.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "produto")
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idproduto;

    @Column(name = "nome")
    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idmarca", foreignKey = @ForeignKey(name = "FK_marca_produto"))
    private Marca marca;

    @Column(name = "valor")
    private BigDecimal valor;

    @Column(name = "descricao")
    private String descricao;

}
