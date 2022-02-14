package com.example.hexagonalspring.adapters.inbound.mapper;

import com.example.hexagonalspring.adapters.inbound.entity.EnderecoEntity;
import com.example.hexagonalspring.application.core.domain.Endereco;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class EnderecoToEnderecoEntityMapper {

    public EnderecoEntity mapper(Endereco endereco){
        var enderecoEntity = new EnderecoEntity();
        BeanUtils.copyProperties(endereco, enderecoEntity);
        return enderecoEntity;
    }


}