package br.edu.unidep.apiseguranca.apiseguranca.data;

import br.edu.unidep.apiseguranca.apiseguranca.entities.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaData extends JpaRepository<Marca, Long> {
}
