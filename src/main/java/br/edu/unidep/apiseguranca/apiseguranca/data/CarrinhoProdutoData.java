package br.edu.unidep.apiseguranca.apiseguranca.data;

import br.edu.unidep.apiseguranca.apiseguranca.entities.CarrinhoProduto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrinhoProdutoData extends JpaRepository<CarrinhoProduto, Long> {
}
