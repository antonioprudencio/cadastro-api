package com.pebatech.br.cadastro_api.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_endereco")
public class Endereco extends ModeloGenerico {

    private String logradouro;

    @Column(length = 10)
    private String numero;

    private String bairro;

    private String cidade;

    @Column(length = 10)
    private String cep;

    private String complemento;
}
