package br.edu.unidep.apiseguranca.apiseguranca.controller;

import br.edu.unidep.apiseguranca.apiseguranca.data.UsuarioData;
import br.edu.unidep.apiseguranca.apiseguranca.entities.Marca;
import br.edu.unidep.apiseguranca.apiseguranca.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    private void delete(@RequestParam("id") Long id) {
        usuarioData.deleteById(id);
    }

    @PutMapping
    private Usuario update(@RequestParam("id") Long id, @RequestBody Usuario usuario) {
        Usuario usuarioLocal = usuarioData.findById(id).orElse(null);
        if (usuarioLocal != null) {
            usuarioLocal = usuario;
            usuarioLocal.setNome(usuario.getNome());
            usuarioData.save(usuarioLocal);
        }
        return null;
    }

}
