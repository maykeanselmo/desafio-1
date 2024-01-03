package application;

import exceptions.InvalidUserException;
import entities.Questao;
import entities.Quiz;
import entities.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidUserException {

        Scanner sc = new Scanner(System.in);
       try {
           System.out.print("Usuário: ");
           String usuario = sc.nextLine();

           // prenchendo o banco de questões

           Quiz quiz = new Quiz(new Usuario(usuario));
           quiz.addQuestao(new Questao("2 + 2?", "4"));
           quiz.addQuestao(new Questao("2 - 2?", "0"));
           quiz.addQuestao(new Questao("3 * 3?", "9"));
           quiz.addQuestao(new Questao("Capital de MG: ", "Belo Horizonte"));
           quiz.addQuestao(new Questao("4 - 2?", "2"));


           boolean sair = false;

           do {

               System.out.println("---------------------------------------------");
               System.out.println("1) Responder Quiz");
               System.out.println("2) Adicionar perguntas");
               System.out.println("3) Sair");
               System.out.print("\nOpção: ");
               int opcao = sc.nextInt();
               sc.nextLine();


               switch (opcao) {
                   case 1 -> {
                       System.out.println();
                       for (Questao questao : quiz.getQuestoes()) {
                           System.out.print(questao.getPergunta() + "  ");
                           String resposta = sc.nextLine();
                           if (questao.verificaResposta(resposta))
                               quiz.getUsuario().addAcerto();
                           else
                               quiz.getUsuario().addErro();
                           System.out.println();
                       }
                       System.out.println("\n" + quiz.getUsuario().toString());
                       System.out.println("\n");
                   }
                   case 2 -> {
                       quiz.adicionarPerguntas(sc);
                   }
                   case 3 -> {
                       System.out.println("Saindo...");
                       sair = true;
                   }
               }
           } while (!sair);
       }
       catch (IllegalArgumentException e){
           System.out.println("Pergunta e/ou resposta não podem ser nulas.");
           e.printStackTrace();
       }
       catch (InvalidUserException e){
           System.out.println(e.getMessage());
           e.printStackTrace();
       }
       catch (Exception e){
           System.out.println("Erro desconhecido");
           e.printStackTrace();
       }
        finally {
           sc.close();
       }
       }

}