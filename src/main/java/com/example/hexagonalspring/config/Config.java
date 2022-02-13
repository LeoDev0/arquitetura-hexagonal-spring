package com.example.hexagonalspring.config;

import com.example.hexagonalspring.adapters.outbound.BuscarEnderecoAdapter;
import com.example.hexagonalspring.adapters.outbound.SalvarUsuarioAdapter;
import com.example.hexagonalspring.application.core.service.SalvarUsuarioService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public SalvarUsuarioService salvarUsuarioService(SalvarUsuarioAdapter salvarUsuarioAdapter, BuscarEnderecoAdapter buscarEnderecoAdapter){
        return new SalvarUsuarioService(salvarUsuarioAdapter, buscarEnderecoAdapter);
    }
}