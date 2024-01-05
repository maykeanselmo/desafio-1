package exceptions;

import java.io.Serial;

public class EstoqueInsuficienteException extends Exception {
    @Serial
    private  static final long serialVersionUID = 1L;

    public EstoqueInsuficienteException(String msg) {
        super(msg);
    }
}
