package Ex51;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		Cliente[] listaCliente = new Cliente[5];
		
		for(int i=0;i<5;i++) {
			
			Cliente cliente = new Cliente();
			
			System.out.printf("Cadastre o cliente número %d:\n",i+1);
			
			System.out.println("Digite o id do cliente:");
			cliente.id = ler.nextInt();
			
			System.out.println("Digite o nome do cliente:");
			cliente.nome = ler.next();
			
			System.out.println("Digite a idade do cliente:");
			cliente.idade = ler.nextInt();
			
			System.out.println("Digite o email do cliente:");
			cliente.email = ler.next();
			
			listaCliente[i] = cliente;
			
			System.out.printf("Usuário cadastrado!\n\n");
			
		}
			System.out.printf("Clientes cadastrados com sucesso:");
			for(int i=0;i<5;i++) {
				if(listaCliente[i].idade>18) {
				System.out.printf("\nID: %d\nNome: %s\nIdade: %d\nEmail: %s\n",listaCliente[i].id,listaCliente[i].nome,listaCliente[i].idade
						,listaCliente[i].email);
				}
			
			}
			}
			
			
		
	}

