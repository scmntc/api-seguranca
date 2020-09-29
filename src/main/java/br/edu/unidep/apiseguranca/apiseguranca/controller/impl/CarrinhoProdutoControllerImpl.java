package br.edu.unidep.apiseguranca.apiseguranca.controller.impl;

import br.edu.unidep.apiseguranca.apiseguranca.controller.CarrinhoProdutoController;
import br.edu.unidep.apiseguranca.apiseguranca.entities.CarrinhoProduto;
import br.edu.unidep.apiseguranca.apiseguranca.framework.CrudController;
import br.edu.unidep.apiseguranca.apiseguranca.framework.ICrudService;
import br.edu.unidep.apiseguranca.apiseguranca.services.CarrinhoProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class CarrinhoProdutoControllerImpl extends CrudController<CarrinhoProduto, Long> implements CarrinhoProdutoController {

    @Autowired private CarrinhoProdutoService service;

    @Override
    public ICrudService<CarrinhoProduto, Long> service() {
        return service;
    }

    @Override
    public ResponseEntity<CarrinhoProduto> update(Long id, CarrinhoProduto entity) {
        return service.update(id, entity);
    }
}
