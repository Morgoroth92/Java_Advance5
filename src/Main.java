public class Main {
    public static void main(String[] args) {

        divisione(2,0);

    }

    public static void divisione(Integer numeratore, Integer denominatore) {
        try {
            if (numeratore == null || denominatore == null) {
                throw new NullPointerException("Uno dei valori è null");
            }

            if (denominatore == 0) {
                throw new ArithmeticException("Non si può dividere per zero");
            }

            int risultato = numeratore / denominatore;
            System.out.println("Il risultato della divisione è: " + risultato);

        } catch (ArithmeticException e) {
            System.out.println("Errore di divisione: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Errore di valore null: " + e.getMessage());
        }
    }


}