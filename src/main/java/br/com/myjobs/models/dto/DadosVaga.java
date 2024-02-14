package br.com.myjobs.models.dto;

public record DadosVaga(Long id, String titulo, String descricao, String requisitos, String salario, String beneficios, String contato, String empresa, DadosEndereco endereco) {

    public DadosVaga(Long id, String titulo, String descricao, String requisitos, String salario, String beneficios, String contato, String empresa, String logradouro, String bairro, String cep, String cidade, String uf, String complemento, String numero) {
        this(id, titulo, descricao, requisitos, salario, beneficios, contato, empresa, new DadosEndereco(logradouro, bairro, cep, cidade, uf, complemento, numero));
    }
}
