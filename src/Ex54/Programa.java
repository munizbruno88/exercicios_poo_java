package Ex54;

import java.util.Scanner;

public class Programa {
 
    public static void main(String[] args) {
        Cliente[] listaClientes = new Cliente[5];
 
        Scanner ler = new Scanner(System.in);
 
        for (int i = 0; i < 2; i++) {
            int id = i;
            String contaa = "s";
 
            String agencia = "", numero = "";
            double saldo = 0;
 
            System.out.printf("Dados do cliente %d ", i + 1);
            System.out.println("");
 
            System.out.printf("Nome: ");
            String nome = ler.next();
 
            System.out.printf("Email: ");
            String email = ler.next();
 
            System.out.printf("Idade: ");
            int idade = ler.nextInt();
 
            System.out.println("Possui conta bancaria? s/n");
            contaa = ler.next();
            
            
            if (!contaa.equals("n")) {
                System.out.println("Agencia");
                agencia = ler.next();
 
                System.out.println("Numero");
                numero = ler.next();
 
                System.out.println("Saldo");
                saldo = ler.nextDouble();
            }
 
            ContaBancaria conta = new ContaBancaria(agencia, numero, saldo);
            Cliente cliente = new Cliente(id, nome, idade, email, conta);
            System.out.println("");
 
            listaClientes[i] = cliente;
        }
 
        for (int i = 0; i < 2; i++) {
            System.out.println(listaClientes[i].exibirNomeIdade());
            if (!listaClientes[i].conta.agencia.equals("") && 
                !listaClientes[i].conta.numero.equals("")) {
                System.out.println(listaClientes[i].exibirDadosConta());
            }
            System.out.println("-------------------------");
 
        }
 
    }
 
}