package aplicacao;

import java.util.Scanner;

public class Tela {

	public static int menu(Scanner sc) {
		
		System.out.println("\n1 - Cadastrar espetáculo e as suas participações: ");
		System.out.println("2 - Mostrar os dados de um espetáculo: ");
		System.out.println("3 - Deseja listar as bandas emtre determinado valo: ");
		System.out.println("4 - Sair");
		System.out.println("Digite uma opção: ");
		return Integer.parseInt(sc.nextLine());
		
	}
	
}
