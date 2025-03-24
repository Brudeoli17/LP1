package classes.model;

public class Animal {

    // atributos
    private String especie;
    private String genero;
    private String cor;
    private Integer idade;

    // construtor
    public Animal(String especie, String genero, String cor, Integer idade){
        this.especie = especie;
        this.genero = genero;
        this.cor = cor;
        this.idade = idade;
    }

    // metodos
    public String beberAgua(){
        return "O animal esta bebendo àgua.";
    }

    public String comer(){
        return "O animal está comendo sua ração.";
    }

    public String verificarIdade(Integer idade){
        if (idade >= 2) {
           return "O animal é adulto." ;
        } else {
            return "O animal é jovem.";
        }
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
