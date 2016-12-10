package aula1;

import java.util.Scanner;

public class MediaAluno {
	public static void main(String[] args) {
		
		System.out.println("Informe o nome do Aluno: ");
		Scanner scanner = new Scanner(System.in);  
		String nome = scanner.next(); 
		
		System.out.println("Informe a primeira nota: ");
		double nota1 = scanner.nextDouble(); 
		
		System.out.println("Informe a segunda do Aluno: ");
		double nota2 = scanner.nextDouble(); 
		
		System.out.println("Informe a terceira do Aluno: ");
		double nota3 = scanner.nextDouble(); 
		
		double media = ((nota1 + nota2 + nota3)/3);
		
		System.out.println("Sua média foi: " +media);
		
		if (media >= 7)
			{System.out.println("O Aluno:" + nome + " FOI APROVADO");
			} 
		else if (media >= 4){System.out.println("O Aluno: " + nome + " ESTÁ EM EXAME");
		} 
		  else { System.out.println("O Aluno: " + nome + " FOI REPROVADO"); 
		}
	}

}
