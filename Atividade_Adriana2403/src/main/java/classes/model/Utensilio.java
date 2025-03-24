package classes.model;

public class Utensilio {

    // atributos
    private String material;
    private Integer quantidade;
    private String nome;

    // construtor
    public Utensilio(String material, Integer quantidade, String nome){
        this.material = material;
        this.quantidade = quantidade;
        this.nome = nome;
    }

    // metodo
    public String verificarDurabilidade(String material){
        if (material == "ferro"){
            return "Durabilidade alto.";
        } else if (material == "metal") {
            return "Durabilidade média.";
        } else {
            return "Durabiliade baixa.";
        }
    }

    public String lavar(){
        return "O utensílio esta sendo lavado.";
    }

    public String quantidadeDisponivel(Integer quantidade){
        if (quantidade >= 1){
            return "Item disponível para uso";
        } else{
            return "Item indisponível para uso";
        }
    }
}