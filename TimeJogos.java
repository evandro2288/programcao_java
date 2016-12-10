package aula1;

import java.util.Scanner;

public class TimeJogos {
	public static void main(String[] args) {
		
		System.out.println("Informe a Tima A: ");
		Scanner scanner = new Scanner(System.in);  
		String timea = scanner.next(); 
		
		System.out.println("Informe a Tima A: ");
		String timeb = scanner.next(); 
		
		int partida;
		int a;
		int n;
		int mediaA;
		int mediaB;
		
		
		System.out.println("Quantidade de partidas = ");
		partida = scanner.nextInt();
		
		
		for (a = 1; partida > a; a++){
			System.out.println("Placar time A = ");
			int placarA = scanner.nextInt();
			mediaA += placarA
			
			System.out.println("Placar time B = ");
			int placarB = scanner.nextInt();
			mediaB += placarB
			
		}
		
	}

}
