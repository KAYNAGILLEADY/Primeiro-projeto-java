
public class Pessoa {
	private String nome;
	private int idade;

	// Constructor
	public Pessoa() {
		this.nome = "";
		this.idade = 0;
	}

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	// Gets and Sets
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return this.idade;
	}

	public void listar() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
	}
}