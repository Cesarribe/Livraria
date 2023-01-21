package projetoLivraria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static projetoLivraria.Principal.contId;

public class CadastroJogoUtil {
    private static Scanner scanner;
    private List<Jogo> listaDeJogo = new ArrayList<>();
    public static Integer contID = 0;
    Scanner sc = new Scanner(System.in);

    public static void cadastrarJogo() {
    }

    public List<Jogo> getListaDeJogo() {
        return listaDeJogo;
    }


    public static Jogo cadastrarJogo(Scanner sc) {

        Jogo jogo = new Jogo();

        jogo.setId(contId + 1);
        contId = contId + 1;

        System.out.println("Qual o nome do jogo que deseja cadastrar?");
        scanner.nextLine();
        jogo.setNome(scanner.nextLine());
        System.out.println("Qual preço do jogo que deseja cadastrar?");
        jogo.setPreco(scanner.nextDouble());
        System.out.println("Qual o estudio do filme que deseja cadastrar?");
        scanner.nextLine();
        jogo.setEstudio(scanner.nextLine());
        System.out.println("Qual a distribudora do filme que deseja cadastrar?");
        jogo.setDistribuidora(scanner.nextLine());
        System.out.println("Qual o genero do filme que deseja cadastrar?");
        jogo.setGenero(scanner.nextLine());
        return jogo;
    }
    public void adicionarJogo(Jogo cp) {
        Jogo.add(cp);
}