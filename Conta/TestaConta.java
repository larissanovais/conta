import java.util.Scanner;

public class TestaConta {

	public static void main(String[] args) {

		int opcao = 0;

		float valor;
		
		boolean sai = false;

		Scanner in = new Scanner(System.in);

		Conta cb1 = new Conta();

		System.out.println("Informe o nome do titular da conta: ");
		String nome = in.nextLine();
		cb1.AlterarNome(nome);

		do {

			System.out.print("1 = Sacar; 2 = Depositar; 3 = Consultar Saldo; 4 = Sair;");
			opcao = in.nextInt();

			switch (opcao) {
			case 1: {

				System.out.println("Informe o valor do saque: ");
				valor = in.nextFloat();
				cb1.sacar(valor);
				break;
			}

			case 2: {

				System.out.println("Informe o valor do depósito: ");
				valor = in.nextFloat();
				cb1.depositar(valor);
				break;
			}

			case 3: {

				System.out.println("Saldo da conta: " + cb1.consultarSaldo());
				break;

			}
			
			case 4: {

				System.out.println("TCHAU!!!");
				sai = true;
				in.close();
				break;

			}
			default:
				throw new IllegalArgumentException("Valor inesperado: " + opcao);
			}

		} while (!sai);
		
		in.close();

	}
	
	

}
