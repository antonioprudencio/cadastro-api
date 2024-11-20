package com.pebatech.br.cadastro_api.domain.dto;

import com.pebatech.br.cadastro_api.domain.enums.IdentidadeGeneroEnum;
import com.pebatech.br.cadastro_api.domain.model.Endereco;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDto {

    private UUID uuid;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private IdentidadeGeneroEnum identidadeGenero;
    private Endereco endereco;
}
