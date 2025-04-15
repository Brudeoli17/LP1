package org.example;

public class Taca {
    private String material;
    private Integer capacidade;
    private String tamanho;

    public Taca(String material, Integer capacidade, String tamanho) {
        this.material = material;
        this.capacidade = capacidade;
        this.tamanho = tamanho;
    }

    public void exibirInformacoes() {

        System.out.println(this.tamanho);
    }

    public String tacaComun() {
        if (material.equals("cristal") ){
        material = "A taça é de material nobre.";
        return (material);}
        else{
            material = "A taça é de material comum.";
        return (material);}

    }

    public String verificaCapacidade() {
       if (capacidade >= 1 && capacidade <= 200){
           return ("A taça é pequena.");
       }
         else if (capacidade >= 201 && capacidade <= 300){
             return ("A taça é média.");
        }
        else {
            return ("A taça é grande.");
        }
    }
}

