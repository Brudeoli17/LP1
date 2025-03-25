public class Gato {
    private String nome;
    private String cor;
    private int idade;

    // Construtor
    public Gato(String nome, String cor, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    // Método para exibir informações do gato
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Cor: " + cor + ", Idade: " + idade + " anos");
    }

    // Método para alterar a cor do gato
    public void mudarCor(String novaCor) {
        this.cor = novaCor;
        System.out.println("A cor do gato " + nome + " foi alterada para " + novaCor);
    }

    // Método para ajustar a idade do gato
    public void ajustarIdade(int novaIdade) {
        this.idade = novaIdade;
        System.out.println("A idade do gato " + nome + " foi ajustada para " + novaIdade + " anos");
    }
}
