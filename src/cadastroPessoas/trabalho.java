package cadastroPessoas;

import java.io.IOException;
import java.util.Scanner;

public class trabalho {

	public static void main(String[] args) throws Exception, IOException {

		int opcao;
		// int codigo, idade;
		// String nome, endereco;
		// instanciando uma nova pessoa
		Pessoa p1 = new Pessoa();

		// criando o scanner
		Scanner sc = new Scanner(System.in);

		// tela de menu
		do {
			System.out.println("## Escolha uma das op��es abaixo ##");
			System.out.println("Op��o 1 - Cadastra pessoas  \nOp��o 2 - Imprime pessoas cadastradas\n"
					+ "Op��o 0 - Sair do programa");
			System.out.println("________________________________");
			System.out.println("Digite aqui sua op��o: ");
			opcao = sc.nextInt();

			if (opcao == 1) {
				p1.Cadastro();

			}
			if (opcao == 2) {

				p1.Consulta();

			} else if (opcao > 2) {
				System.out.println("OP��O INV�LIDA, SEU COMPUTADOR VAI EXPLODIR EM 3 2 1...!!!\n");
				System.out.println("BRINCADEIRA!!!  REINICIE O PROGRAMA E ESCOLHA AS OP��ES CERTAS DESSA VEZ!!! \n");
				break;
			}

		} while (opcao != 0);

	}

}
