package br.edu.unidep.apiseguranca.apiseguranca.controller;

import br.edu.unidep.apiseguranca.apiseguranca.data.UsuarioData;
import br.edu.unidep.apiseguranca.apiseguranca.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    UsuarioData usuarioData;

    @GetMapping
    private List<Usuario> findAll() {
        return usuarioData.findAll();
    }

    @GetMapping("{id}")
    private Usuario findById(@RequestParam("id") Long id) {
        return usuarioData.findById(id).orElse(null);
    }

    @PostMapping
    private Usuario save(@RequestBody Usuario usuario) {
        return usuarioData.save(usuario);
    }

}
