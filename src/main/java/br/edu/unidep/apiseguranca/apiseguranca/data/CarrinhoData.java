package br.edu.unidep.apiseguranca.apiseguranca.data;

import br.edu.unidep.apiseguranca.apiseguranca.entities.Carrinho;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrinhoData extends JpaRepository<Carrinho, Long> {
}
