package com.br.nomes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NomeResponseDTO {
    private Long id;
    private String nome;
}