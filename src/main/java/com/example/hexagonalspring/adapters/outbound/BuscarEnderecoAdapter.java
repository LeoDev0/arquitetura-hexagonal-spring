package com.example.hexagonalspring.adapters.outbound;

import com.example.hexagonalspring.adapters.outbound.rest.BuscarEnderecoRest;
import com.example.hexagonalspring.application.core.domain.Endereco;
import com.example.hexagonalspring.application.ports.out.BuscarEnderecoPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BuscarEnderecoAdapter implements BuscarEnderecoPort {

    private final BuscarEnderecoRest buscarEnderecoRest;

    @Override
    public Endereco buscar(String cep) {
        var endereco = buscarEnderecoRest.buscar(cep);

        return endereco.getBody();
    }
}