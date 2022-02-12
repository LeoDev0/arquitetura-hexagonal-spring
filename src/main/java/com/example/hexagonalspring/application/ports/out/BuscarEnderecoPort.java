package com.example.hexagonalspring.application.ports.out;

import com.example.hexagonalspring.application.core.domain.Endereco;

public interface BuscarEnderecoPort {
    Endereco buscar(String cep);
}
