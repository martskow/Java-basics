package dokumenty;

/**
 * Klasa podrzędna w stosunku do klasy Książka. Reprezentuje rozdział książki.
 */
public class Rozdzial extends Ksiazka{
    protected String redaktor;
    protected String tytul_ksiazki;

    /**
     * Konstruktor klasy Rozdzial
     * @param init_autor autor książki
     * @param init_tytul tytuł rodziału
     * @param init_rok rok wydania książki
     * @param init_wydawca wydawca książki
     * @param init_redaktor redaktor książki
     * @param init_tytul_ksiazki tytuł książki
     * @throws NullPointerException jeżeli którys z parametrów nie został podany
     * @throws IllegalArgumentException jeżeli w nazwisku redaktora występują niedozwolone znaki
     */
    public Rozdzial (String init_autor, String init_tytul, Integer init_rok, String init_wydawca, String init_redaktor,
                     String init_tytul_ksiazki) {
        super(init_autor, init_tytul, init_rok, init_wydawca);
        try {
            if (init_redaktor != null) {
                for (int i = 0; i < init_redaktor.length(); i++) {
                    if (!Character.isLetter(init_redaktor.charAt(i)) && init_redaktor.charAt(i) != ' ' &&
                            init_redaktor.charAt(i) != '.') {
                        throw new IllegalArgumentException("Nazwisko redaktora składa się z niepoprawnych znaków.");
                    }
                }
                    this.redaktor = init_redaktor;
            } else {
                throw new NullPointerException("Nie podano redaktora. To pole nie może być puste.");
            }
            if (init_tytul_ksiazki != null) {
                this.tytul_ksiazki = init_tytul_ksiazki;
            } else {
                throw new NullPointerException("Nie podano tytułu książki. To pole nie może być puste.");
            }
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Ustawia nowego redaktora
     * @param nowe_redaktor nowy redaktor
     * @throws NullPointerException jeżeli nie podano nowego redaktora
     * @throws IllegalArgumentException jeżeli w nazwisku redaktora występują niedozwolone znaki
     */
    public void setRedaktor(String nowe_redaktor) {
        try {
            if (nowe_redaktor != null) {
                for (int i = 0; i < nowe_redaktor.length(); i++) {
                    if (!Character.isLetter(nowe_redaktor.charAt(i)) && nowe_redaktor.charAt(i) != ' ' &&
                            nowe_redaktor.charAt(i) != '.') {
                        throw new IllegalArgumentException("Nazwisko redaktora składa się z niepoprawnych znaków.");
                    }
                }
                this.redaktor = nowe_redaktor;
            } else {
                throw new NullPointerException("Nie podano redaktora. To pole nie może być puste.");
            }
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Ustawia nowy tytuł książki
     * @param nowe_tytul_ksiazki nowy tytuł książki
     * @throws NullPointerException jeżeli nie podano nowego tytułu książki
     */
    public void setTytul_ksiazki(String nowe_tytul_ksiazki) {
        try {
            if (nowe_tytul_ksiazki != null) {
            this.tytul_ksiazki = nowe_tytul_ksiazki;
            } else {
                throw new NullPointerException("Nie podano tytułu książki. To pole nie może być puste.");
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Metoda zwraca redaktora rozdziału
     * @return redaktor rozdziału
     */
    public String getRedaktor() {
        return redaktor;
    }
    /**
     * Metoda zwraca tytuł książki, w której znajduje się rozdział
     * @return tytuł książki
     */
    public String getTytul_ksiazki() {
        return tytul_ksiazki;
    }
    /**
     * Metoda generuje odnośnik do rozdziału i zwraca jego reprezentację tekstową.
     */
    @Override
    public void wygenerujOdnosnik() {
        if (autor != null && tytul != null && rok != null && wydawca != null && redaktor != null &&
                tytul_ksiazki != null) {
            System.out.println(autor + ": " + tytul + ". W: " + tytul_ksiazki + ", red. " + redaktor + ".\n" + wydawca + ", " + rok);
        } else {
            System.out.println("Nie podano wszystkich niezbędnych danych. Uzupełnij informacje, aby móc " +
                    "wygenerować odnośnik");
        }
    }
}
