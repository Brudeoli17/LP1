import java.util.Scanner;

public class TestaClasse {
    public static void main(String[] args) {
        // Instanciando objetos
        Cadeira cadeira = new Cadeira("Madeira", "Preta", 4);
        Vaca vaca = new Vaca("Bovina", 5, "Branca");
        Arbusto arbusto = new Arbusto("Azaléia", 1.5, "Verde");
        Faca faca = new Faca("Aço", 30, true);
        Gato gato = new Gato("Miau", "Cinza", 3);
        Taca taca = new Taca("Cristal", 250, true);
        Cachorro cachorro = new Cachorro("Rex", "Pastor Alemão", 2);
        Flor flor = new Flor("Rosa", "Preto", 1.3);
        Arvore arvore = new Arvore("Pinheiro", 5.0, 10);
        Colher colher = new Colher("Metal", 20.0, true);
        Atividade5 fracao1 = new Atividade5(3, 4);
        Atividade5 fracao2 = new Atividade5(1, 2);

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU DE TESTES ===");
            System.out.println("1. Testar Classe Cadeira");
            System.out.println("2. Testar Classe Vaca");
            System.out.println("3. Testar Classe Arbusto");
            System.out.println("4. Testar Classe Faca");
            System.out.println("5. Testar Classe Gato");
            System.out.println("6. Testar Classe Taça");
            System.out.println("7. Testar Classe Cachorro");
            System.out.println("8. Testar Classe Flor");
            System.out.println("9. Testar Classe Árvore");
            System.out.println("10. Testar Classe Colher");
            System.out.println("11. Testar Classe Fração (Atividade5)");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("\nTestando Cadeira:");
                    cadeira.exibirInformacoes();
                    cadeira.mudarMaterial("Plástico");
                    cadeira.ajustarNumeroDePernas(3);
                    break;

                case 2:
                    System.out.println("\nTestando Vaca:");
                    vaca.exibirInformacoes();
                    vaca.envelhecer(2);
                    vaca.mudarCor("Preta");
                    break;

                case 3:
                    System.out.println("\nTestando Arbusto:");
                    arbusto.exibirInformacoes();
                    arbusto.crescer(0.3);
                    arbusto.mudarCorFolhas("Amarela");
                    break;

                case 4:
                    System.out.println("\nTestando Faca:");
                    faca.exibirInformacoes();
                    faca.afiar();
                    faca.ajustarComprimento(35);
                    break;

                case 5:
                    System.out.println("\nTestando Gato:");
                    gato.exibirInformacoes();
                    gato.mudarCor("Preto");
                    gato.ajustarIdade(4);
                    break;

                case 6:
                    System.out.println("\nTestando Taça:");
                    taca.exibirInformacoes();
                    taca.mudarMaterial("Vidro");
                    taca.ajustarCapacidade(300);
                    break;

                case 7:
                    System.out.println("\nTestando Cachorro:");
                    cachorro.exibirInformacoes();
                    cachorro.mudarRaca("Doberman");
                    cachorro.ajustarIdade(3);
                    break;

                case 8:
                    System.out.println("\nTestando Flor:");
                    flor.exibirInformacoes();
                    flor.mudarCor("Rosa");
                    flor.ajustarPreco(3.5);
                    break;

                case 9:
                    System.out.println("\nTestando Árvore:");
                    arvore.exibirInformacoes();
                    arvore.crescer(1.0);
                    arvore.envelhecer(2);
                    break;

                case 10:
                    System.out.println("\nTestando Colher:");
                    colher.exibirInformacoes();
                    colher.mudarMaterial("Madeira");
                    colher.ajustarComprimento(25);
                    break;

                case 11:
                    System.out.println("\nTestando Frações (Atividade5):");
                    Atividade5 soma = fracao1.somar(fracao2);
                    Atividade5 subtracao = fracao1.subtrair(fracao2);
                    Atividade5 produto = fracao1.multiplicar(fracao2);
                    Atividade5 divisao = fracao1.dividir(fracao2);

                    System.out.println("Soma: " + soma);
                    System.out.println("Subtração: " + subtracao);
                    System.out.println("Multiplicação: " + produto);
                    System.out.println("Divisão: " + divisao);
                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);

        scanner.close();
    }
}
