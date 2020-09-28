package br.edu.unidep.apiseguranca.apiseguranca.framework;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class CrudController<T, ID extends Long> implements ICrudController<T, ID> {

    public abstract ICrudService<T, ID> service();

    @Override
    @GetMapping
    public List<T> findAll() {
        return service().findAll();
    }

    @Override
    @GetMapping(params = "id")
    public T findById(@RequestParam("id") Long id) {
        return (T) service().findById(id);
    }

    @Override
    @PostMapping
    public T save(T entity) {
        return (T) service().save(entity);
    }

    @Override
    @DeleteMapping
    public void deleteById(Long id) {
        service().deleteById(id);
    }

}
