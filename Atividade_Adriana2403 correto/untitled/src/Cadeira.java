public class Cadeira {
    private String material;
    private String cor;
    private int numeroDePernas;

    // Construtor
    public Cadeira(String material, String cor, int numeroDePernas) {
        this.material = material;
        this.cor = cor;
        this.numeroDePernas = numeroDePernas;
    }

    // Método para exibir informações da cadeira
    public void exibirInformacoes() {
        System.out.println("Material: " + material + ", Cor: " + cor + ", Número de pernas: " + numeroDePernas);
    }

    // Método para mudar o material da cadeira
    public void mudarMaterial(String novoMaterial) {
        this.material = novoMaterial;
        System.out.println("O material da cadeira foi alterado para " + novoMaterial);
    }

    // Método para ajustar o número de pernas da cadeira
    public void ajustarNumeroDePernas(int novoNumeroDePernas) {
        this.numeroDePernas = novoNumeroDePernas;
        System.out.println("O número de pernas da cadeira foi ajustado para " + novoNumeroDePernas);
    }
}
