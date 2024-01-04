package entities;

import java.util.Objects;

public class Questao {
    private String pergunta;
    private String resposta;

    public Questao(String pergunta, String resposta) throws IllegalArgumentException{
        if (pergunta == null || pergunta.isEmpty() || resposta == null || resposta.isEmpty()) {
            throw new IllegalArgumentException("Pergunta e/ou resposta não podem ser nulas.");
        }
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public Boolean verificaResposta(String resposta)throws IllegalArgumentException{
        if(resposta == null || resposta.isEmpty())
            throw new IllegalArgumentException("Resposta não pode ser nula.");
        String respostaSemEspaco = resposta.replaceAll("\\s", ""); // para conciderar respostas com espaço
        return this.resposta.replaceAll("\\s", "").equalsIgnoreCase(respostaSemEspaco);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Questao questao = (Questao) o;
        return Objects.equals(pergunta, questao.pergunta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pergunta);
    }

    @Override
    public String toString() {
        return "Questao{" +
                "pergunta='" + pergunta + '\'' +
                ", resposta='" + resposta + '\'' +
                '}';
    }
}