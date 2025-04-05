package org.example;

public class Taca {
    private String material;
    private double capacidade;
    private boolean eCristal;

    public Taca(String material, double capacidade, boolean eCristal) {
        this.material = material;
        this.capacidade = capacidade;
        this.eCristal = eCristal;
    }

    public void exibirInformacoes() {
        String tipo = this.eCristal ? "de cristal" : "comum";
        System.out.println("Material: " + this.material + ", Capacidade: " + this.capacidade + " ml, Tipo: " + tipo);
    }

    public void mudarMaterial(String novoMaterial) {
        this.material = novoMaterial;
        System.out.println("O material da taça foi alterado para " + novoMaterial);
    }

    public void ajustarCapacidade(double novaCapacidade) {
        this.capacidade = novaCapacidade;
        System.out.println("A capacidade da taça foi ajustada para " + novaCapacidade + " ml");
    }
}

