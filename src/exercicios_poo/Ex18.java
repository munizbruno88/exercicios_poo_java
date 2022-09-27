package exercicios_poo;
/*
 * 18. Criar um programa para analisar a velocidade de um automóvel. Solicitar via teclado os valores da aceleração (a em m/s2), 
 * velocidade inicial (v0 em m/s) e o tempo de percurso (t em s). Calcular e exibir a velocidade final do automóvel em km/h. 
 * E exibir mensagem de acordo com a tabela abaixo:
 */
import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		double a,vi,t,vf,vkm; 
		
		System.out.printf("Digite a aceleracao que estava o carro: ");
		a = ler.nextDouble();
		
		System.out.printf("Digte a velocidade inicial em que estava o carro: ");
		vi = ler.nextDouble();
		
		System.out.printf("Digite o tempo que o percurso foi feito: ");
		t= ler.nextDouble();
		
		vf = vi + (a*t);
		
		System.out.printf("Velocidade final = %.2f m/s.\n", vf);
		
		vkm = vf*3.6;
		
		if(vkm<=40) {
			System.out.printf("Velocidade em km/h = %.2f.\n", vkm);
			System.out.println("Veiculo muito Lento!");
		}else if(vkm<=60) {
			System.out.printf("Velocidade em km/h = %.2f.\n", vkm);
			System.out.println("Veiculo permitida!");
		}else if(vkm<=80) {
			System.out.printf("Velocidade em km/h = %.2f.\n", vkm);
			System.out.println("Veiculo de cruzeiro!");
		}else if(vkm<=120) {
			System.out.printf("Velocidade em km/h = %.2f.\n", vkm);
			System.out.println("Veiculo rapido!");
		}else {
			System.out.printf("Velocidade em km/h = %.2f.\n", vkm);
			System.out.println("Veiculo muito rapido!");
		}
	}

}
