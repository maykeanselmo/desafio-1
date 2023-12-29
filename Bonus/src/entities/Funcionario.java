package entities;

import java.util.Objects;

public class Funcionario {
    String nome;
    String cpf;
    Double salario;

    public String getCpf() {
        return cpf;
    }

    public Funcionario(String nome, String cpf, Double salario) throws IllegalArgumentException {
        if (nome == null || nome.isEmpty() || cpf == null || cpf.isEmpty() || salario <= 0.0) {
            throw new IllegalArgumentException("Campos inválidos para o funcionário ");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }


    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public double calculaModificadorSalario(){
        if(this.salario <= 1000.00)
            return this.salario *  0.20;
        else if (this.salario > 1000.00 && this.salario <= 2000.00) {
            return salario * 0.10;
        } else
            return -(this.salario * 0.10);

    }
    boolean direitoBonus(){
        return this.salario <= 2000;
    }

    public double salarioLiquido(){
            return this.salario + calculaModificadorSalario();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        if (direitoBonus()){
            return "Funcionario: " + getNome() +
                    "\nSalário: " + getSalario() +
                    "\nBônus: " + calculaModificadorSalario()+
                    "\nSalário liquido: " + salarioLiquido();

        }
        return "Funcionario: " + getNome() +
                "\nSalário: " + getSalario() +
                "\nDisconto: " + (-calculaModificadorSalario())+
                "\nSalário liquido: " + salarioLiquido();

    }
}
