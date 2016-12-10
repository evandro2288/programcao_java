package aula1;

import java.util.Scanner;

public class ParImpar {
	
	public static void main(String[] args) {
		
		System.out.println("Informe o Nome do Primeiro Jogador: ");
		Scanner scanner = new Scanner(System.in);  
		String nome1 = scanner.next(); 
		

		System.out.println("Informe o Numero do Primeiro Jogador: ");
		int num1 = scanner.nextInt(); 

		System.out.println("Informe o Nome do Segundo Jogador: ");
		String nome2 = scanner.next(); 

		System.out.println("Informe o Numero do Segundo Jogador: ");
		int num2 = scanner.nextInt(); 
		
		int res = (num1 +num2) % 2;
		
		String mensagem = res == 0 ? "Jogador 1 venceu: " + nome1 : "Jogador 2 venceu: " + nome2;
	
		System.out.println(mensagem);
	}

}
