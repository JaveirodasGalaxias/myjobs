package br.com.myjobs.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotBlank
        String logradouro,
        @NotBlank
        String bairro,
        @NotBlank @Pattern(regexp = "\\d{8}")
        String cep,
        @NotBlank
        String cidade,
        @NotBlank
        String uf,
        String complemento,
        String numero) {

    public DadosEndereco(String rua, String bairro, String cidade, String estado, String number) {
        this(rua, bairro, null, cidade, estado, null, number);
    }
}
