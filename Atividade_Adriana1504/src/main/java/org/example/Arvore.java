package org.example;

public class Arvore {
    private String especie;
    private Double altura;
    private Integer idade;

    public Arvore(String especie, double altura, int idade) {
        this.especie = especie;
        this.altura = altura;
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Espécie: " + this.especie + ", Altura: " + this.altura + " metros, Idade: " + this.idade + " anos");
    }

    public void cresceu() {
        Double novaAltura = altura + 10;
        System.out.println("A árvore da espécie " + this.especie + " cresceu 10 metros e agora sua altura é de: " + novaAltura + "metros.");
    }

    public void envelhecer() {
        Integer novaIdade = idade + 5;
        System.out.println("A árvore da espécie " + this.especie + " envelheceu 5 anos e agora sua idade é de: " + novaIdade + ".");
    }
}

