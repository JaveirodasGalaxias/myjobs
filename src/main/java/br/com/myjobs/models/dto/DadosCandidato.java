package br.com.myjobs.models.dto;

import br.com.myjobs.models.Candidato;

public record DadosCandidato(Long id, String nome, String email, String cpf) {

    public DadosCandidato(Candidato candidato) {
        this(candidato.getId(), candidato.getNome(), candidato.getEmail(), candidato.getCpf());
    }
}
