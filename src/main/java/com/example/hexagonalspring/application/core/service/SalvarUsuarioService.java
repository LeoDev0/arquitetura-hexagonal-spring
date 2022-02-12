package com.example.hexagonalspring.application.core.service;

import com.example.hexagonalspring.application.core.domain.Usuario;
import com.example.hexagonalspring.application.ports.in.SalvarUsuarioServicePort;
import com.example.hexagonalspring.application.ports.out.BuscarEnderecoPort;
import com.example.hexagonalspring.application.ports.out.SalvarUsuarioPort;

public class SalvarUsuarioService implements SalvarUsuarioServicePort {

    private final SalvarUsuarioPort salvarUsuarioPort;
    private final BuscarEnderecoPort buscarEnderecoPort;

    public SalvarUsuarioService(SalvarUsuarioPort salvarUsuarioPort, BuscarEnderecoPort buscarEnderecoPort) {
        this.salvarUsuarioPort = salvarUsuarioPort;
        this.buscarEnderecoPort = buscarEnderecoPort;
    }

    @Override
    public Usuario salvarUsuario(Usuario usuario, String cep) {
        var endereco = buscarEnderecoPort.buscar(cep);
        usuario.setEndereco(endereco);
        return salvarUsuarioPort.salvar(usuario);
    }
}
