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

    public String mudarRaca() {
        String RacaNew = "Pastor Alemão";
        return ("A raça do cachorro " + this.nome + " foi alterada para " + RacaNew);
    }

    public String ajustarIdade() {
        Integer NewIdade = idade + 1;
        return ("A idade do cachorro " + this.nome + " foi ajustada para: " + NewIdade);
    }
}
