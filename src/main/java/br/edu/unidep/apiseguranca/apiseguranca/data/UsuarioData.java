package br.edu.unidep.apiseguranca.apiseguranca.data;

import br.edu.unidep.apiseguranca.apiseguranca.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioData extends JpaRepository<Usuario, Long> {
}
