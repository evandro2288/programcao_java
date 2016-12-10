package aula1;

import java.util.Random;
import java.util.Scanner;

public class JogoAcertar {
	public static void main(String[] args) {
		
		int tentativa;
		int num = new Random().nextInt(10);
		int a;
		System.out.println(+num);
		System.out.println("Informe a primeira tentativa: ");
		Scanner scanner = new Scanner(System.in);  
		tentativa = scanner.nextInt(); 
		
				
		for (a=1;tentativa != num; a++){
			System.out.println("Voce ainda não acertou");
			
			System.out.println("Informe a primeira tentativa: ");
			tentativa = scanner.nextInt(); 
		}
			System.out.println("Voce acertou em: " +a + " 1" + "tentativas");
		}
		
	}


