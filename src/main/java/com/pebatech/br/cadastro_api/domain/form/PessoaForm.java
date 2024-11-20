package com.pebatech.br.cadastro_api.domain.form;

import com.pebatech.br.cadastro_api.domain.enums.IdentidadeGeneroEnum;
import com.pebatech.br.cadastro_api.domain.model.Endereco;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class PessoaForm {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private IdentidadeGeneroEnum identidadeGenero;
    private Endereco endereco;
}
