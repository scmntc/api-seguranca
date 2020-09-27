package br.edu.unidep.apiseguranca.apiseguranca.framework;

import org.springframework.http.ResponseEntity;


import java.util.List;

public interface ICrudService<T, ID extends Long> {

    List<T> findAll();

    T save(T entity);

    void deleteById(ID id);

    T findById(ID id);

    ResponseEntity<T> update(ID id, T entity);

}
