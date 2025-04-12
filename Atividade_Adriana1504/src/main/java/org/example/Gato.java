package org.example;

public class Gato {
    private String nome;
    private String garra;
    private String tamanhoPelo;

    public Gato(String nome, String garra, String tamanhoPelo) {
        this.nome = nome;
        this.garra = garra;
        this.tamanhoPelo = tamanhoPelo;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome + ", Tamanho do Pelo: " + this.tamanhoPelo + ", Garras: " + this.garra);
    }

    public String cortarPelo() {
        switch (tamanhoPelo) {
            case "curto":
                tamanhoPelo = "O pelo não precisa ser cortado pois já esta curto.";
                return (tamanhoPelo);
            case "médio":
            case "medio":
            case "grande":
            case "longo":
                tamanhoPelo = "O pelo do gato foi cortado.";
                return (tamanhoPelo);
            default:
                tamanhoPelo = "Insira uma informação válida: curto, medio, grande ou longo.";
                return (tamanhoPelo);

        }
    }

    public String cortarGarra() {
        switch (garra) {
            case "curto":
                garra = "As garras do gato não precisa ser cortada pois já estão curtas.";
                return (garra);
            case "médio":
            case "medio":
            case "grande":
            case "longo":
                garra = "As garras do gato foram cortadas";
                return (garra);
            default:
                garra = "Insira uma informação válida: curto, medio, grande ou longo.";
                return (garra);
        }
    }
}

