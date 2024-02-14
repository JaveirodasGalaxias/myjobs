package br.com.myjobs.repository;

import br.com.myjobs.models.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VagaRepository extends JpaRepository<Vaga, Long> {

}
