package aula1;

import java.util.Scanner;

public class CalcOper {
	public static void main(String[] args) {
		
		double num1;
		double num2;
		
		System.out.println("Digite o primeiro numero:  ");
		Scanner scanner = new Scanner(System.in);  
		num1 = scanner.nextDouble();

		System.out.println("Digite o segundo numero:  ");
		num2 = scanner.nextDouble();
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		
	}
}
