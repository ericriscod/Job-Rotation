package resultado;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor: ");
		
		System.out.println(fibonacci(sc.nextInt()));
		

	}

	public static String fibonacci(int n) {
		if (n == 1) return "Esse n�mero pertence a sequ�ncia de Fibonacci na posi��o: 1 e 2";
		if (n == 2)	return "Esse n�mero pertence a sequ�ncia de Fibonacci na posi��o: 2"; 

		int f = 0, f1 = 0, f2 = 1, i = 0, x = 0;

		for (i = 3; i <= n; i++) {
			f = f1 + f2;
			f1 = f2;
			f2 = f;
			
			if(n == f) return "Esse n�mero pertence a sequ�ncia de Fibonacci na posi��o: " + i;
		}
		
		return "Esse n�mero N�O pertence a sequ�ncia de Fibonacci";
	}
}