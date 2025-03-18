import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    // Método para inserir dados da pessoa
    public static Pessoa inserirDados() {
        Scanner scanner = new Scanner(System.in);

        // Inserindo nome
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        // Inserindo idade
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        // Inserindo altura
        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        // Limpando o buffer do scanner
        scanner.nextLine();  // Para capturar a próxima linha corretamente

        // Inserindo hobbies
        List<String> hobbies = new ArrayList<>();
        System.out.println("Digite os hobbies (digite 'sair' para terminar): ");
        while (true) {
            String hobby = scanner.nextLine();
            if (hobby.equalsIgnoreCase("sair")) {
                break;
            }
            hobbies.add(hobby);
        }

        // Criando e retornando a pessoa com os dados inseridos
        return new Pessoa(nome, idade, altura, hobbies);
    }

    public static void main(String[] args) {
        // Inserindo os dados da pessoa
        Pessoa pessoa1 = inserirDados();

        // Exibindo os dados da pessoa
        pessoa1.exibirDados();
    }
}
 
    

