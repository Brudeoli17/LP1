package org.example;

public class Gato {
    private String nome;
    private String cor;
    private int idade;

    public Gato(String nome, String cor, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome + ", Cor: " + this.cor + ", Idade: " + this.idade + " anos");
    }

    public void mudarCor(String novaCor) {
        this.cor = novaCor;
        System.out.println("A cor do gato " + this.nome + " foi alterada para " + novaCor);
    }

    public void ajustarIdade(int novaIdade) {
        this.idade = novaIdade;
        System.out.println("A idade do gato " + this.nome + " foi ajustada para " + novaIdade + " anos");
    }
}

