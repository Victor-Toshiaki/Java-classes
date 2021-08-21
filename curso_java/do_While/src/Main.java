import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner vr = new Scanner(System.in);

		char res;
		do {
			System.out.print("Digite o Valor em °C: ");
			double C = vr.nextDouble();
			double F = 9 * C / 5 + 32;
			System.out.printf("Seu valor e F: %.2f%n", F);
			System.out.print("Deseja continuar? (s/n)");
			res = vr.next().charAt(0);

		} while (res != 'n');

	}

}
