package com.example.hexagonalspring.application.ports.out;

import com.example.hexagonalspring.application.core.domain.Usuario;

// O salvarUsuario de saída é para salvar num banco de dados, fila, etc.
public interface SalvarUsuarioPort {
    Usuario salvar(Usuario usuario);
}
