package exception;

import java.io.Serial;

public class InvalidUserException extends   Exception{

    @Serial
    private  static final long serialVersionUID = 1L;
    public InvalidUserException(){
        super("Usuário inválido");
    }

}