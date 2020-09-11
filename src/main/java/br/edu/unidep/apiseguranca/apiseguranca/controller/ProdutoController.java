package br.edu.unidep.apiseguranca.apiseguranca.controller;

import br.edu.unidep.apiseguranca.apiseguranca.data.ProdutoData;
import br.edu.unidep.apiseguranca.apiseguranca.entities.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/produto")
public class ProdutoController {

    @Autowired
    private ProdutoData produtoData;

    @GetMapping
    private List<Produto> findAll() {
        return produtoData.findAll();
    }

    @GetMapping("{id}")
    private Produto findById(@RequestParam("id") Long id) {
        return produtoData.findById(id).orElse(null);
    }
}
