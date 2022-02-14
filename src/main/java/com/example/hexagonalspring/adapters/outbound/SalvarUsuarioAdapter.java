package com.example.hexagonalspring.adapters.outbound;

import com.example.hexagonalspring.adapters.inbound.mapper.EnderecoToEnderecoEntityMapper;
import com.example.hexagonalspring.adapters.inbound.mapper.UsuarioEntityToUsuarioMapper;
import com.example.hexagonalspring.adapters.inbound.mapper.UsuarioToUsuarioEntityMapper;
import com.example.hexagonalspring.adapters.outbound.repository.UsuarioRepository;
import com.example.hexagonalspring.application.core.domain.Usuario;
import com.example.hexagonalspring.application.ports.out.SalvarUsuarioPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@AllArgsConstructor
public class SalvarUsuarioAdapter implements SalvarUsuarioPort {

    private final UsuarioRepository usuarioRepository;

    private final UsuarioToUsuarioEntityMapper usuarioToUsuarioEntityMapper;

    private final UsuarioEntityToUsuarioMapper usuarioEntityToUsuarioMapper;

    private final EnderecoToEnderecoEntityMapper enderecoToEnderecoEntityMapper;

    @Override
    @Transactional
    public Usuario salvar(Usuario usuario) {
        var usuarioEntity = usuarioToUsuarioEntityMapper.mapper(usuario);
        var enderecoEntity = enderecoToEnderecoEntityMapper.mapper(usuario.getEndereco());

        usuarioEntity.setEndereco(enderecoEntity);
        var usuarioSalvo = usuarioRepository.save(usuarioEntity);

        usuarioEntity.setId(usuarioSalvo.getId());
        usuarioEntity.getEndereco().setId(usuarioSalvo.getEndereco().getId());

        return usuarioEntityToUsuarioMapper.mapper(usuarioEntity);
    }
}