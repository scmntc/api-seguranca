package br.edu.unidep.apiseguranca.apiseguranca.services.impl;

import br.edu.unidep.apiseguranca.apiseguranca.data.CarrinhoProdutoData;
import br.edu.unidep.apiseguranca.apiseguranca.entities.CarrinhoProduto;
import br.edu.unidep.apiseguranca.apiseguranca.framework.CrudService;
import br.edu.unidep.apiseguranca.apiseguranca.framework.ICrudService;
import br.edu.unidep.apiseguranca.apiseguranca.services.CarrinhoProdutoService;
import br.edu.unidep.apiseguranca.apiseguranca.services.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.time.Clock;
import java.time.LocalDateTime;

public class CarrinhoProdutoServiceImpl extends CrudService<CarrinhoProduto, Long> implements CarrinhoProdutoService {

    @Autowired private CarrinhoProdutoData data;

    @Override
    protected JpaRepository<CarrinhoProduto, Long> data() {
        return data;
    }

    @Override
    public ResponseEntity<CarrinhoProduto> update(Long id, CarrinhoProduto entity) {
        return data.findById(id)
                .map(carrinhoProdutoLocal -> {
                    carrinhoProdutoLocal.setProduto(entity.getProduto());
                    carrinhoProdutoLocal.setCarrinho(entity.getCarrinho());
                    carrinhoProdutoLocal.setQuantidadeProduto(entity.getQuantidadeProduto());
                    data.save(carrinhoProdutoLocal);
                    return ResponseEntity.ok().body(carrinhoProdutoLocal);
                }).orElse(ResponseEntity.notFound().build());
    }
}
