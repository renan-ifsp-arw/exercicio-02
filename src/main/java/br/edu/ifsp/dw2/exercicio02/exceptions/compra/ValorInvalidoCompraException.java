package br.edu.ifsp.dw2.exercicio02.exceptions.compra;

public class ValorInvalidoCompraException extends Throwable {

    private static final String MESSAGE = "Valor da compra acima de R$ 1000,00";

    public ValorInvalidoCompraException() {
        super(MESSAGE);
    }
}
