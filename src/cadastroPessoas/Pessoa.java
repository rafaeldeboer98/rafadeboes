package cadastroPessoas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pessoa {

	// atributos
	private String codigo;
	private String nome;
	private String endereco;
	private String idade;

	// getters e setters
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	// metódo que cadastra as pessoas dentro do arquivo
	public void Cadastro() throws InputMismatchException, IOException {

		File file = new File("Pessoa.txt");

		BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));

		// inserindo dados de uma pessoa utilizando o scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código:");
		codigo = sc.nextLine();
		bw.newLine();
		bw.write(codigo);
		System.out.println("Digite o nome:");
		nome = sc.nextLine();
		bw.newLine();
		bw.write(nome);
		System.out.println("Digite o endereço:");
		endereco = sc.nextLine();
		bw.newLine();
		bw.write(endereco);
		System.out.println("Digite a idade:");
		idade = sc.nextLine();
		bw.newLine();
		bw.write(idade);// escrevendo no arquivo
		bw.newLine();// criando uma nova linha
		bw.close();// fechando arquivo

	}

	// metodo que consulta dentro do arquivo as pessoas ja cadastradas
	public void Consulta() throws IOException {
		InputStream fis = new FileInputStream("Pessoa.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		String linha = br.readLine();

		while (linha != null) {

			System.out.println(linha);
			linha = br.readLine();

		}

		br.close();// fechando arquivo

	}

}
