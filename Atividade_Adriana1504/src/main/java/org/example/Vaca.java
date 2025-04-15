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

    public String comer() {
        return ("A vaca esta comendo.");
    }

    public String beberAgua() {
        return ("A vaca esta bebendo àgua.");
    }
}
