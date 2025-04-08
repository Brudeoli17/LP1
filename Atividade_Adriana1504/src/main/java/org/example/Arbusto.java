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

    public void crescer() {
        Double metros = altura + 5;
        System.out.println("O arbusto da espécie " + this.especie + " cresceu 5 metros e agora sua altura é de: " + metros + ".");
    }

    public void mudarCorFolhas() {
        String NovaCor = "Rosa";
        System.out.println("As folhas do arbusto era da cor: " + this.corFolhas + " e agora são da cor:" + NovaCor);
    }
}
