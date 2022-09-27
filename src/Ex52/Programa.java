package Ex52;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		Produto[] listaProduto = new Produto[10];
		
		for(int i=0;i<10;i++) {
			Produto produto = new Produto();
			System.out.println("Digite o id do produto");
			produto.id = ler.nextInt();
			
			System.out.println("Digite a descrição do produto");
			produto.descricao = ler.next();
			
			System.out.println("Digite o valor do produto");
			produto.valor = ler.nextDouble();
			
			System.out.println("Digite a quantidade do produto");
			produto.quantidade = ler.nextDouble();
			
			listaProduto[i] = produto;
			
			System.out.printf("Produto cadastrado!\n\n");
		}
			System.out.println("Produtos registrados:");
		for(int i=0;i<10;i++) {
			if(listaProduto[i].valor<100) {
				System.out.printf("ID: %d\nDescrição: %s\nValor: %.2f\nQuantidade: %.2f\n",listaProduto[i].id,listaProduto[i].descricao
						,listaProduto[i].valor,listaProduto[i].quantidade);
			}
		}
		
	}

}
