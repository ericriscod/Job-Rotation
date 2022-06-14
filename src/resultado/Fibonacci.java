package resultado;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor: ");
		
		System.out.println(fibonacci(sc.nextInt()));
		

	}

	public static String fibonacci(int n) {
		if (n == 1) return "Esse número pertence a sequência de Fibonacci na posição: 1 e 2";
		if (n == 2)	return "Esse número pertence a sequência de Fibonacci na posição: 2"; 

		int f = 0, f1 = 0, f2 = 1, i = 0, x = 0;

		for (i = 3; i <= n; i++) {
			f = f1 + f2;
			f1 = f2;
			f2 = f;
			
			if(n == f) return "Esse número pertence a sequência de Fibonacci na posição: " + i;
		}
		
		return "Esse número NÃO pertence a sequência de Fibonacci";
	}
}