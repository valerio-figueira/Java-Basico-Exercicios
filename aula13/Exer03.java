package com.valerio.cursojava.aula13;

import java.util.Scanner;

public class Exer03 {
	static Scanner key = new Scanner(System.in);

	public static void main(String[] args) {

		int soma;

		System.out.println("Digite um n�mero inteiro: ");
		int num1 = key.nextInt();
		System.out.println("Digite outro n�mero inteiro: ");
		int num2 = key.nextInt();

		soma = num1 + num2;

		System.out.println("Resultado da soma �: " + soma);

	}
}
