package lab2;

public class ContaCorrente extends Conta implements Itributavel{
		public ContaCorrente(int numero, String Cliente) {
			super(numero, cliente);
		}
		@Override
		public void sacar (double valor) {
			double taxa = valor * 0.05;
			double totalSaque = valor * taxa;
			
			if (valor >0 && saldo >= totalSaque) {
				saldo -= totalSaque;
				System.out.println("Saque de R$ " + valor + "realizado ✅");
			} else {
				System.out.println("Seu saldo é insuficiente par saque ❌");

			}

		}
		
}
