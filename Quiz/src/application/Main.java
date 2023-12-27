package application;

import entities.Questao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Questao q1 = new Questao("Que país é esse?", "Brasil");

        Scanner sc = new Scanner(System.in);
        System.out.println(q1.getPergunta());
        System.out.print("Resposta: ");
        String resposta = sc.nextLine();

        if (q1.verificaResposta(resposta))
            System.out.println("Certa resposta!");
        else
            System.out.println("Errado :( ");

    }
}