package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Compra {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Cartao cartao;
    @OneToOne
    private Cliente cliente;
    @ManyToOne
    private Produto nome;
    private BigDecimal valor;
}
