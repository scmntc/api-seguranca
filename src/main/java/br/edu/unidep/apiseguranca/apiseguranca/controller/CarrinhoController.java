package br.edu.unidep.apiseguranca.apiseguranca.controller;

import br.edu.unidep.apiseguranca.apiseguranca.entities.Carrinho;
import br.edu.unidep.apiseguranca.apiseguranca.framework.ICrudController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


public interface CarrinhoController extends ICrudController<Carrinho, Long> {

    @PutMapping
    ResponseEntity<Carrinho> update(@RequestParam("id") Long id, @RequestBody Carrinho carrinho);
}
