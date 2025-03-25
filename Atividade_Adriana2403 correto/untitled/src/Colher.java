public class Colher {
    private String material;
    private double comprimento;
    private boolean eDeSobremesa;

    // Construtor
    public Colher(String material, double comprimento, boolean eDeSobremesa) {
        this.material = material;
        this.comprimento = comprimento;
        this.eDeSobremesa = eDeSobremesa;
    }

    // Método para exibir informações da colher
    public void exibirInformacoes() {
        String tipo = eDeSobremesa ? "de sobremesa" : "normal";
        System.out.println("Material: " + material + ", Comprimento: " + comprimento + " cm, Tipo: " + tipo);
    }

    // Método para alterar o material da colher
    public void mudarMaterial(String novoMaterial) {
        this.material = novoMaterial;
        System.out.println("O material da colher foi alterado para " + novoMaterial);
    }

    // Método para ajustar o comprimento da colher
    public void ajustarComprimento(double novoComprimento) {
        this.comprimento = novoComprimento;
        System.out.println("O comprimento da colher foi ajustado para " + novoComprimento + " cm");
    }
}
