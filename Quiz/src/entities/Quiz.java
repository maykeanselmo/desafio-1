package entities;

import java.util.HashSet;
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
    public void  removeQuestao(Questao questao){
        questoes.remove(questao);
    }


}
