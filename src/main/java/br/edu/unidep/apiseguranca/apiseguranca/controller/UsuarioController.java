package br.edu.unidep.apiseguranca.apiseguranca.controller;

import br.edu.unidep.apiseguranca.apiseguranca.entities.Usuario;
import br.edu.unidep.apiseguranca.apiseguranca.framework.ICrudController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario")
public interface UsuarioController extends ICrudController<Usuario, Long> {

    ResponseEntity<Usuario> update(Long id, Usuario entity);
}
