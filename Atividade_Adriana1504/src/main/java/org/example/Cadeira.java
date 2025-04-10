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

    public String novaCor() {
        String novaCor = "Verde";
        return ("A cadeira foi pintada, sua nova cor é: " + novaCor);
    }

    public String ajustarNumeroDePernas() {
         Integer QtdPernas = numeroDePernas + 1;
         return ("Foi acrecentado 1 perna na cadeira, agora a mesma tem um total de " + QtdPernas + " pernas.");
    }
}
