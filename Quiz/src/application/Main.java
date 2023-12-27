package application;

import entities.Questao;
import entities.Quiz;
import entities.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Usuário: ");
        String usuario = sc.nextLine();

        Quiz quiz = new Quiz(new Usuario(usuario));

        quiz.addQuestao(new Questao("2 + 2 ?","4"));
        quiz.addQuestao(new Questao("2 - 2 ?","0"));
        quiz.addQuestao(new Questao("3 * 3 ?","9"));
        quiz.addQuestao(new Questao("Que pais é esse? ?","Brasil"));
        quiz.addQuestao(new Questao("4 - 2 ?","2"));

        for (Questao questao: quiz.getQuestoes()){
            System.out.print(questao.getPergunta()+"  ");
            String resposta = sc.nextLine();
            if (questao.verificaResposta(resposta))
                quiz.getUsuario().addAcerto();
            else
                quiz.getUsuario().addErro();
            System.out.println();
        }

        System.out.println("\n" + quiz.getUsuario().toString());


        sc.close();
    }
}