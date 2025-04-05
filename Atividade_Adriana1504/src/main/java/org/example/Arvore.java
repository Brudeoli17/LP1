package org.example;

public class Arvore {
    private String especie;
    private double altura;
    private int idade;

    public Arvore(String especie, double altura, int idade) {
        this.especie = especie;
        this.altura = altura;
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Espécie: " + this.especie + ", Altura: " + this.altura + " metros, Idade: " + this.idade + " anos");
    }

    public void crescer(double metros) {
        this.altura += metros;
        System.out.println("A árvore da espécie " + this.especie + " cresceu " + metros + " metros e agora tem " + this.altura + " metros de altura.");
    }

    public void envelhecer(int anos) {
        this.idade += anos;
        System.out.println("A árvore da espécie " + this.especie + " envelheceu " + anos + " anos e agora tem " + this.idade + " anos.");
    }
}

