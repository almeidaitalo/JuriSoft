package juri;

import java.util.Scanner;

public class ProgramaMain {

	public static void main(String[] args) {

		ControladorProcessos g = new ControladorProcessos();

		Scanner input = new Scanner(System.in);
		System.out.println("===== Sistema de gerenciamento de processos - JuriSoft ===== \n");

		int opcao;

		do {

			System.out.println("Menu de opções:");
			System.out.println("\t[1] Ler Arquivo");
			System.out.println("\t[2] Cadastrar processos");
			System.out.println("\t[3] Consulta Especifica");
			System.out.println("\t[4] Edição de processos");
			System.out.println("\t[5] Remoção de processos");
			System.out.println("\t[6] Exibição especial de processos");
			System.out.println("\t[7] Mostrar todos os processos");
			System.out.println("\t[8] Finalizar sistema");

			System.out.println("Informe sua opção: ");

			opcao = input.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("===== Ler Arquivo =====");

				g.lerArquivo("E:\\temp\\Arquivo.txt");

				break;
			case 2:
				System.out.println("===== Cadastrar Processos =====");

				System.out.println("Insira o nome do foro: ");
				String foro = input.next();

				System.out.println("Insira o nome do advogado: ");
				String advogado = input.next();

				System.out.println("Insira o nome do cliente: ");
				String cliente = input.next();

				g.cadastrarProcesso(advogado, cliente, foro);

				break;

			case 3:
				System.out.println("===== Consulta Especifica =====");

				System.out.println("Insira o numero do processo: ");
				int numCadastro = input.nextInt();

				g.consultaEspecifica(numCadastro);

				break;
			case 4:
				System.out.println("===== Edicão de processos =====");
				System.out.println("Insira o numero de processo para editar: ");
				numCadastro = input.nextInt();
				g.EdicaoProcesso(opcao, numCadastro);
				break;
			case 5:
				System.out.println("===== Remoção de processos =====");

				System.out.println("Insira o numero do processo para remover: ");
				numCadastro = input.nextInt();

				g.RemocaoDeProcessos(opcao, numCadastro);

				break;
			case 6:
				System.out.println("===== Exibição especial de processos =====");
				System.out.println("Insira o nome do advogado: ");
				advogado = input.next();
				g.ExibicaoProcessos(advogado);

				break;
			case 7:
				System.out.println("===== Mostrar todos os processos =====");
				g.MostrarProcessos();
				break;
			case 8:
				System.out.println("===== Sistema Finalizado! =====");
			}

		} while (opcao != 8);
		input.close();
	}

}
			



	
