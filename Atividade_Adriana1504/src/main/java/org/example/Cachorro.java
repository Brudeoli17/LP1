package org.example;

public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome + ", Raça: " + this.raca + ", Idade: " + this.idade + " anos");
    }

    public void mudarRaca(String novaRaca) {
        this.raca = novaRaca;
        System.out.println("A raça do cachorro " + this.nome + " foi alterada para " + novaRaca);
    }

    public void ajustarIdade(int novaIdade) {
        this.idade = novaIdade;
        System.out.println("A idade do cachorro " + this.nome + " foi ajustada para " + novaIdade + " anos");
    }
}

