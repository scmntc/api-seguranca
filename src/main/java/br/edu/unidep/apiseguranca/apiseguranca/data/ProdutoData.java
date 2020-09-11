package br.edu.unidep.apiseguranca.apiseguranca.data;

import br.edu.unidep.apiseguranca.apiseguranca.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoData extends JpaRepository<Produto, Long> {
}
