package exercise3;

public class Banca {
    public static void main(String args[]) {
        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 2000);

        System.out.println("Saldo conto: " + conto1.restituisciSaldo());

        try {
            conto1.preleva(1750.5);

            System.out.println("Saldo conto: " + conto1.restituisciSaldo());
        } catch (BancaException e) {
            System.out.println(" Errore durante il prelievo: " + e);
            e.printStackTrace();
        }

        ContoOnline conto2 = new ContoOnline("Rossi Luigi", 50350.0, 1500);

        conto2.stampaSaldo();

        try {
            conto2.preleva(1500);

            conto2.stampaSaldo();

        } catch (BancaException e) {
            System.out.println(" Errore durante il prelievo: " + e);
            e.printStackTrace();
        }
    }


}
