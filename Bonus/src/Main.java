import entities.Funcionario;

import entities.Funcionario;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Funcionario> funcionarios = new HashSet<>();
        System.out.print("Numero de funcionarios a ser cadastrados: ");
        double numFuncionarios = (double)sc.nextInt();
        sc.nextLine();
        System.out.println();

        for(int i = 0; (double)i < numFuncionarios; ++i) {
            try {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Salário: ");
                double salario = sc.nextDouble();
                sc.nextLine();
                funcionarios.add(new Funcionario(nome, salario));
                System.out.println("\n");
            } catch ( IllegalArgumentException e) {
                System.out.println("\nNome inválido para o funcionário "+ (i + 1));
                System.out.println();
            }
            catch (InputMismatchException e){
                System.out.println("\nSalário inválido para o funcionário " + (i + 1));
                System.out.println();
                sc.nextLine();
            }
        }

        for(Funcionario f : funcionarios) {
            System.out.println(f);
            System.out.println();
        }

        sc.close();
    }
    }
