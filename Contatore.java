import java.util.Scanner;

public class Contatore {
    private int conta = 0;
    private int passo;

    public Contatore(int passo) {
        this.passo = passo;
    }

    public void setPasso(int passo) {
        this.passo = passo;
    }

    public void incrementa() {
        conta += passo;
    }

    public void decrementa() {
        // Controllo per evitare che il contatore scenda in negativo sotto lo zero
        if (conta >= passo) {
            conta -= passo;
        } else {
            System.out.println("Impossibile decrementare: il contatore è già a zero.");
        }
    }

    public int getConto() {
        return conta;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il passo del contatore: ");
        int passo = scanner.nextInt();

        Contatore contatore = new Contatore(passo); // Crea un nuovo oggetto della classe Contatore (sarebbe l'istanza)
        char scelta;

        do {
            System.out.print("Scegli un'operazione (+ per incrementare, - per decrementare, = per visualizzare, 0 per uscire): ");
            scelta = scanner.next().charAt(0);

            switch (scelta) {
                case '+':
                    contatore.incrementa();
                    System.out.println("Il Contatore è stato incrementato.");
                    break;
                case '-':
                    contatore.decrementa();
                    System.out.println("Contatore decrementato.");
                    break;
                case '=':
                    System.out.println("Stato attuale del contatore: " + contatore.getConto());
                    break;
                case '0':
                    System.out.println("Chiusura del programma...");
                    break;
                default:
                    System.out.println("Operazione non valida. Riprova.");
                    break;
            }
        } while (scelta != '0');

        scanner.close();
    }
}
