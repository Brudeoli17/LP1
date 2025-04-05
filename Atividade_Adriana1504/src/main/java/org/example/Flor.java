package org.example;

public class Flor {
    private String nome;
    private String cor;
    private double preco;

    public Flor(String nome, String cor, double preco) {
        this.nome = nome;
        this.cor = cor;
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome + ", Cor: " + this.cor + ", Preço: R$" + this.preco);
    }

    public void mudarCor(String novaCor) {
        this.cor = novaCor;
        System.out.println("A cor da flor " + this.nome + " foi alterada para " + novaCor);
    }

    public void ajustarPreco(double novoPreco) {
        this.preco = novoPreco;
        System.out.println("O preço da flor " + this.nome + " foi ajustado para R$" + novoPreco);
    }
}

