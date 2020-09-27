package br.edu.unidep.apiseguranca.apiseguranca.framework;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public abstract class CrudService<T, ID extends Long> implements ICrudService<T, ID> {

    protected abstract JpaRepository<T, ID> data();

    @Override
    public List<T> findAll() {
        return (List<T>) data().findAll();
    }

    @Override
    public T save(T entity) {
        return data().save(entity);
    }

    @Override
    public void deleteById(ID id) {
        data().deleteById(id);
    }

    @Override
    public T findById(ID id) {
        return data().findById(id).orElse(null);
    }

    @Override
    public ResponseEntity<T> update(ID id, T entity) {
        return  data().findById(id)
                .map(register -> {
                    register = entity;
                    data().save(register);
                    return ResponseEntity.ok().body(register);
                }).orElse(ResponseEntity.notFound().build());
    }

}
