package com.br.nomes.exception;

import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(NomeNaoEncontradoException.class)
    public ResponseEntity<Map<String, String>> tratarErro(NomeNaoEncontradoException ex){
        return ResponseEntity
            .status(HttpStatus.BAD_REQUEST)
            .body(Map.of("ERRO",ex.getMessage()));
    }
}
