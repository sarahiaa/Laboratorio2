package lab2;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	private static ArrayList<Conta> contas = new ArrayList<>();
	private static int proxNum = 101; //O numero da conta é gerado automaticamente d eforma sequencial
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int opcao;
		
		System.out.println("==============================================");
        System.out.println("       🏦​💲​​ BEM VINDO AO BANCO FELIZ 🏦💲​    ");
        System.out.println("     Seu saldo caiu, nossa alegria subiu 😁​!    ");
        System.out.println("=============================================="); 

        
        do {
        	System.out.println();
        	System.out.println("✦ MENU ✦");
        	System.out.println("Qual opção deseja realizar?");
			System.out.println("1 - Criar conta");
			System.out.println("2 - Realizar depósito");
			System.out.println("3 - Realizar saque");
			System.out.println("4 - Realizar transferência");
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
			System.out.println("🖥️ Encerrando o sistema...");
			System.out.println("👋🏼 Obrigado por usar o Banco Feliz!");
			break;	
		default:
			System.out.println("🚫 Essa opção é inválida. Tente outra.");
        	} 
        }
        while (opcao != 7);
	}
		
        private static void criarConta(Scanner leitor) {
        	System.out.println("👤​ Qual o nome do cliente ? ");
        	String nome = leitor.nextLine();
        	
        	System.out.println("Qual o tipo de conta ?");
        	System.out.println("1 - Conta corrente");
        	System.out.println("2 - Conta poupança");
        	int tipoConta = leitor.nextInt();
        	
        	Conta conta = null;
        	if (tipoConta == 1) {
        		conta = new ContaCorrente(proxNum++, nome);
        		System.out.println("Conta corrente criada com sucesso ​🧾​");
        	} else if (tipoConta == 2) {
        		conta = new ContaPoupanca(proxNum++, nome);
        		System.out.println("Conta poupança criada com sucesso 🧾​");
			} else {
				System.out.println("🚫 Tipo de conta inválido. Escolha outro tipo.");

			}
        	
        	if(conta != null) {
        	contas.add(conta);
        	System.out.println("O número da sua conta é " + conta.getNumero() + " 🧾​");
        	System.out.println("🎉 Bem-vindo(a), " + nome + "!");

        	}
        }

        
        private static void realizarDeposito(Scanner leitor) {
        	System.out.println("Qual o número da conta ?");
        	int num = leitor.nextInt();
        	System.out.println("Qual o valor do depósito?");
        	double valor = leitor.nextDouble();
        	
        	Conta conta= buscarConta(num);
        	if (conta != null) {
        		System.out.println("💵 Processando o depósito...");
        		conta.depositar(valor);
        	} else {
        			System.out.println("​​​❌​ Conta não encontrada. Verifique e tente novamente.");
				}
			}
        	
        private static void realizarSaque(Scanner leitor) {
        	System.out.println("Qual o número da conta ?");
        	int num = leitor.nextInt();
        	System.out.println("Qual o valor do saque ?");
        	double valor = leitor.nextDouble();
        	
        	Conta conta = buscarConta(num);
        	if (conta != null) {
        		System.out.println("💸 Processando o saque...");
        		conta.sacar(valor);
        	} else {
				System.out.println("❌ Conta não encontrada. Verifique e tente novamente");
			}
		}
        
        private static void realizarTransferencia(Scanner leitor) {
        	System.out.println("Qual o número da conta de origem ?");
        	int numOrigem = leitor. nextInt();
        	System.out.println("Qual o número da conta de destino ?");
        	int numDestino = leitor.nextInt();
        	
        	System.out.println("Qual o valor da transferência ?");
        	double valor = leitor.nextDouble();
        	
        	Conta origem = buscarConta(numOrigem);
        	Conta destino = buscarConta(numDestino);
        	
        	if (origem != null && destino != null) {
        		System.out.println("🔁 Realizando transferência...");
        		origem.transferir(destino, valor);
        	} else {
				System.out.println("Ocorreu um erro. Conta(s) inexistente(s) ​​​​❌​");
			}
        }
        
        private static void listarContas() {
        	if(contas.isEmpty()) {
        		System.out.println("Nenhuma conta foi cadastrada ​​​​👥​");
        	} else {
				System.out.println("===== Essas são as contas cadastradas: =====");
				 for (Conta conta : contas) {
		                String tipoConta;

		                if (conta instanceof ContaCorrente) {
		                    tipoConta = "Conta corrente";
		                } else if (conta instanceof ContaPoupanca) {
		                    tipoConta = "Conta poupança";
		                } else {
		                    tipoConta = "Tipo desconhecido";
		                }

		                System.out.println("Número: " + conta.getNumero());
		                System.out.println("Cliente: " + conta.getCliente());
		                System.out.println("Saldo: R$ " + String.format("%.2f", conta.getSaldo()));
		                System.out.println("Tipo: " + tipoConta);
		                System.out.println("--------------------------------------");

				} System.out.println("======================================");
			}
        }

        private static void calcularTributos() {
        	double total = 0;
        	for(Conta c: contas) {
        		if (c instanceof Itributavel tributavel) {
        			total += tributavel.calcularTributos();
					
				}
        	}
        	System.out.println("🧮​ Calculando tributos do Banco Feliz...");
        	System.out.println("💰 Total de tributos: R$ " + String.format("%.2f", total));

        }
        
        private static Conta buscarConta(int num) {
        	for (Conta c: contas) {
        		if (c.getNumero() == num) {
        			return c;
				}
        	}
        	return null; 
        }
}
