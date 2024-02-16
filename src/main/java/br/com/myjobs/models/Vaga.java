package br.com.myjobs.models;

// Importações JPA
import jakarta.persistence.*;

// Lombok
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

// Serialização
import java.io.Serial;
import java.io.Serializable;

// Coleções
import java.util.List;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class Vaga implements Serializable {

    // SerialVersionUID para serialização
    @Serial
    private static final long serialVersionUID = 1L;

    // Identificador único da vaga
    @Id // Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Geração automática
    @Column(name = "vaga_id") // Nome da coluna
    private long vagaId;

    @NotEmpty // Validação: não pode ser vazio
    @Column(name = "nome")
    private String nome;

    @NotEmpty
    @Column(name = "descricao")
    private String descricao;

    // Data de abertura da vaga
    @NotEmpty
    @Column(name = "data")
    private String data;

    @NotEmpty
    @Column(name = "salario")
    private String salario;

    // Lista de candidatos associados à vaga
    @OneToMany(mappedBy = "vaga", cascade = CascadeType.REMOVE) // Relacionamento Um-para-Muitos com a entidade Candidato
    private List<Candidato> candidatos;

    // Getters e setters (gerados por Lombok)
}