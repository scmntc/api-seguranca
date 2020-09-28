package br.edu.unidep.apiseguranca.apiseguranca.services.impl;

import br.edu.unidep.apiseguranca.apiseguranca.data.ProdutoData;
import br.edu.unidep.apiseguranca.apiseguranca.entities.Produto;
import br.edu.unidep.apiseguranca.apiseguranca.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired private ProdutoData produtoData;

    @Override
    public List<Produto> findAll() {
        return produtoData.findAll();
    }

    @Override
    public Produto save(Produto entity) {
        return produtoData.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        produtoData.deleteById(id);
    }

    @Override
    public Produto findById(Long id) {
        return produtoData.findById(id).orElse(null);
    }

    @Override
    public ResponseEntity<Produto> update(Long id, Produto entity) {
        return null;
    }
}
