
import entities.Conta;
import entities.Sistema;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Sistema sistema = new Sistema();

            // Enchendo a base de usuários

            sistema.addConta(new Conta("dw33", "s5@rwa"));
            sistema.addConta(new Conta("zathus", "dasd86#"));
            sistema.addConta(new Conta("dyt44", "sakgd&"));


            boolean sair = false;
            do {
                System.out.println("1) Login");
                System.out.println("2) Cadastrar conta");
                System.out.println("3) Sair");
                System.out.print("Opção: ");
                int opcao = sc.nextInt();
                sc.nextLine();


                switch (opcao) {
                    case 1 -> {
                        System.out.print("\nUsuario: ");
                        String usuario = sc.nextLine();
                        System.out.print("Senha: ");
                        String senha = sc.nextLine();
                        System.out.println();
                        sistema.loginSistema(usuario, senha);
                        sair = true;
                    }
                    case 2 -> {
                        System.out.print("\nUsuario: ");
                        String usuarioCad = sc.nextLine();
                        System.out.print("Senha: ");
                        String senhaCad = sc.nextLine();
                        System.out.println();
                        sistema.addConta(new Conta(usuarioCad, senhaCad));
                    }
                    case 3 -> {
                        System.out.println("Saindo...");
                        sair = true;
                    }
                }
            } while (!sair);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Saindo...");
        } catch (Exception e) {
            System.out.println("Erro desconhecido");
        }
    }
}