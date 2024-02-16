package br.com.myjobs.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class Candidato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    private String cpf;
    @NotEmpty
    private String nomeCandidato;
    @NotEmpty
    private String email;
    @NotEmpty
    private String telefone;


    @ManyToOne
    private Vaga vaga;



}
