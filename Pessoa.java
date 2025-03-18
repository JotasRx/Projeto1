import java.util.List;

public class Pessoa {
    // Atributos com diferentes tipos de dados
    private String nome;
    private int idade;
    private double altura;
    private List<String> hobbies;

    // Construtor para inicializar os atributos
    public Pessoa(String nome, int idade, double altura, List<String> hobbies) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.hobbies = hobbies;
    }

    // Método para exibir os dados armazenados
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " metros");
        System.out.print("Hobbies: ");
        for (String hobby : hobbies) {
            System.out.print(hobby + " ");
        }
        System.out.println();
    }

    // Métodos de acesso (getters)
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
}
