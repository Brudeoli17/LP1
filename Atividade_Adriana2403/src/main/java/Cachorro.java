public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    // Construtor
    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    // Método para exibir informações do cachorro
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Raça: " + raca + ", Idade: " + idade + " anos");
    }

    // Método para alterar a raça do cachorro
    public void mudarRaca(String novaRaca) {
        this.raca = novaRaca;
        System.out.println("A raça do cachorro " + nome + " foi alterada para " + novaRaca);
    }

    // Método para ajustar a idade do cachorro
    public void ajustarIdade(int novaIdade) {
        this.idade = novaIdade;
        System.out.println("A idade do cachorro " + nome + " foi ajustada para " + novaIdade + " anos");
    }
}
