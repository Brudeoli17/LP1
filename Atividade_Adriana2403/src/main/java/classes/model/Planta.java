package classes.model;

public class Planta {

    // atributos
    private String especie;
    private String cor;
    private Double tamanhoAnterior;
    private Double tamanhoAtual;

    //construtor
    public Planta(String especie, String cor, Double tamanhoAnterior, Double tamanhoAtual){
        this.especie = especie;
        this.cor = cor;
        this.tamanhoAnterior = tamanhoAnterior;
        this.tamanhoAtual = tamanhoAtual;
    }

    // metodo
    public Double crescimento(Double tamanhoAnterior,Double tamanhoAtual){
        Double resultado = (tamanhoAnterior - tamanhoAtual);
        return resultado;
    }
    public String possuiFlor(String especie){
        switch (especie) {
            case "rosa":
                return "Possui flores";
            case "lirio":
                return "Possui flores";
            case "girassol":
                return "Possui flores";
            case "margarida":
                return "Possui flores";
            case "violeta":
                return "Possui flores";
            case "bromélia":
                return "Possui flores";
            case "orquidea":
                return "Possui flores";
            case "tulipa":
                return "Possui flores";
            case "jasmim":
                return "Possui flores";
            case "vitoria regia":
                return "Possui flores";
            default:
                return "Planta desconhecida";
        }
    }
    public String aguar(){
        return "A planta precisa ser aguada";
    }
}


