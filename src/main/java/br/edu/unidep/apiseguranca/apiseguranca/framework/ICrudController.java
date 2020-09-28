package br.edu.unidep.apiseguranca.apiseguranca.framework;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ICrudController<T, ID extends Long> {

    @GetMapping
    List<T> findAll();

    @GetMapping(params = "id")
    T findById(@RequestParam("id") Long id);

    @PostMapping
    T save(@RequestBody T entity);

    @DeleteMapping
    void deleteById(@RequestParam("id") Long id);

    @PutMapping
    ResponseEntity<T> update(@RequestParam("id") Long id,
                             @RequestBody T entity);
}
