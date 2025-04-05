package org.example;

public class Cadeira {
    private String material;
    private String cor;
    private int numeroDePernas;

    public Cadeira(String material, String cor, int numeroDePernas) {
        this.material = material;
        this.cor = cor;
        this.numeroDePernas = numeroDePernas;
    }

    public void exibirInformacoes() {
        System.out.println("Material: " + this.material + ", Cor: " + this.cor + ", Número de pernas: " + this.numeroDePernas);
    }

    public void mudarMaterial(String novoMaterial) {
        this.material = novoMaterial;
        System.out.println("O material da cadeira foi alterado para " + novoMaterial);
    }

    public void ajustarNumeroDePernas(int novoNumeroDePernas) {
        this.numeroDePernas = novoNumeroDePernas;
        System.out.println("O número de pernas da cadeira foi ajustado para " + novoNumeroDePernas);
    }
}
