package com.br.nomes.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.br.nomes.dto.NomeRequestDTO;
import com.br.nomes.service.NomeService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/nome")
public class NomeController {
    
    private final NomeService service;

    @PostMapping("/cadastrar")
    public ResponseEntity<String> cadastrar(@RequestBody NomeRequestDTO dto){
        String novoNome = service.cadastrar(dto.getNome());
        return ResponseEntity.status(HttpStatus.CREATED).body(novoNome);
    }

    @GetMapping
    public ResponseEntity<List<String>> listar() {
        return ResponseEntity.ok(service.listar());
    }
}