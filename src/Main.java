import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("Livro 1", 29.90, "Autor 1"));
        livros.add(new Livro("Livro 2", 49.90, "Autor 2"));
        livros.add(new Livro("Livro 3", 39.90, "Autor 3"));
        livros.add(new Livro("Livro 4", 59.90, "Autor 4"));

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Mostrar todos os livros");
            System.out.println("2 - Adicionar um novo livro");
            System.out.println("3 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
                case 1:
                    for (Livro livro : livros) {
                        System.out.println(livro);
                    }
                    break;
                case 2:
                    System.out.println("Digite o nome do livro:");
                    String nome = sc.nextLine();
                    System.out.println("Digite o preço do livro:");
                    double preco = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Digite o autor do livro:");
                    String autor = sc.nextLine();
                    livros.add(new Livro(nome, preco, autor));
                    System.out.println("Livro adicionado com sucesso!");
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        sc.close();
    }
}
