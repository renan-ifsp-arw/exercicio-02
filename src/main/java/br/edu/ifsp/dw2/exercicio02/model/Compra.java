package br.edu.ifsp.dw2.exercicio02.model;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Cartao cartao;
    @OneToOne
    private Cliente cliente;
    @ManyToOne
    private Produto produto;
    private BigDecimal valor;
}
