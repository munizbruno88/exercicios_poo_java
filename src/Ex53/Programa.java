package Ex53;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		Aluno[] listaAluno = new Aluno[5];
		
		for(int i=0;i<5;i++) {
			Aluno aluno = new Aluno();
			
			System.out.println("Digite o RA do aluno:");
			aluno.ra = ler.next();
			
			System.out.println("Digite o nome do aluno:");
			aluno.nome = ler.next();
			
			System.out.println("Digite as siglas das 6 materias cursadas pelo aluno:");
			for(int x=0;x<6;x++) {
				
				System.out.println("Digite a sigla da matéria");
				aluno.materias[x] = ler.next();
			}
			do {
				System.out.println("Digite o periodo cursado pelo aluno (Manhã <-> Tarde <-> Noite)");
				aluno.periodo = ler.next();
				}while(!aluno.periodo.equals("Manhã") && !aluno.periodo.equals("Tarde") && !aluno.periodo.equals("Noite"));
			
			listaAluno[i] = aluno;
		
	   }
		for(int i=0;i<5;i++) {
			if(listaAluno[i].periodo.equals("Noite"));
			System.out.println("RA: "+listaAluno[i].ra+" Nome: "+listaAluno[i].nome+" Periodo: "+listaAluno[i].periodo);
			
		}
}
}
