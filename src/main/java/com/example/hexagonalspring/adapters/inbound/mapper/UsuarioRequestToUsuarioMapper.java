package com.example.hexagonalspring.adapters.inbound.mapper;

import com.example.hexagonalspring.adapters.inbound.request.UsuarioRequest;
import com.example.hexagonalspring.application.core.domain.Usuario;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UsuarioRequestToUsuarioMapper {

    public Usuario mapper(UsuarioRequest usuarioRequest){
        var usuario = new Usuario();
        BeanUtils.copyProperties(usuarioRequest, usuario);
        return usuario;
    }

}
