package br.edu.ifsp.dw2.exercicio02.repository;

import br.edu.ifsp.dw2.exercicio02.model.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao, Long> {

}
