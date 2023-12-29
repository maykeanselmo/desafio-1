import entities.Funcionario;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Funcionario> funcionarios = new HashSet<>();

        System.out.println("Número de funcionarios a ser cadastrados: ");
        double numFuncionarios  = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i< numFuncionarios; i++){

            try {
                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("CFP: ");
                String cpf = sc.next();

                System.out.print("Salário: ");
                double salario = sc.nextDouble();
                sc.nextLine();

                funcionarios.add(new Funcionario(nome,cpf, salario));
                System.out.println("\n");
            }
            catch (IllegalArgumentException | InputMismatchException e){
                System.out.println("Campos inválidos para o funcionário " + (i + 1));

            }

        }

        for (Funcionario f: funcionarios){
            System.out.println(f);
            System.out.println();
        }

        sc.close();
    }
}