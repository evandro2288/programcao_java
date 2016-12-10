package aula1;

import java.util.Scanner;

public class LerNomes {
	public static void main (String[] args)
	{
						
		System.out.println("Digite o nome1:  ");
		
		Scanner scanner = new Scanner(System.in);  
		String nome = scanner.nextLine();

		System.out.println(nome);
		
		System.out.println("Digite o nome2:  ");
		
		Scanner scanner1 = new Scanner(System.in);  
		String nome1 = scanner.nextLine();

		System.out.println(nome);
		System.out.println(nome=nome1);
	}

}
