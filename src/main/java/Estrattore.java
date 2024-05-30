import java.util.Scanner;

public class Estrattore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MazzoDiCarte mazzo = new MazzoDiCarte();
        SacchettoTombola sacchetto = new SacchettoTombola();

        while (true) {
            System.out.println("Scegli un'operazione:");
            System.out.println("1. Distribuire una carta");
            System.out.println("2. Estrarre un numero della tombola");
            System.out.println("3. Uscire");
            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Carta distribuita: " + mazzo.distribuisciCarta());
                    break;
                case 2:
                    System.out.println("Numero estratto: " + sacchetto.estraiNumero());
                    break;
                case 3:
                    System.out.println("Uscita dal programma.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Scelta non valida, riprova.");
            }
        }
    }
}