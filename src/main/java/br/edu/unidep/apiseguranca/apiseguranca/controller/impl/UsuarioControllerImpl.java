package br.edu.unidep.apiseguranca.apiseguranca.controller.impl;

import br.edu.unidep.apiseguranca.apiseguranca.controller.UsuarioController;
import br.edu.unidep.apiseguranca.apiseguranca.entities.Usuario;
import br.edu.unidep.apiseguranca.apiseguranca.framework.CrudController;
import br.edu.unidep.apiseguranca.apiseguranca.framework.ICrudService;
import br.edu.unidep.apiseguranca.apiseguranca.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/usuario")
public class UsuarioControllerImpl extends CrudController<Usuario, Long> implements UsuarioController {

    @Autowired private UsuarioService service;

    @Override
    public ICrudService<Usuario, Long> service() {
        return service;
    }

    @Override
    @PutMapping
    public ResponseEntity<Usuario> update(Long id, Usuario entity) {
        return service.update(id, entity);
    }
}
