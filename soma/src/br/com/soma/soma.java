import java.util.*;
package br.com.soma;

public class soma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        int soma = numero1+numero2;
        System.out.print("a soma é =  "+soma);

	}

}
