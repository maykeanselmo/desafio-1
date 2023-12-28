import entities.Conta;
import entities.Sistema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Sistema sistema = new Sistema();

        // Criando e guardando contas no sistema

        sistema.addConta(new Conta("dw33","s5@rwa"));
        sistema.addConta(new Conta("zathus","dasd86#"));


        System.out.print("Usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Senah: ");
        String senha = sc.nextLine();

        sistema.loginSistema(usuario,senha);

    }
}