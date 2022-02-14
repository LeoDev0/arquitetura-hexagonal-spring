package com.example.hexagonalspring.adapters.inbound.mapper;

import com.example.hexagonalspring.adapters.inbound.entity.UsuarioEntity;
import com.example.hexagonalspring.application.core.domain.Usuario;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UsuarioToUsuarioEntityMapper {
    public UsuarioEntity mapper(Usuario usuario){
        var usuarioEntity = new UsuarioEntity();
        BeanUtils.copyProperties(usuario, usuarioEntity);
        return usuarioEntity;
    }

}