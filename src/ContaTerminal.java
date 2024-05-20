import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor, digite o número da Agência!");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Agencia: ");
		String agencia = sc.next();
		System.out.print("Nome: ");
		String nomeCliente = sc.next();
		System.out.print("Saldo: ");
		double saldo = sc.nextDouble();

		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: "
				+ agencia + ", conta: " + numero + " e seu saldo: " + saldo + " já está disponível para saque");

	}

}
