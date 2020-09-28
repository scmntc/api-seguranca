package br.edu.unidep.apiseguranca.apiseguranca.services.impl;

import br.edu.unidep.apiseguranca.apiseguranca.data.UsuarioData;
import br.edu.unidep.apiseguranca.apiseguranca.entities.Usuario;
import br.edu.unidep.apiseguranca.apiseguranca.framework.CrudService;
import br.edu.unidep.apiseguranca.apiseguranca.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.LocalDateTime;

@Service
public class UsuarioServiceImpl extends CrudService<Usuario, Long> implements UsuarioService {

    @Autowired private UsuarioData data;

    @Override
    protected JpaRepository<Usuario, Long> data() {
        return data;
    }

    @Override
    public ResponseEntity<Usuario> update(Long id, Usuario entity) {
        return data.findById(id)
                .map(usuarioLocal -> {
                    usuarioLocal.setNome(entity.getNome());
                    usuarioLocal.setEmail(entity.getEmail());
                    usuarioLocal.setCpf(entity.getCpf());
                    data.save(usuarioLocal);
                    return ResponseEntity.ok().body(usuarioLocal);
                }).orElse(ResponseEntity.notFound().build());
    }
}
