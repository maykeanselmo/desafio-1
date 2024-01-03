

package entities;

import java.util.IllformedLocaleException;
import java.util.Objects;

public class Conta {
    private String usuario;
    private String senha;

    public Conta(String usuario, String senha) throws IllegalArgumentException {
        if (usuario != null && !usuario.isEmpty() && senha != null && !senha.isEmpty()) {
            this.usuario = usuario;
            this.senha = senha;
        } else {
            throw new IllegalArgumentException("Nome de usuário e/ou senha inválidos.");
        }
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Conta usuario1 = (Conta)o;
            return Objects.equals(this.usuario, usuario1.usuario) && Objects.equals(this.senha, usuario1.senha);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(this.usuario, this.senha);
    }
}

