package juri;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class ControladorProcessos {

	LinkedList<Processo> list = new LinkedList<Processo>();

	int numeroCadastro = 1;
	Scanner input = new Scanner(System.in);
	int numero = 0;

	public void cadastrarProcesso(String advogado, String cliente, String foro) {

		Processo p = new Processo();

		p.setNumeroCadastro(numeroCadastro++);
		p.setForo(foro);
		p.setAdvogado(advogado);
		p.setCliente(cliente);

		list.add(p);

		System.out.println("Processo: " + p);
	}

	public Processo consultaEspecifica(int numCadastro) {

		for (int i = 0; i < list.size(); i++) {

			Processo p = list.get(i);

			if (p.getNumeroCadastro() == numCadastro) {
				System.out.println("Processo encontrados!");
				System.out.println("Numero de Cadastro: " + p.getNumeroCadastro());
				System.out.println("Foro: " + p.getForo());
				System.out.println("Advogado: " + p.getAdvogado());
				System.out.println("Cliente: " + p.getCliente());
				break;
			} else
				System.out.println("Processo não encontrado!");

		}
		return null;

	}

	public Processo EdicaoProcesso(int opcao, int numcadastro) {
		for (int i = 0; i < list.size(); i++) {
			Processo p = list.get(i);
			if (p.getNumeroCadastro() == numcadastro) {
				System.out.println("Dados encontrados!");
				System.out.println("[" + i + "]" + p.getAdvogado());
				System.out.println("[" + i + "]" + p.getCliente());
				System.out.println("[" + i + "]" + p.getForo());
				break;
			} else
				System.out.println("Dados não encontrados!");
		}

		System.out.println("Digite o número da opcão para atualizar []: ");
		opcao = input.nextInt();
		input.nextLine();

		System.out.println("Digite o novo foro: ");
		String foro = input.next();

		System.out.println("Digite o novo advogado: ");
		String advogado = input.next();

		System.out.println("Digite o novo cliente: ");
		String cliente = input.next();

		Processo p = list.get(opcao);
		p.setForo(foro);
		p.setAdvogado(advogado);
		p.setCliente(cliente);
		System.out.println("Dados atualizados com sucesso");
		return p;

	}

	public Processo RemocaoDeProcessos(int opcao, int numCadastro) {
		for (int i = 0; i < list.size(); i++) {
			Processo p = list.get(i);
			if (p.getNumeroCadastro() == numCadastro) {
				System.out.println("Dados encontrados!");
				System.out.println("[" + i + "]" + p.getAdvogado());
				System.out.println("[" + i + "]" + p.getCliente());
				System.out.println("[" + i + "]" + p.getForo());
				break;
			} else
				System.out.println("Dados não encontrados!");

		}
		System.out.println("Insira a opcão para remover []: ");
		opcao = input.nextInt();
		input.nextLine();

		list.remove(opcao);

		Processo p = null;
		System.out.println("Dados removidos com sucesso");
		return p;
	}

	public void ExibicaoProcessos(String advogado) {
		for (int i = 0; i < list.size(); i++) {
			Processo p = list.get(i);
			if (p.getAdvogado().equals(advogado)) {
				System.out.println("Dados do advogado encontrados!");
				System.out.println("Numero de Cadastro: " + p.getNumeroCadastro());
				System.out.println("Foro: " + p.getForo());
				System.out.println("Advogado: " + p.getAdvogado());
				System.out.println("Cliente: " + p.getCliente());
				numero++;

			} else
				System.out.println("Dados não encontrados!");
		}
	}

	public Processo MostrarProcessos() {
		// Achei necessario criar essse metodo para mostrar todos os processos em ordem
		for (int i = 0; i < list.size(); i++) {
			System.out.println("\tNumero Cadastro: " + list.get(i).getNumeroCadastro());
			System.out.println("\tForo: " + list.get(i).getForo());
			System.out.println("\tAdvogado: " + list.get(i).getAdvogado());
			System.out.println("\tCliente: " + list.get(i).getCliente());
		}
		Processo p = null;
		return p;
	}

	public void lerArquivo(String caminho) {

		try {
			FileReader arq = new FileReader(caminho);
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = "";

			try {

				linha = lerArq.readLine();

				while (linha != null) {
					numero++;

					String foro = lerArq.readLine();
					String advogado = lerArq.readLine();
					String cliente = lerArq.readLine();
					linha = lerArq.readLine();

					Processo p = new Processo();
					p.setNumeroCadastro(numeroCadastro++);
					p.setForo(foro);
					p.setAdvogado(advogado);
					p.setCliente(cliente);
					list.add(p);
					System.out.println("Processo: " + p);

				}
				arq.close();

			} catch (IOException ex) {
				System.out.println("Erro: Não foi possivel ler arquivo!");

			}
		} catch (FileNotFoundException ex) {
			System.out.println("Erro: Arquivo não encontrado!");

		}

	}

}


