package aplicacao;

import java.util.Scanner;

public class Tela {

	public static int menu(Scanner sc) {
		
		System.out.println("\n1 - Cadastrar espet�culo e as suas participa��es: ");
		System.out.println("2 - Mostrar os dados de um espet�culo: ");
		System.out.println("3 - Deseja listar as bandas emtre determinado valo: ");
		System.out.println("4 - Sair");
		System.out.println("Digite uma op��o: ");
		return Integer.parseInt(sc.nextLine());
		
	}
	
}
