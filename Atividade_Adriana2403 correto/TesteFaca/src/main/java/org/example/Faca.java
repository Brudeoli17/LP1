package org.example;

public class Faca {
    private String material;
    private double comprimento;
    private boolean eAfiada;

    // Construtor
    public Faca(String material, double comprimento, boolean eAfiada) {
        this.material = material;
        this.comprimento = comprimento;
        this.eAfiada = eAfiada;
    }

    // Método para exibir informações da faca
    public void exibirInformacoes() {
        String estado = eAfiada ? "Não está afiada" : "Está afiada";
        System.out.println("Material: " + material + ", Comprimento: " + comprimento + " cm, Estado: " + estado);
    }

    // Método para afiar a faca
    public void afiar() {
        if (!eAfiada) {
            this.eAfiada = true;
            System.out.println("A faca foi afiadas e agora está afiada.");
        } else {
            System.out.println("A faca já está afiada.");
        }
    }

    // Método para ajustar o comprimento da lâmina da faca
    public void ajustarComprimento(double novoComprimento) {
        this.comprimento = novoComprimento;
        System.out.println("O comprimento da faca foi ajustado para " + novoComprimento + " cm.");
    }
}

