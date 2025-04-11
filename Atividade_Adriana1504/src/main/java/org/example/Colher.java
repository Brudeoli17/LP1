package org.example;

public class Colher {
    private String material;
    private String comprimento;
    private String estado;

    public Colher(String material, String comprimento, String estado  ) {
        this.material = material;
        this.comprimento = comprimento;
        this.estado = estado ;
    }

    public void exibirInformacoes() {
        System.out.println("Material: " + this.material + ", Comprimento: " + this.comprimento);
    }

    public String utilizacao () {;
        switch (comprimento) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
               comprimento = "A Colher é de Café.";
               return (comprimento);
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
                comprimento = "A colher é de Chá.";
                return (comprimento);
            case "11":
            case "12":
            case "13":
            case "14":
            case "15":
                comprimento = "A colher é de Sobremesa.";
                return (comprimento);
            case "16":
            case "17":
            case "18":
            case "19":
            case "20":
                comprimento = "A colher é de Sopa.";
                return (comprimento);

            default:
                comprimento = "A colher deve ser utilizada para mexer a comida.";
                return (comprimento);
        }

    }

    public String utilizavel(){
        switch (estado){
            case "enferrujado":
            case "suja":
                estado = "A colher não pode ser utilizada.";
                return(estado);
            case "limpa":
                estado = "A colher pode ser utilizada.";
                return (estado);
            default:
                estado = "Informe um estado válido: enferrujada, suja ou limpa";
                return (estado);
        }

    }
}
