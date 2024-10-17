package org.kenard.services;

import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import org.kenard.models.Fruta;
import org.kenard.models.InserirFrutaDTO;

import java.util.List;

@ApplicationScoped
public class FrutasService {

    public List<Fruta> list() {
        return Fruta.listAll(Sort.by("nome"));
    }

    @Transactional
    public void novaFruta(InserirFrutaDTO inserirFrutaDTO) {
        Fruta fruta = new Fruta();
        fruta.nome = inserirFrutaDTO.getNome();
        fruta.qtd = inserirFrutaDTO.getQtd();
        fruta.persist();
    }

}