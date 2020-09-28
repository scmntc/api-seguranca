package br.edu.unidep.apiseguranca.apiseguranca.controller;

import br.edu.unidep.apiseguranca.apiseguranca.data.ProdutoData;
import br.edu.unidep.apiseguranca.apiseguranca.entities.Produto;
import br.edu.unidep.apiseguranca.apiseguranca.framework.ICrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/produto")
public interface ProdutoController extends ICrudController<Produto, Long> {

   /* @Autowired
    private ProdutoData produtoData;

    @GetMapping
    private List<Produto> findAll() {
        return produtoData.findAll();
    }

    @GetMapping("{id}")
    private Produto findById(@RequestParam("id") Long id) {
        return produtoData.findById(id).orElse(null);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    private void deleteById(@RequestParam("id") Long id) {
        produtoData.deleteById(id);
    }

    @PostMapping
    private Produto save(@RequestBody Produto produto) {
        return produtoData.save(produto);
    }

    @PutMapping
    private Produto update(@RequestParam("id") Long id, @RequestBody Produto produto) {
        Produto produtoLocal = produtoData.findById(id).orElse(null);
        if (produtoLocal != null) {
            produtoLocal.setNome(produto.getNome());
            produtoLocal.setDescricao(produto.getDescricao());
            produtoLocal.setMarca(produto.getMarca());
            produtoLocal.setValor(produto.getValor());
            produtoData.save(produtoLocal);
            return produtoLocal;
        }
        return null;
    }*/
}
