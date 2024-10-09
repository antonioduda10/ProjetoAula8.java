import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDePessoas gerenciador = new GerenciadorDePessoas();

        // Cadastro da Pessoa 1
        System.out.println("Cadastro da Pessoa 1");
        System.out.print("Nome: ");
        String nome1 = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf1 = scanner.nextLine();
        System.out.print("Idade: ");
        int idade1 = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após a leitura do número

        Pessoa pessoa1 = new Pessoa(nome1, cpf1, idade1);
        gerenciador.cadastrarPessoa1(pessoa1);

        // Cadastro da Pessoa 2
        System.out.println("Cadastro da Pessoa 2");
        System.out.print("Nome: ");
        String nome2 = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf2 = scanner.nextLine();
        System.out.print("Idade: ");
        int idade2 = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após a leitura do número

        Pessoa pessoa2 = new Pessoa(nome2, cpf2, idade2);
        gerenciador.cadastrarPessoa2(pessoa2);

        // Exibição dos dados cadastrados
        System.out.println("\nDados cadastrados:");
        gerenciador.exibirPessoa1();
        gerenciador.exibirPessoa2();

        // Atualização dos dados da Pessoa 1
        System.out.println("\nAtualização da Pessoa 1");
        System.out.print("Nome: ");
        String novoNome1 = scanner.nextLine();
        System.out.print("CPF: ");
        String novoCpf1 = scanner.nextLine();
        System.out.print("Idade: ");
        int novaIdade1 = scanner.nextInt();

        Pessoa novaPessoa1 = new Pessoa(novoNome1, novoCpf1, novaIdade1);
        gerenciador.atualizarPessoa1(novaPessoa1);

        // Exibição dos dados atualizados
        System.out.println("\nDados atualizados:");
        gerenciador.exibirPessoa1();
        gerenciador.exibirPessoa2();

        scanner.close(); // Fechar o scanner
    }
}
