package com.example.hexagonalspring.adapters.inbound;

import com.example.hexagonalspring.adapters.inbound.mapper.UsuarioRequestToUsuarioMapper;
import com.example.hexagonalspring.adapters.inbound.request.UsuarioRequest;
import com.example.hexagonalspring.application.core.domain.Usuario;
import com.example.hexagonalspring.application.ports.in.SalvarUsuarioServicePort;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@AllArgsConstructor
public class UsuarioController {

    private final SalvarUsuarioServicePort salvarUsuarioServicePort;

    private final UsuarioRequestToUsuarioMapper usuarioRequestToUsuarioMapper;

    @PostMapping
    public Usuario salvarUsuario(@RequestBody UsuarioRequest usuarioRequest){
        var usuario = usuarioRequestToUsuarioMapper.mapper(usuarioRequest);
        return salvarUsuarioServicePort.salvarUsuario(usuario, usuarioRequest.getCep());
    }

}