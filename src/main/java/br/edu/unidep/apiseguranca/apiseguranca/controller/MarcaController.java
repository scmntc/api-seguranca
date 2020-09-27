package br.edu.unidep.apiseguranca.apiseguranca.controller;

import br.edu.unidep.apiseguranca.apiseguranca.entities.Marca;
import br.edu.unidep.apiseguranca.apiseguranca.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping("api/marca")
public class MarcaController implements Serializable {

    @Autowired private MarcaService service;

    @GetMapping
    private List<Marca> findAll() {
        return service.findAll();
    }

    @GetMapping(params = "id")
    private Marca findById(@RequestParam("id") Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Marca save(@RequestBody Marca marca) {
        return service.save(marca);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    private void delete(@RequestParam("id") Long id) {
        service.deleteById(id);
    }

    @PutMapping
    private  ResponseEntity<Marca> update(@RequestParam("id") Long id, @RequestBody Marca marca) {
        return service.update(id, marca);
    }

}
