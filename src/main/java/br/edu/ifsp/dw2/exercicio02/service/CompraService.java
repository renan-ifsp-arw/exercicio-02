package br.edu.ifsp.dw2.exercicio02.service;

import br.edu.ifsp.dw2.exercicio02.exceptions.compra.CartaoInvalidoException;
import br.edu.ifsp.dw2.exercicio02.exceptions.compra.CompraInvalidaException;
import br.edu.ifsp.dw2.exercicio02.exceptions.compra.ValorInvalidoCompraException;
import br.edu.ifsp.dw2.exercicio02.model.Compra;
import br.edu.ifsp.dw2.exercicio02.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompraService {

    @Autowired
    private CompraRepository compraRepository;

    public List<Compra> list() {
        return compraRepository.findAll();
    }

    public Compra save(Compra compra) throws CompraInvalidaException {
        if(compra.getValor().doubleValue() > 1000) {
            throw new ValorInvalidoCompraException();
        }
        else if(!compra.getCartao().getNumero().startsWith("1234")){
            throw new CartaoInvalidoException();
        } else {
            return compraRepository.save(compra);
        }
    }

    public Optional<Compra> findById(Long id) {
        return compraRepository.findById(id);
    }
}
