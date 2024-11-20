package com.pebatech.br.cadastro_api.domain.model;

import com.pebatech.br.cadastro_api.domain.enums.IdentidadeGeneroEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_pessoa")
public class Pessoa extends ModeloGenerico {

    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf", length = 14)
    private String cpf;

    @Column(name = "data_nascimento", length = 50)
    private LocalDate dataNascimento;

    @Column(name = "identidade_genero", length = 50)
    @Enumerated(EnumType.STRING)
    private IdentidadeGeneroEnum identidadeGenero;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
}

