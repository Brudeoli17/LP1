public class Taca {
    private String material;
    private double capacidade;
    private boolean eCristal;

    // Construtor
    public Taca(String material, double capacidade, boolean eCristal) {
        this.material = material;
        this.capacidade = capacidade;
        this.eCristal = eCristal;
    }

    // Método para exibir informações da taça
    public void exibirInformacoes() {
        String tipo = eCristal ? "de cristal" : "comum";
        System.out.println("Material: " + material + ", Capacidade: " + capacidade + " ml, Tipo: " + tipo);
    }

    // Método para alterar o material da taça
    public void mudarMaterial(String novoMaterial) {
        this.material = novoMaterial;
        System.out.println("O material da taça foi alterado para " + novoMaterial);
    }

    // Método para ajustar a capacidade da taça
    public void ajustarCapacidade(double novaCapacidade) {
        this.capacidade = novaCapacidade;
        System.out.println("A capacidade da taça foi ajustada para " + novaCapacidade + " ml");
    }
}
