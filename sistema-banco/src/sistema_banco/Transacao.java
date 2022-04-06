package sistema_banco;

import java.util.Calendar;

public class Transacao {
	private int id;
	private Calendar data;
	private double valor;
	
	public Transacao(int id, double valor) {
		this.id = id;
		this.valor = valor;
		
	}
	
	public String toString() {
		return ("O valor de uma transação não pode ser mudado");
		
	}
	
	public double getValor() {
		return valor;
	}
	
	public int getID() {
		return id;
	}

}
