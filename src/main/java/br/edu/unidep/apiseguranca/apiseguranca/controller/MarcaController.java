package br.edu.unidep.apiseguranca.apiseguranca.controller;

import br.edu.unidep.apiseguranca.apiseguranca.entities.Marca;
import br.edu.unidep.apiseguranca.apiseguranca.framework.ICrudController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/marca")
public interface MarcaController extends ICrudController<Marca, Long> {

    public ResponseEntity<Marca> update(Long id, Marca entity);
}
