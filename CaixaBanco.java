package aula1;

import java.util.Scanner;

public class CaixaBanco {

	public static void main(String[] args) {
		
		int saque;
		int notas100;
		int notas50;
		int notas20;
		int notas10;
		int notas5;
		int resto; 
		
		System.out.println("Informe o valor do Saque: ");
		Scanner scanner = new Scanner(System.in);  
		saque = scanner.nextInt();
		
		if (saque%5 != 0){System.out.println("O valor para Saque está incorreto: " + saque);
		}
		else {
			notas100 = (saque/100);
			resto = (saque % 100);	
			System.out.println("Você receberá: " +notas100 + " Nota(s) de R$ 100");
		   
			notas50 = (resto/50);
			resto = (resto % 50);
			System.out.println("Você receberá: " +notas50 + " Nota(s) de R$ 50");
			
			notas20 = (resto/20);
			resto = (resto%20);
			System.out.println("Você receberá: " +notas20 + " Nota(s) de R$ 20");
			
			notas10 = (resto/10);
			resto = (resto%10);
			System.out.println("Você receberá: " +notas10 + " Nota(s) de R$ 10");
			
			notas5 = (resto/5);
			System.out.println("Você receberá: " +notas5 + " Nota(s) de R$ 5");
						
		}
		
		//System.out.println("Notas de 100: " +notas100, "Notas de 50: " +notas50);
			
		
		}
		
		
		
	}

