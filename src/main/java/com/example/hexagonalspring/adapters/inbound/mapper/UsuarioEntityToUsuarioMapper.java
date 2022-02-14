package com.example.hexagonalspring.adapters.inbound.mapper;

import com.example.hexagonalspring.adapters.inbound.entity.UsuarioEntity;
import com.example.hexagonalspring.application.core.domain.Usuario;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UsuarioEntityToUsuarioMapper {

    public Usuario mapper(UsuarioEntity usuarioEntity){
        var usuario = new Usuario();
        BeanUtils.copyProperties(usuarioEntity, usuario);
        return usuario;
    }

}
