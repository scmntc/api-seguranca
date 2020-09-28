package br.edu.unidep.apiseguranca.apiseguranca.controller;

import br.edu.unidep.apiseguranca.apiseguranca.data.UsuarioData;
import br.edu.unidep.apiseguranca.apiseguranca.entities.Marca;
import br.edu.unidep.apiseguranca.apiseguranca.entities.Usuario;
import br.edu.unidep.apiseguranca.apiseguranca.framework.ICrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public interface UsuarioController extends ICrudController<Usuario, Long> {

}
