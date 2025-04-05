package org.example;

public class Faca {
    private String material;
    private double comprimento;
    private String Afiada;

    // Construtor
    public Faca(String material, double comprimento, String Afiada) {
        this.material = material;
        this.comprimento = comprimento;
        this.Afiada = Afiada;
    }

    // Método para exibir informações da faca
    public void exibirInformacoes() {
        String estado = Afiada;
        switch (Afiada) {
                    case ("sim"):
                        estado = "A faca já está afiada";
                        break;
                    case ("não"):
                        estado = "A faca não está afiada";
                }
        System.out.println("Material: " + material + ", Comprimento: " + comprimento + " cm, Estado: " + estado);
    }

    // Método para afiar a faca
    public void afiar(){
        String estado = Afiada;
        switch (Afiada) {
            case ("sim"):
                estado = "A faca já está afiada";
                System.out.println(estado);
                break;
            case ("não"):
                estado = "A faca foi afiada";
                System.out.println(estado);
        }
    }

    // Método para ajustar o comprimento da lâmina da faca
    public void ajustarComprimento(double novoComprimento) {
        this.comprimento = novoComprimento;
        System.out.println("O comprimento da faca foi ajustado para " + novoComprimento + " cm.");
    }
}