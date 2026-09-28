package com.br.nomes.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.br.nomes.exception.NomeNaoEncontradoException;
import com.br.nomes.repository.NomeRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class NomeService {
    
    private final NomeRepository repository;

    public String cadastrar(String nome){
        if (nome == null || nome.trim().isEmpty()){
            throw new NomeNaoEncontradoException("Nome não pode ser nulo e/ou vazio");
        }
        return repository.salvar(nome.trim());
    }

    public List<String> listar(){
        return repository.buscarTodos();
    }
}