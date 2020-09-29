package br.edu.unidep.apiseguranca.apiseguranca.controller.impl;

import br.edu.unidep.apiseguranca.apiseguranca.controller.CarrinhoController;
import br.edu.unidep.apiseguranca.apiseguranca.entities.Carrinho;
import br.edu.unidep.apiseguranca.apiseguranca.framework.CrudController;
import br.edu.unidep.apiseguranca.apiseguranca.framework.ICrudService;
import br.edu.unidep.apiseguranca.apiseguranca.services.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/carrinho")
public class CarrinhoControllerImpl extends CrudController<Carrinho, Long> implements CarrinhoController {

    @Autowired private CarrinhoService service;

    @Override
    public ICrudService<Carrinho, Long> service() {
        return service;
    }

    @Override
    public ResponseEntity<Carrinho> update(Long id, Carrinho entity) {
        return service.update(id, entity);
    }
}
