import java.util.Scanner;

public class Index {
	public static void main(String[] args) {
		ListaPessoas lista = new ListaPessoas();

		Scanner input = new Scanner(System.in);
		String pessoa;
		boolean sair = false;
		int opcao;

		while(!sair) {
			imprimirMenu();
			opcao = input.nextInt();

			switch(opcao) {
				case 0:
					sair = true;
					break;

				case 1:
					clearBuffer(input);
					System.out.print("Informe seu nome: ");
					String nome = input.nextLine();

					System.out.print("Informe sua idade: ");
					int idade = input.nextInt();
					Pessoa novaPessoa = new Pessoa(nome, idade);
					lista.inserirPessoa(novaPessoa);
					break;

				case 2:
					System.out.println("\n\n");
					lista.listarPessoas();
					break;

				case 3:
					clearBuffer(input);
					System.out.println("Digite o nome do usuario que você\n deseja fazer alguma alteração");
					pessoa = input.nextLine();

					lista.alterarUsuario(pessoa);
					break;

				case 4:
					clearBuffer(input);
					System.out.println("Qual o nome da pessoa que você deseja escluir? ");
					pessoa = input.nextLine();

					lista.removerPessoa(pessoa);
					break;

				default:
					System.out.println(opcao + " Não é uma opção");
			}
		}
	}

	public static void imprimirMenu() {
		System.out.println("---- Menu ----");
		System.out.println("0 - Sair");
		System.out.println("1 - Cadastrar Pessoas");
		System.out.println("2 - Listar Pessoas");
		System.out.println("3 - Alterar Pessoa");
		System.out.println("4 - Excluir Pessoa");
		System.out.println("5 - ");
	}

	public static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
