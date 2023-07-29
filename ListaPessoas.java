import java.util.*;

public class ListaPessoas {
	ArrayList<Pessoa> lista;

	public ListaPessoas() {
		this.lista = new ArrayList<>();
	}

	public void inserirPessoa(Pessoa novaPessoa) {
		lista.add(novaPessoa);
	}

	public void listarPessoas() {
		for (Pessoa pessoa:lista) {
			pessoa.listar();
			System.out.println("\n");
		}
	}

	public void listarPessoas(int index) {
		System.out.println(this.lista.get(index).getNome());
	}

	public void alterarUsuario(String pessoa) {
		int index;
		for (index = 0;
			!pessoa.equals(this.lista.get(index).getNome());
			index++);

		String novoNome = this.lista.get(index).getNome();
		int novaIdade = this.lista.get(index).getIdade();

		Scanner input = new Scanner(System.in);
		System.out.println("--- Campos ---");
		System.out.println("nome  || idade");

		System.out.println("Qual campo deseja alterar?");
		String campoAlteracao = input.next();

		Index.clearBuffer(input);
		if (campoAlteracao.equalsIgnoreCase("nome")) {
			System.out.print("Insira o novo nome: ");
			novoNome = input.nextLine();
		} else if (campoAlteracao.equalsIgnoreCase("idade")) {
			System.out.print("Insira a nova idade: ");
			novaIdade = input.nextInt();
		}

		this.lista.remove(index);
		this.lista.add(new Pessoa(novoNome, novaIdade));
	}

	public void removerPessoa(String pessoa) {
		int index;
		for (index = 0;
			!pessoa.equals(this.lista.get(index).getNome());
			index++);

		this.lista.remove(index);
	}

}