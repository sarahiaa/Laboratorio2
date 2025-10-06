package lab2;

public class ContaCorrente extends Conta implements Itributavel{
		
	public ContaCorrente(int numero, String cliente) {
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
		
		@Override
		public void transferir(Conta destino, double valor) {
			double taxa = valor * 0.05;
			double totalTransferir = valor + taxa;
			
			if (valor > 0 && saldo >= totalTransferir) {
				saldo -= totalTransferir;
				destino.depositar(valor);
				System.out.println("Transferência de R$ " + valor + "realizada ✅");

				
			} else {
				System.out.println("Seu saldo é insuficiente para essa transferência ❌");

			}
		}
		
		@Override
		public double calcularTributos() {
			return saldo * 0.01;
		}
}
