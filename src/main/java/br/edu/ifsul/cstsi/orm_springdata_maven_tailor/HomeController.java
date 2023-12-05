package br.edu.ifsul.cstsi.orm_springdata_maven_tailor;

import br.edu.ifsul.cstsi.orm_springdata_maven_tailor.audiencia.AudienciaController;

import java.util.Scanner;

public class HomeController {
	
	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int opcao;
		do {
			System.out.print("\n-------  Home -------");
			System.out.print(
				"""

					1. Audiencias
					2. Em desenvolvimento
					3. Em desenvolvimento
					4. Em desenvolvimento
					5. Em desenvolvimento
					Opção (Zero p/sair):\s""");
			opcao = input.nextInt();
			input.nextLine();
			switch (opcao) {
				case 1 -> AudienciaController.main(null);
				case 2 -> System.out.println("Em desenvolvimento");
				case 3 -> System.out.println("Em desenvolvimento");
				case 4 -> System.out.println("Em desenvolvimento"); //ItemController.main(null);
				case 5 -> System.out.println("Em desenvolvimento");
				default -> {
					if (opcao != 0) System.out.println("Opção inválida.");
				}
			}
		} while(opcao != 0) ;
		System.out.println("\n\n!!!!!!!! Fim da aplicação !!!!!!!!");
		input.close(); //libera o recurso
	}

}//fim classe
