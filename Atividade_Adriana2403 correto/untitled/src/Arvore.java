public class Arvore {
    private String especie;
    private double altura;
    private int idade;

    // Construtor
    public Arvore(String especie, double altura, int idade) {
        this.especie = especie;
        this.altura = altura;
        this.idade = idade;
    }

    // Método para exibir informações da árvore
    public void exibirInformacoes() {
        System.out.println("Espécie: " + especie + ", Altura: " + altura + " metros, Idade: " + idade + " anos");
    }

    // Método para crescer a árvore
    public void crescer(double metros) {
        this.altura += metros;
        System.out.println("A árvore da espécie " + especie + " cresceu " + metros + " metros e agora tem " + altura + " metros de altura.");
    }

    // Método para envelhecer a árvore
    public void envelhecer(int anos) {
        this.idade += anos;
        System.out.println("A árvore da espécie " + especie + " envelheceu " + anos + " anos e agora tem " + idade + " anos.");
}
}