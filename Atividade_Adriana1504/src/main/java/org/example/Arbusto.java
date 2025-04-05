package org.example;

public class Arbusto {
    private String especie;
    private double altura;
    private String corFolhas;

    public Arbusto(String especie, double altura, String corFolhas) {
        this.especie = especie;
        this.altura = altura;
        this.corFolhas = corFolhas;
    }

    public void exibirInformacoes() {
        System.out.println("Espécie: " + this.especie + ", Altura: " + this.altura + " metros, Cor das folhas: " + this.corFolhas);
    }

    public void crescer(double metros) {
        this.altura += metros;
        System.out.println("O arbusto da espécie " + this.especie + " cresceu " + metros + " metros e agora tem " + this.altura + " metros de altura.");
    }

    public void mudarCorFolhas(String novaCor) {
        this.corFolhas = novaCor;
        System.out.println("As folhas do arbusto " + this.especie + " agora são de cor " + novaCor + ".");
    }
}
