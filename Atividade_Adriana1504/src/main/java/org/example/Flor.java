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

    public String florescer() {
        return ("O botão da flor desabroxou.");

    }

    public String ajustarPreco() {
        Double novoPreco = preco + 5;
        return ("O preço da flor foi ajustado, seu valor agora é de: R$" + novoPreco );
    }
}

