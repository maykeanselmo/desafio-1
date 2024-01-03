package entities;

import java.util.Objects;

public class Usuario {
    private String usuario;
    private Integer acertos = 0;
    private Integer erros = 0;

    public Integer getAcertos() {
        return acertos;
    }

    public Integer getErros() {
        return erros;
    }


    public Usuario(String usuario) throws InvalidUserException {
        if(usuario == null || usuario.isEmpty())
            throw new InvalidUserException();
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) throws IllegalArgumentException {
        if(usuario == null || usuario.isEmpty())
            throw new IllegalArgumentException("Usuário inválido");
        this.usuario = usuario;
    }

    public void addAcerto(){
        this.acertos++;
    }
    public void addErro(){
        this.erros++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario1 = (Usuario) o;
        return Objects.equals(usuario, usuario1.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario);
    }

    @Override
    public String toString() {
        return "Usuário: " + getUsuario() +
                "\nAcertos: " + getAcertos() +
                "\nErros: " +getErros();
    }
}
