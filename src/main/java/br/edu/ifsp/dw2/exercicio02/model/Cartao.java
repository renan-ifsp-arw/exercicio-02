package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cartao implements Operadora {

    @Id
    @GeneratedValue
    private Long id;
    private String numero;
    private String nome;

    @Override
    public boolean autorizar(BigDecimal compra, Cartao cartao) {
        return this.nome.startsWith("1234") && compra.doubleValue() < 1000;
    }
}
