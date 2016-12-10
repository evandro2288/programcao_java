package aula1;

import java.util.Scanner;

public class OrdemCrescente {
	public static void main(String[] args) {
		
		double var1;
		double var2;
		double var3;
		double maior;
		double menor;
		double meio;
		
		System.out.println("Informe o primeiro: ");
		Scanner scanner = new Scanner(System.in);  
		var1 = scanner.nextDouble(); 
		
		System.out.println("Informe o segundo numero: ");
		var2 = scanner.nextDouble(); 
		
		System.out.println("Informe o terceiro numero: ");
		var3 = scanner.nextDouble(); 
		
		
			if  (var1 > var2){
				maior = var1;
				menor = var2;
			}  else {
				maior = var2;
				menor = var1;
			}
			
			if (var3 > maior){
				meio = maior;
				maior = var3;
				
			}
			else if (var3 < menor){
				meio = menor;
				menor = var3;
			}
			else meio = var3;
			
			System.out.println("A ordem ficou: " +maior +" " +meio +" " +menor);
		
	
	}
		
	}
