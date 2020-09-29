package br.edu.unidep.apiseguranca.apiseguranca.controller;

import br.edu.unidep.apiseguranca.apiseguranca.data.CarrinhoProdutoData;
import br.edu.unidep.apiseguranca.apiseguranca.entities.CarrinhoProduto;
import br.edu.unidep.apiseguranca.apiseguranca.framework.ICrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carrinhoproduto")
public interface CarrinhoProdutoController extends ICrudController<CarrinhoProduto, Long> {
    
}
