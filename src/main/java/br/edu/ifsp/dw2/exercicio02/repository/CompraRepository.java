package br.edu.ifsp.dw2.exercicio02.repository;

import br.edu.ifsp.dw2.exercicio02.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {
}
