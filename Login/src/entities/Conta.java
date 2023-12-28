package entities;

import java.util.Objects;

public class Conta {
    private String usuario;
    private String senha;

    public Conta(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta usuario1 = (Conta) o;
        return Objects.equals(usuario, usuario1.usuario) && Objects.equals(senha, usuario1.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, senha);
    }
}
