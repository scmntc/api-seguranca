package br.edu.unidep.apiseguranca.apiseguranca.controller;

import br.edu.unidep.apiseguranca.apiseguranca.data.CarrinhoData;
import br.edu.unidep.apiseguranca.apiseguranca.entities.Carrinho;
import br.edu.unidep.apiseguranca.apiseguranca.entities.Marca;
import br.edu.unidep.apiseguranca.apiseguranca.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping("/api/carrinho")
public class CarrinhoController implements Serializable {

    @Autowired private CarrinhoData carrinhoData;

    @GetMapping
    List<Carrinho> findAll() {
        return carrinhoData.findAll();
    }

    @GetMapping("{id}")
    private Carrinho findById(@RequestParam("id") Long id) {
        return carrinhoData.findById(id).orElse(null);
    }

    @PostMapping
    private Carrinho save(@RequestBody Carrinho carrinho) {
        return carrinhoData.save(usuario);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    private void delete(@RequestParam("id") Long id) {
        carrinhoData.deleteById(id);
    }

    @PutMapping
    private Carrinho update(@RequestParam("id") Long id, @RequestBody Carrinho carrinho) {
        Carrinho carrinhoLocal = carrinhoData.findById(id).orElse(null);
        if (carrinhoLocal != null) {
            carrinhoLocal = carrinho;
            carrinhoLocal.setCarrinhoProdutos(carrinho.getCarrinhoProdutos());
            carrinhoData.save(carrinhoLocal);
        }
        return null;
    }
}
