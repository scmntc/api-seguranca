package br.edu.unidep.apiseguranca.apiseguranca.controller;

import br.edu.unidep.apiseguranca.apiseguranca.data.CarrinhoProdutoData;
import br.edu.unidep.apiseguranca.apiseguranca.entities.CarrinhoProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carrinhoproduto")
public class CarrinhoProdutoController {

    @Autowired CarrinhoProdutoData carrinhoProdutoData;

    @GetMapping
    private List<CarrinhoProduto> findAll() {
        return carrinhoProdutoData.findAll();
    }

    @GetMapping("{id}")
    private CarrinhoProduto findById(@RequestParam("id") Long id) {
        return carrinhoProdutoData.findById(id).orElse(null);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private CarrinhoProduto save(@RequestBody CarrinhoProduto carrinhoProduto) {
        return carrinhoProdutoData.save(carrinhoProduto);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    private void deleteById(@RequestParam("id") Long id) {
        carrinhoProdutoData.deleteById(id);
    }

    private CarrinhoProduto update(@RequestParam("id") Long id,
                                   @RequestBody CarrinhoProduto carrinhoProdutoAtualizado){
        CarrinhoProduto carrinhoProdutoLocal = carrinhoProdutoData.findById(id).orElse(null);
        if (carrinhoProdutoLocal != null) {
            carrinhoProdutoLocal.setCarrinho(carrinhoProdutoAtualizado.getCarrinho());
            carrinhoProdutoLocal.setQuantidadeProduto(carrinhoProdutoAtualizado.getQuantidadeProduto());
            carrinhoProdutoLocal.setProduto(carrinhoProdutoAtualizado.getProduto());
            return carrinhoProdutoData.save(carrinhoProdutoLocal);
        }
        return null;
    }
}
