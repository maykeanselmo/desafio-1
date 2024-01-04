package entities;

import java.util.Objects;

public class Funcionario {
    String nome;

    Double salario;


    public Funcionario(String nome, Double salario) throws IllegalArgumentException {
        if (nome != null && !nome.isEmpty() && (salario != null && salario > 0.0)) {
            this.nome = nome;
            this.salario = salario;
        } else {
            throw new IllegalArgumentException("Nome e/ou salário inválido(s) para o funcionário ");
        }
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public double calculaModificadorSalario() {
        if (this.salario <= 1000.0) {
            return this.salario * 0.2;
        } else {
            return this.salario > 1000.0 && this.salario <= 2000.0 ? this.salario * 0.1 : -(this.salario * 0.1);
        }
    }

    boolean direitoBonus() {
        return this.salario <= 2000.0;
    }

    public double salarioLiquido() {
        return this.salario + this.calculaModificadorSalario();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(nome, that.nome) && Objects.equals(salario, that.salario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, salario);
    }

    public String toString() {
        String var10000;
        if (this.direitoBonus()) {
            var10000 = this.getNome();
            return "Funcionario: " + var10000 + "\nSalário: " + this.getSalario() + "\nBônus: " + this.calculaModificadorSalario() + "\nSalário liquido: " + this.salarioLiquido();
        } else {
            var10000 = this.getNome();
            return "Funcionario: " + var10000 + "\nSalário: " + this.getSalario() + "\nDisconto: " + -this.calculaModificadorSalario() + "\nSalário liquido: " + this.salarioLiquido();
        }
    }
}
