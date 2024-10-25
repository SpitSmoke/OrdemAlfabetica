import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenarNomes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<String> nomes = new ArrayList<>();

        System.out.println("Digite os nomes (digite 'sair' para finalizar):");

        while (true) {
            String nome = scanner.nextLine();


            if (nome.equalsIgnoreCase("sair")) {
                break;
            }


            nomes.add(nome);
        }


        Collections.sort(nomes);


        System.out.println("Nomes ordenados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }


        scanner.close();
    }
}
