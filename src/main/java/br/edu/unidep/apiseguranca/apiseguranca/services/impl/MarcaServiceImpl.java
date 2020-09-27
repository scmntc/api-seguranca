package br.edu.unidep.apiseguranca.apiseguranca.services.impl;

import br.edu.unidep.apiseguranca.apiseguranca.data.MarcaData;
import br.edu.unidep.apiseguranca.apiseguranca.entities.Marca;
import br.edu.unidep.apiseguranca.apiseguranca.framework.CrudService;
import br.edu.unidep.apiseguranca.apiseguranca.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public class MarcaServiceImpl extends CrudService<Marca, Long> implements MarcaService {

    @Autowired MarcaData repository;

    @Override
    protected JpaRepository<Marca, Long> data() {
        return repository;
    }

   /* @Override
    public List<Marca> findAll() {
        return service.findAll();
    }

    @Override
    public Marca save(Marca entity) {
        entity.setAtualizadaEm(LocalDateTime.now(Clock.systemUTC()));
        return service.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        service.deleteById(id);
    }

    @Override
    public Marca findById(Long id) {
        return service.findById(id).orElse(null);
    }

    @Override
    public ResponseEntity<Marca> update(Long id, Marca entity) {
        return service.findById(id)
                .map(marcaLocal -> {
                    marcaLocal.setNome(entity.getNome());
                    marcaLocal.setAtualizadaEm(LocalDateTime.now(Clock.systemUTC()));
                    service.save(marcaLocal);
                    return ResponseEntity.ok().body(marcaLocal);
                }).orElse(ResponseEntity.notFound().build());
    }*/
}
