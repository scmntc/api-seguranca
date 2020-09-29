package br.edu.unidep.apiseguranca.apiseguranca.services.impl;

import br.edu.unidep.apiseguranca.apiseguranca.data.CarrinhoData;
import br.edu.unidep.apiseguranca.apiseguranca.entities.Carrinho;
import br.edu.unidep.apiseguranca.apiseguranca.framework.CrudService;
import br.edu.unidep.apiseguranca.apiseguranca.services.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CarrinhoServiceImpl extends CrudService<Carrinho, Long> implements CarrinhoService {

    @Autowired private CarrinhoData data;

    @Override
    protected JpaRepository<Carrinho, Long> data() {
        return data;
    }

    @Override
    public ResponseEntity<Carrinho> update(Long id, Carrinho entity) {
        return data.findById(id)
                .map(carrinhoLocal -> {
                    carrinhoLocal.setCarrinhoProdutos(entity.getCarrinhoProdutos());
                    carrinhoLocal.setFinalizadoEm(entity.getFinalizadoEm());
                    data.save(carrinhoLocal);
                    return ResponseEntity.ok().body(carrinhoLocal);
                }).orElse(ResponseEntity.notFound().build());
    }
}
