package lab2;

public abstract class Conta {
	
	//Atributos e métodos comuns a todas as contaas
	protected int numero;
	protected String cliente;
	protected double saldo;
	
	public Conta(int numero, String cliente) {
		this.numero= numero;
		this.cliente = cliente;
		this.saldo = 0.0;}

	public int getNumero() {
		return numero;
	}

	/*public void setNumero(int numero) {
		this.numero = numero;
	}*/

	public String getCliente() {
		return cliente;
	}

	/*public void setCliente(String cliente) {
		this.cliente = cliente;
	}*/

	public double getSaldo() {
		return saldo;
	}

	/*public void setSaldo(double saldo) {
		this.saldo = saldo;
	}*/
	
	public void depositar(double valor) {
		if (valor >0) {
			saldo += valor;
			System.out.println("Depósito de R$" + valor + "realizado ✅​");
		}else {
			System.out.println("Esse valor é inválido para depósito ​❌​");
		}
	}
	
	//Implementação nas classes filhas
	public abstract void sacar(double valor);
	public abstract void transferir(Conta destino, double valor);
	
	
}

