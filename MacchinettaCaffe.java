import java.util.Scanner;

public class MacchinettaCaffe {
	private int cucchiainiZuccheroContenuti;
	private int caffeContenuti;
	private int caffeErogati;

	public MacchinettaCaffe(int cucchianiZuccheroContenuti, int caffeContenuti) {
		this.cucchiainiZuccheroContenuti = cucchianiZuccheroContenuti;
		this.caffeContenuti = caffeContenuti;
		this.caffeErogati = 0;
	}

	public void faiCaffe(int cucchiainiZucchero) {
		if (caffeContenuti > 0 && cucchiainiZuccheroContenuti >= cucchiainiZucchero) {
			caffeContenuti--;
			cucchiainiZuccheroContenuti -= cucchiainiZucchero;
			caffeErogati++;
			System.out.println("Caffè erogato con " + cucchiainiZucchero + " cucchiaini di zucchero.");
		} else {
			System.out.println("Impossibile erogare il caffè. ");
		}
	}

	public void ricarica() {
		caffeContenuti = 10;
		cucchiainiZuccheroContenuti = 10;
		System.out.println("Macchinetta ricaricata di caffe e zucchero. ");
	}

	public int getCaffeErogati() {
		return caffeErogati;
	}

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		MacchinettaCaffe macchinetta = new MacchinettaCaffe(10,10);
        String scelta;

        do {
            System.out.print("Mi raccomando scegli un'operazione prima (caffe per fare un caffe, zucchero per scegliere cucchiaini di zucchero, visualizza per vedere il numero di caffè erogati, ricarica per ricaricare la macchinetta, 0 per uscire): ");
            scelta = scanner.next();

            switch (scelta) {
                case "ricarica":
                    macchinetta.ricarica();
                    break;

                case "caffe":
                    System.out.print("Quanti cucchiaini di zucchero vuoi? ");
                    int zucchero = scanner.nextInt();
                    macchinetta.faiCaffe(zucchero);
                    break;

                case "visualizza":
                    System.out.println("Numero di caffè erogati: " + macchinetta.getCaffeErogati());
                    break;
                
                
                default:
                    System.out.println("Operazione non valida. Riprova.");
                    break;
            }
        } while (scelta != "0");

        scanner.close();
    }
}