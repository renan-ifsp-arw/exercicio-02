package br.edu.ifsp.dw2.exercicio02.repository;

import br.edu.ifsp.dw2.exercicio02.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
