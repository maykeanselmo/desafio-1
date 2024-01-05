package entities;

import exceptions.EstoqueInsuficienteException;

import java.util.Objects;

public class Produto {
    private String nome;
    private Integer codigo;
    private Double preco;
    private Integer quantidadeEstoque;

    public Produto(String nome, Integer codigo, Double preco, Integer quantidadeEstoque) throws IllegalArgumentException{
        if (preco <= 0)
            throw new IllegalArgumentException("Preço inválido.");
        if (quantidadeEstoque < 0)
            throw  new IllegalArgumentException("Quantidade de estoque inválido.");
        if ((nome == null || nome.isEmpty()))
            throw new IllegalArgumentException("Nome inválido");
        if(codigo < 0)
            throw new IllegalArgumentException("Código inválido");

        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        if( quantidadeEstoque == 0 || quantidadeEstoque <0)
            throw new IllegalArgumentException("Quantidade inválida");
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public  void atualizaEstoqueCompra(int numProdutosComprados){
        if( numProdutosComprados == 0 || numProdutosComprados <0)
            throw new IllegalArgumentException("Quantidade inválida");
        this.quantidadeEstoque += numProdutosComprados;
    }

    boolean verificaQuantidadeEstoque(int numProdutos){
        return this.quantidadeEstoque >= numProdutos;
    }
    public  void atualizaEstoqueVenda(int numProdutosVendidos) throws EstoqueInsuficienteException, IllegalArgumentException{
        if( numProdutosVendidos == 0 || numProdutosVendidos <0)
            throw new IllegalArgumentException("Quantidade inválida");
        if(verificaQuantidadeEstoque(numProdutosVendidos))
            this.quantidadeEstoque -= numProdutosVendidos;
        else
            throw new EstoqueInsuficienteException("Estoque insuficiente para esta venda");

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(nome, produto.nome) && Objects.equals(codigo, produto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, codigo);
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nCódigo: %d \nPreço: R$%.2f \nQuantidade no estoque: %d " , getNome(), getCodigo(), getPreco(), getQuantidadeEstoque());
    }
}