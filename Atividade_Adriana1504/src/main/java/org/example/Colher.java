package org.example;

public class Colher {
    private String material;
    private double comprimento;
    private boolean eDeSobremesa;

    public Colher(String material, double comprimento, boolean eDeSobremesa) {
        this.material = material;
        this.comprimento = comprimento;
        this.eDeSobremesa = eDeSobremesa;
    }

    public void exibirInformacoes() {
        String tipo = this.eDeSobremesa ? "de sobremesa" : "normal";
        System.out.println("Material: " + this.material + ", Comprimento: " + this.comprimento + " cm, Tipo: " + tipo);
    }

    public void mudarMaterial(String novoMaterial) {
        this.material = novoMaterial;
        System.out.println("O material da colher foi alterado para " + novoMaterial);
    }

    public void ajustarComprimento(double novoComprimento) {
        this.comprimento = novoComprimento;
        System.out.println("O comprimento da colher foi ajustado para " + novoComprimento + " cm");
    }
}

