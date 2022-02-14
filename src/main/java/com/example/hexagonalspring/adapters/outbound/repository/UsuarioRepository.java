package com.example.hexagonalspring.adapters.outbound.repository;

import com.example.hexagonalspring.adapters.inbound.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}