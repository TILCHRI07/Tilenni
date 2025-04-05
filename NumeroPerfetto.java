import java.util.Scanner;

public class NumeroPerfetto {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numero;

		do {
			System.out.println("Inserisci un numero (0 per terminare): ");
			numero = scanner.nextInt();

			if (numero == 0) {
				break;
			}

			int sommadivisori = 0;

			for (int i = 1; i <= numero/2; i++) {
				if (numero % i == 0) {
					sommadivisori += i;
				}
			}
			if (numero == sommadivisori) {
				System.out.println("E' davvero PERFETTO");

			} else {
				System.out.println("NON PERFETTO");
			}

		} while (numero != 0);
	}
}