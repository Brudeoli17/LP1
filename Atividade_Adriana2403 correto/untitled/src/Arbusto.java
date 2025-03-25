public class Arbusto {
    private String especie;
    private double altura;
    private String corFolhas;

    // Construtor
    public Arbusto(String especie, double altura, String corFolhas) {
        this.especie = especie;
        this.altura = altura;
        this.corFolhas = corFolhas;
    }

    // Método para exibir informações do arbusto
    public void exibirInformacoes() {
        System.out.println("Espécie: " + especie + ", Altura: " + altura + " metros, Cor das folhas: " + corFolhas);
    }

    // Método para crescer o arbusto
    public void crescer(double metros) {
        this.altura += metros;
        System.out.println("O arbusto da espécie " + especie + " cresceu " + metros + " metros e agora tem " + altura + " metros de altura.");
    }

    // Método para mudar a cor das folhas do arbusto
    public void mudarCorFolhas(String novaCor) {
        this.corFolhas = novaCor;
        System.out.println("As folhas do arbusto " + especie + " agora são de cor " + novaCor + ".");
    }
}
