package br.edu.ifsp.dw2.exercicio02.repository;

import br.edu.ifsp.dw2.exercicio02.model.Operadora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperadoraRepository extends JpaRepository<Operadora, Long> {
}
