package com.example.hexagonalspring.application.ports.in;

import com.example.hexagonalspring.application.core.domain.Usuario;

// O salvarUsuario de entrada serve para algo de fora (como um controller) se comunicar com o core
public interface SalvarUsuarioServicePort {
    Usuario salvarUsuario(Usuario usuario, String cep);
}
