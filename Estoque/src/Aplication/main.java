package Aplication;

import java.util.Scanner;

import entities.product;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;

		product product = new product();
		System.out.println("Digite os dados do produto");
		System.out.print("Nome: ");
		product.name = sc.nextLine();
		System.out.print("Pre�o: ");
		product.price = sc.nextDouble();
		System.out.print("Quantidade no estoque: ");
		product.quantity = sc.nextInt();

		System.out.println();
		System.out.println("Dados do produto: " + product);
		System.out.println();
		System.out.println("voc� quer adicionar ou remover produto?");
		System.out.println("1-adicionar");
		System.out.println("2-remover ");
		a = sc.nextInt();

		if (a == 1) {

			System.out.println();
			System.out.println("Digite a quantidade do produto a ser adicionado: ");
			int quantity = sc.nextInt();
			product.addproduct(quantity);

			System.out.println();
			System.out.println("Data do produto atualizado: " + product);
		} else if (a == 2) {
			System.out.println();
			System.out.println("Digite a quantidade do produto a ser retirado: ");
			int quantity = sc.nextInt();

			product.removeproduct(quantity);

			System.out.println();
			System.out.println("Data do produto atualizado: " + product);
		}

		else
			System.out.println("Valor inv�lido tente novamente");
		{

		}

	}
}
