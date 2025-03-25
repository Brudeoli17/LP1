public class Vaca {
    private String nome;
    private int idade;
    private String cor;

    // Construtor
    public Vaca(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    // Método para exibir informações da vaca
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + " anos, Cor: " + cor);
    }

    // Método para aumentar a idade da vaca
    public void envelhecer(int anos) {
        this.idade += anos;
        System.out.println("A vaca " + nome + " agora tem " + idade + " anos.");
    }

    // Método para mudar a cor da vaca
    public void mudarCor(String novaCor) {
        this.cor = novaCor;
        System.out.println("A vaca " + nome + " agora é " + novaCor + ".");
    }
}
