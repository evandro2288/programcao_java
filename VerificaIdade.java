package aula1;

import java.util.Scanner;

public class VerificaIdade {
	public static void main (String [] args){
						
		System.out.println("Informe a primeira idade: ");
		Scanner scanner = new Scanner(System.in);  
		int idade1 = scanner.nextInt(); 

		String mensagem = idade1 >= 18 ? "Idade maior que 18 anos" : "Idade menor que 18 anos";
		
		System.out.println(mensagem);		
	
	}

}
