package com.example.hexagonalspring.adapters.inbound.entity;

import com.example.hexagonalspring.application.core.domain.Endereco;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "endereco")
@Getter
@Setter
public class EnderecoEntity extends Endereco {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private Long id;
}