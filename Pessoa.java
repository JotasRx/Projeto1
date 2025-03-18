

public class Pessoa {
    private String nome;
    private int idade;
    public int altura;
    public String hobbies;
    
    public Pessoa ( String nm,int ida, int alt, String hob){
        this.nome = nm;
        this.idade = ida;
        this.altura = alt;
        this.hobbies = hob; 
    
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
            // Método para exibir os dados da pessoa
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " metros");
        System.out.print("Hobbies: " + hobbies);
       
    }   
    
}

    


