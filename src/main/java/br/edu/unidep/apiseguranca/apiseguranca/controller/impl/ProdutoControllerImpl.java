package br.edu.unidep.apiseguranca.apiseguranca.controller.impl;

import br.edu.unidep.apiseguranca.apiseguranca.controller.ProdutoController;
import br.edu.unidep.apiseguranca.apiseguranca.entities.Produto;
import br.edu.unidep.apiseguranca.apiseguranca.framework.CrudController;
import br.edu.unidep.apiseguranca.apiseguranca.framework.ICrudService;
import br.edu.unidep.apiseguranca.apiseguranca.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/produto")
public class ProdutoControllerImpl extends CrudController<Produto, Long> implements ProdutoController {

    @Autowired private ProdutoService service;

    @Override
    public ICrudService<Produto, Long> service() {
        return service;
    }

    @Override
    public ResponseEntity<Produto> update(Long id, Produto entity) {
        return service.update(id, entity);
    }
}
