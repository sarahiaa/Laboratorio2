package lab2;

import java.text.spi.BreakIteratorProvider;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static ArrayList<Conta> contas = new ArrayList<>();
	private static int proxNum = 101; //O npumero da conta é gerado automaticamente d eforma sequencial
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int opcao;
		
		System.out.println("==============================================");
        System.out.println("       🏦​💲​​ BEM VINDO AO BANCO FELIZ 🏦💲​    ");
        System.out.println("   \"Seu saldo caiu, nossa alegria subiu 😁​!\"");
        System.out.println("==============================================");

 
        do {
        	System.out.println("✦ MENU ✦");
        	System.out.println("Qual opção deseja realizar?");
			System.out.println("1 - Criar conta");
			System.out.println("2 - Realizar depósito");
			System.out.println("3 - Realizar saque");
			System.out.println("4 - Realizar Transferência");
			System.out.println("5 - Listar contas");
			System.out.println("6 - Calcular total de tributos");
			System.out.println("7 - Sair");
			opcao = leitor.nextInt();
			leitor.nextLine();
        
        switch (opcao) {
		case 1: 
			criarConta(leitor);
			break;
		case 2: 
			realizarDeposito(leitor);
			break;
		case 3: 
			realizarSaque(leitor);
			break;
		case 4: 
			realizarTransferencia(leitor);
			break;
		case 5: 
			listarContas();
			break;
		case 6:
			calcularTributos();
			break;
		case 7:
			System.out.println("🖥️​ Encerrado o sistema...");
			System.out.println("👋🏼​​ Obrigado por usar o Banco Feliz");
			break;	
		default:
			System.out.println("🚫​ Essa opção é inválida. Tente outra opção.");
		}
        }
        while (opcao != 7);
		

	}

}
