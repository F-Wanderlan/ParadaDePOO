package sistema_banco;

public class Correntista {
	private String cpf;
	private String nome;
	private Conta conta;
	
	public void Correntista(String cpf, String nome) {
		
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	


}
