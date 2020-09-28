package br.edu.unidep.apiseguranca.apiseguranca.controller.impl;

import br.edu.unidep.apiseguranca.apiseguranca.controller.MarcaController;
import br.edu.unidep.apiseguranca.apiseguranca.entities.Marca;
import br.edu.unidep.apiseguranca.apiseguranca.framework.CrudController;
import br.edu.unidep.apiseguranca.apiseguranca.framework.ICrudService;
import br.edu.unidep.apiseguranca.apiseguranca.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/marcas")
public class MarcaControllerImpl extends CrudController<Marca, Long> implements MarcaController {

    @Autowired private MarcaService service;

    @Override
    public ICrudService<Marca, Long> service() {
        return service;
    }
}
