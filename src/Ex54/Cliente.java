package Ex54;

public class Cliente {

	public int id;
	public String nome;
	public int idade;
	public String email;
	public ContaBancaria conta;
	
	public Cliente(){
		
	}
	
	public Cliente(int id, String nome, int idade, String email, ContaBancaria conta){
		this.id =id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	}
	
	void atualizarEmail(String emailNovo) {
        this.email = emailNovo;
	}
	String exibirNomeIdade() {
		return "Nome: " + this.nome + " - " + "Idade: " + this.idade;
	}
 
	String exibirDadosConta() {
		ContaBancaria _conta = this.conta;
		return "AG: " + _conta.agencia + " - " + "N°: " + _conta.numero + " - " + "Saldo: " + _conta.saldo;
	}
}

