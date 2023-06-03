package dokumenty;

/**
 * Klasa nadrzędna reprezentująca dokument.
 */
public class Dokument {
    protected String autor;
    protected String tytul;

    /**
     * Konstruktor klasy Dokument.
     * @param init_autor Autor dokumentu
     * @param init_tytul Tytuł dokumentu
     * @throws NullPointerException jeżeli nie podano któregoś z parametrów
     * @throws IllegalArgumentException jeżeli w nazwisku wystąpiły niedozwolone znaki
     */
    public Dokument (String init_autor, String init_tytul){
        try {
            if (init_autor == null && init_tytul == null) {
                throw new NullPointerException("Nie podano autora i tytułu. Te pola nie mogą być puste.");
            } else if (init_autor == null) {
                throw new NullPointerException("Nie podano autora. To pole nie może być puste.");
            } else {
                for (int i = 0; i < init_autor.length(); i++) {
                    if (!Character.isLetter(init_autor.charAt(i)) && init_autor.charAt(i) != ' ' &&
                            init_autor.charAt(i) != '.') {
                        throw new IllegalArgumentException("Nazwisko składa się z niepoprawnych znaków.");
                    }
                    this.autor = init_autor;
                }
            }
            if (init_tytul != null){
                this.tytul = init_tytul;
            } else {
                throw new NullPointerException("Nie podano tytułu. To pole nie może być puste.");
            }
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Metoda ustawia nowego autora dokumentu
     * @param nowe_autor autor dokumentu
     * @throws NullPointerException jeżeli nie podano nowego autora
     * @throws IllegalArgumentException jeżeli w nazwie nowego autora występują niedozwolone znaki
     */
    public void setAutor (String nowe_autor){
        try {
            if (nowe_autor == null) {
                throw new NullPointerException("Nie podano autora i tytułu. Te pola nie mogą być puste.");
            } else {
                for (int i = 0; i < nowe_autor.length(); i++) {
                    if (!Character.isLetter(nowe_autor.charAt(i)) && nowe_autor.charAt(i) != ' ' &&
                            nowe_autor.charAt(i) != '.') {
                        throw new IllegalArgumentException("Nazwisko składa się z niepoprawnych znaków.");
                    }
                }
                this.autor = nowe_autor;
            }
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Metoda ustawia tytuł dokumentu
     * @param nowe_tytul nowy tytuł dokumentu
     * @throws NullPointerException jeżeli nie wprowadzono nowego tytułu
     */
    public void setTytul(String nowe_tytul) {
        try {
            if (nowe_tytul == null) {
                throw new NullPointerException("Nie podano tytułu. To pole nie może być puste.");
            } else {
                this.tytul = nowe_tytul;
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Metoda zwraca nazwę autora
     * @return autor dokumentu
     */
    public String getAutor(){
        return autor;
    }

    /**
     * Metoda zwaraca tytuł dokumentu
     * @return tytuł dokumentu
     */
    public String getTytul(){
        return tytul;
    }

    /**
     * Metoda generuje odnośnik dokumentu i zwraca jego reprezentacje tekstową
     */
    public void wygenerujOdnosnik() {
        if (autor != null && tytul != null) {
            System.out.println(autor + ": " + tytul);
        } else if (autor == null && tytul != null) {
            System.out.println("Nie podano wszystkich niezbędnych danych. Uzupełnij informację o autorze, aby móc " +
                    "wygenerować odnośnik");
        } else if (tytul == null && autor != null) {
            System.out.println("Nie podano wszystkich niezbędnych danych. Uzupełnij informację o tytule, aby móc " +
                    "wygenerować odnośnik");
        } else {
            System.out.println("Nie podano wszystkich niezbędnych danych. Uzupełnij informację o tytule i autorze, aby " +
                    "móc wygenerować odnośnik");
        }
    }
}
