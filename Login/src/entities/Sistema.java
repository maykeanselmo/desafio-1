package entities;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Sistema {
   private Set<Conta> contas = new HashSet<>();


    public Sistema(){

    }

    public Conta criarConta(String usuario, String senha)throws IllegalArgumentException{
        if (usuario == null || usuario.isEmpty() || senha == null || senha.isEmpty()) {
            throw new IllegalArgumentException("Nome de usuário e/ou senha inválidos.");
        }
        return new Conta(usuario,senha);
    }

    public void addConta(Conta conta){
        contas.add(conta);
    }
    public void removeConta(Conta conta){
        contas.remove(conta);
    }
    public boolean validaConta(Conta conta){
        return contas.contains(conta);
    }

    public void loginSistema(String usuario, String senha) {
        if (usuario == null || usuario.isEmpty() || senha == null || senha.isEmpty()) {
            throw new IllegalArgumentException("Nome de usuário e/ou senha inválidos.");
        }
        Conta conta = criarConta(usuario,senha);

        LocalTime horaAtual = LocalTime.now();
        if (validaConta(conta)) {
            int hora = horaAtual.getHour();
            String mensagem = switch (hora) {
                case 0, 1, 2, 3, 4, 5 -> "Bom madrugada, você se logou ao nosso sistema.";
                case 6, 7, 8, 9, 10, 11 -> "Bom dia, você se logou ao nosso sistema.";
                case 12, 13, 14, 15, 16, 17 -> "Boa tarde, você se logou ao nosso sistema.";
                case 18, 19, 20, 21, 22, 23 -> "Boa noite, você se logou ao nosso sistema.";
                default -> "Hora inválida.";
            };

            System.out.println(mensagem);
        }
        else
            System.out.println("Usuário e/ou senha incorretos.");


    }
}

