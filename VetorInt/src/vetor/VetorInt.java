package vetor;

import java.util.Scanner;

public class VetorInt {
	public static void main(String[] args) {
		int vet[] = new int[10];
		Scanner enter = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um numero inteiro: ");
			vet[i] = enter.nextInt();
		}
		enter.close();
		for(int i = 0; i < 10; i++) {
			System.out.println(vet[i] + " ");
		}
	}
}