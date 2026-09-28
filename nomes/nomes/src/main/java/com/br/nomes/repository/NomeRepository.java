package com.br.nomes.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Repository
public class NomeRepository {
    private final List<String> nomes = new ArrayList<>();

    public String salvar(String nome){
        nomes.add(nome);
        return nome;
    }

    public List<String> buscarTodos(){
        return nomes;
    }
}