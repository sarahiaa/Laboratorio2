package lab2;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int numero, String cliente) {
		super(numero, cliente);
	}

	@Override
	public void sacar(double valor) {
		if (valor >0 && saldo >= valor) {
			saldo -= valor;
			System.out.println("Saque de R$ " + valor + " realizado ✅");
		} else {
			System.out.println("Seu saldo é insuficiente para esse saque ❌");
		}
	}
	
	@Override
	public void transferir(Conta destino, double valor) {
		if(valor>0 && saldo >= valor) {
			saldo -= valor;
			destino.depositar(valor);
		System.out.println("Transferência de R$ " + valor + " realizado ✅");
		} else {
			System.out.println("Seu saldo é insuficiente para essa transferência ❌");
		}
	}
}
