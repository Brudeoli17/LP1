package org.example;

public class Vaca {
    private String nome;
    private int idade;
    private String cor;

    public Vaca(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome + ", Idade: " + this.idade + " anos, Cor: " + this.cor);
    }

    public void envelhecer(int anos) {
        this.idade += anos;
        System.out.println("A vaca " + this.nome + " agora tem " + this.idade + " anos.");
    }

    public void mudarCor(String novaCor) {
        this.cor = novaCor;
        System.out.println("A vaca " + this.nome + " agora é " + novaCor + ".");
    }
}
