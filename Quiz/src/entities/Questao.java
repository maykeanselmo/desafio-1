package entities;

import java.util.Objects;

public class Questao {
    private String pergunta;
    private String resposta;

    public Questao(String pergunta, String resposta) throws IllegalArgumentException{
        if (pergunta == null || resposta == null) {
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
        return this.resposta.equalsIgnoreCase(resposta);
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
}
