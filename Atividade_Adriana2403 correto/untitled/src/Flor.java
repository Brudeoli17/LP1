public class Flor {
    private String nome;
    private String cor;
    private double preco;

    // Construtor
    public Flor(String nome, String cor, double preco) {
        this.nome = nome;
        this.cor = cor;
        this.preco = preco;
    }

    // Método para exibir informações da flor
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Cor: " + cor + ", Preço: R$" + preco);
    }

    // Método para mudar a cor da flor
    public void mudarCor(String novaCor) {
        this.cor = novaCor;
        System.out.println("A cor da flor " + nome + " foi alterada para " + novaCor);
    }

    // Método para ajustar o preço da flor
    public void ajustarPreco(double novoPreco) {
        this.preco = novoPreco;
        System.out.println("O preço da flor " + nome + " foi ajustado para R$" + novoPreco);
    }
}