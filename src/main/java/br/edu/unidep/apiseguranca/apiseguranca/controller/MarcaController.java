package br.edu.unidep.apiseguranca.apiseguranca.controller;

import br.edu.unidep.apiseguranca.apiseguranca.data.MarcaData;
import br.edu.unidep.apiseguranca.apiseguranca.entities.Marca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping("api/marca")
public class MarcaController implements Serializable {

    @Autowired
    private MarcaData marcaData;

    @GetMapping
    private List<Marca> findAll() {
        return marcaData.findAll();
    }

    @GetMapping("{id}")
    private Marca findById(@RequestParam("id") Long id) {
        return marcaData.findById(id).orElse(null);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Marca save(@RequestBody Marca marca) {
        return marcaData.save(marca);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    private void delete(@RequestParam("id") Long id) {
        marcaData.deleteById(id);
    }

    @PutMapping
    private  Marca update(@RequestParam("id") Long id, @RequestBody Marca marca) {
        Marca marcalocal = marcaData.findById(id).orElse(null);
        if (marcalocal != null) {
            marcalocal = marca;
            marcalocal.setNome(marca.getNome());
            marcaData.save(marcalocal);
        }
        return null;
    }

}
