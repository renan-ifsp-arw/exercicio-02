package br.edu.ifsp.dw2.exercicio02.exceptions.compra;

public class CartaoInvalidoException extends CompraInvalidaException {

    private static final String MESSAGE = "Número do cartão inválido";

    public CartaoInvalidoException() {
        super(MESSAGE);
    }

}
