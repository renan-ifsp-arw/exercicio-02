package model;

import java.math.BigDecimal;

public interface Operadora {

    boolean autorizar(BigDecimal compra, Cartao cartao);
}
