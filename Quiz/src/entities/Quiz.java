package entities;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Quiz {

    private Usuario usuario;
    private Set<Questao> questoes = new HashSet<>();

    public Quiz(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Set<Questao> getQuestoes() {
        return questoes;
    }

    public void addQuestao(Questao questao){
        questoes.add(questao);

    }
    public void adicionarPerguntas(Scanner scanner)throws IllegalArgumentException {
        System.out.print("Quantas perguntas quer adicionar? ");
        int numPerguntas = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numPerguntas; i++) {
            System.out.print("Pergunta: ");
            String pergunta = scanner.nextLine();
            System.out.print("Resposta: ");
            String resposta = scanner.nextLine();
            this.addQuestao(new Questao(pergunta, resposta));
        }

    }

    public void  removeQuestao(Questao questao){
        questoes.remove(questao);
    }


}