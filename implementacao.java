package Lore;
import java.util.Scanner;
import java.util.Scanner;

public class implementacao {

	public static void main(String[] args) {
		int a,b;
		Scanner ler= new Scanner (System.in);
		try {
		System.out.println("Digite um número: ");
		a=ler.nextInt();
		System.out.println("Digite um número: ");
		b=ler.nextInt();
			
			System.out.println("resultado");
			System.out.println("soma: " + (a+b));
			System.out.println("multiplicação: " +(a*b));
			System.out.println("menos: " + (a-b));
				System.out.println("divisão: " + (a/b));
			System.out.println ("valor invalido");
			System.out.println("divisão exata: " + ((double)a/b));
		}
	catch (ArithmeticException erro) {
		System.out.println("valor invalido");
		
		}
	}
}


