package dokumenty;
import java.time.LocalDate;

/**
 * Klasa podrzędna względem klasy Dokument, reprezentująca książkę.
 */
public class Ksiazka extends Dokument {
    protected Integer rok;
    protected String wydawca;

    /**
     * Konstruktor klasy Ksiazka
     * @param init_autor autor książki
     * @param init_tytul tytul książki
     * @param init_rok rok wydania książki
     * @param init_wydawca wydawca książki
     */
    public Ksiazka (String init_autor, String init_tytul, Integer init_rok, String init_wydawca){
        super(init_autor, init_tytul);
        try {
            if (init_rok == null && init_wydawca == null) {
                throw new NullPointerException("Nie podano wydawcy i roku. Te pola nie mogą być puste.");
            } else if (init_rok == null) {
                throw new NullPointerException("Nie podano roku. To pole nie może być puste.");
            } else if (init_wydawca == null) {
                throw new NullPointerException("Nie podano wydawcy. To pole nie może być puste.");
            } else if (init_rok < 1500 || init_rok > LocalDate.now().getYear()) {
                throw new IllegalArgumentException("Podano błędny rok.");
            } else {
                this.rok = init_rok;
            }
            if (init_wydawca != null){
                this.wydawca = init_wydawca;
            }
        } catch (NullPointerException | IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * Metoda ustawia nową wartość roku
     * @param nowe_rok nowa wartość roku
     */
    public void setRok(Integer nowe_rok) {
        try {
            if (nowe_rok == null) {
                throw new NullPointerException("Nie podano roku. To pole nie może być puste.");
            } else if (nowe_rok < 1500 || nowe_rok > LocalDate.now().getYear()) {
                throw new IllegalArgumentException("Podano błędny rok.");
            } else {
                this.rok = nowe_rok;
            }
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Metoda ustawia nowego wydawcę
     * @param nowe_wydawca nowy wydawca
     */
    public void setWydawca(String nowe_wydawca) {
        try {
            if (nowe_wydawca == null) {
                throw new NullPointerException("Nie podano wydawcy. To pole nie może być puste.");
            } else {
                this.wydawca = nowe_wydawca;
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Metoda zwraca rok wydania książki
     * @return rok wydania książki
     */
    public Integer getRok() {
        return rok;
    }

    /**
     * Metoda zwraca wydawcę książki
     * @return wydawca książki
     */
    public String getWydawca() {
        return wydawca;
    }

    /**
     * Metoda generuje odnośnik do książki i zwraca jego reprezentację tekstową
     */
    @Override
    public void wygenerujOdnosnik() {
        if (autor != null && tytul != null && rok != null && wydawca != null) {
            System.out.println(autor + ": " + tytul + ". " + wydawca + ", " + rok);
        } else {
            System.out.println("Nie podano wszystkich niezbędnych danych. Uzupełnij informacje, aby móc " +
                    "wygenerować odnośnik");
        }
    }
}
