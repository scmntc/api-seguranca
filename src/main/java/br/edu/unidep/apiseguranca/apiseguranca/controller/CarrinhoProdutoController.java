package br.edu.unidep.apiseguranca.apiseguranca.controller;

import br.edu.unidep.apiseguranca.apiseguranca.data.CarrinhoProdutoData;
import br.edu.unidep.apiseguranca.apiseguranca.entities.CarrinhoProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/carrinhoproduto")
public class CarrinhoProdutoController {

    @Autowired CarrinhoProdutoData carrinhoProdutoData;

    @GetMapping
    private List<CarrinhoProduto> findAll() {
        return carrinhoProdutoData.findAll();
    }
}
