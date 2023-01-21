package projetoLivraria;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static projetoLivraria.Principal.contId;

public class CadastroBrinquedoUtil {

    private static Scanner scanner;
    private List<Brinquedo> listaDeBrinquedos = new ArrayList<>();
    public static Integer contID = 0;
    Scanner sc = new Scanner(System.in);

    public static void cadastrarBrinquedo() {
    }

    public List<Brinquedo> getListaDeBrinquedos() {
        return listaDeBrinquedos;
    }


        public static Brinquedo cadastrarBrinquedo(Scanner sc){
            Brinquedo brinquedo = new Brinquedo();

            brinquedo.setId(contId + 1);
            contId = contId + 1;

            System.out.println("Qual o nome do brinquedo que deseja cadastrar?");
            sc.nextLine();
            brinquedo.setNome(scanner.nextLine());
            System.out.println("Qual preço do brinquedo que deseja cadastrar?");
            brinquedo.setPreco(scanner.nextDouble());
            System.out.println("Qual o tipo de brinquedo que deseja cadastrar?");
            scanner.nextLine();
            brinquedo.setTipo(scanner.nextLine());
            return brinquedo;

    }

    public void adicionarBrinquedo(Brinquedo cp) {
        Brinquedo.add(cp);
    }




    private  Brinquedo buscarPorID (Integer id){
       return
        listaDeBrinquedos.stream()
                .filter(musica -> musica.getId() == id)
                .collect(Collectors.toList())
                .stream().findFirst().get();

    }


    public void listarBrinquedos(){
        listaDeBrinquedos.forEach((p) -> {
            System.out.print("Nome do Brinquedo: " + p.getNome());
            System.out.print("/ID: " + p.getId());
            System.out.print("/Preco: " + p.getPreco());
            System.out.println("");
        } );
    }
}