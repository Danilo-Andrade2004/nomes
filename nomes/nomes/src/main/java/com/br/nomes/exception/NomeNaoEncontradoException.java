package com.br.nomes.exception;

public class NomeNaoEncontradoException extends RuntimeException{
    public NomeNaoEncontradoException(String mensagem){
        super(mensagem);
    }
}
