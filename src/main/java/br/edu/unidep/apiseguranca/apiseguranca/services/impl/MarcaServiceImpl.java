package br.edu.unidep.apiseguranca.apiseguranca.services.impl;

import br.edu.unidep.apiseguranca.apiseguranca.data.MarcaData;
import br.edu.unidep.apiseguranca.apiseguranca.entities.Marca;
import br.edu.unidep.apiseguranca.apiseguranca.framework.CrudService;
import br.edu.unidep.apiseguranca.apiseguranca.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.LocalDateTime;


@Service
public class MarcaServiceImpl extends CrudService<Marca, Long> implements MarcaService {

    @Autowired MarcaData repository;

    @Override
    protected JpaRepository<Marca, Long> data() {
        return repository;
    }

    @Override
    public ResponseEntity<Marca> update(Long id, Marca entity) {
        return repository.findById(id)
                .map(marcaLocal -> {
                    marcaLocal.setNome(entity.getNome());
                    marcaLocal.setAtualizadaEm(LocalDateTime.now(Clock.systemUTC()));
                    repository.save(marcaLocal);
                    return ResponseEntity.ok().body(marcaLocal);
                }).orElse(ResponseEntity.notFound().build());
    }

}
