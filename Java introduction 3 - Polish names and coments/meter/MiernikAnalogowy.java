package mierniki;
/**
 * Klasa MiernikAnalogowy - podrzędna w stosunku do klasy Miernik.
 * Przyjmuje informacje zawarte w klasie Miernik i informacje o klasie miernika analogowego.
 */
public class MiernikAnalogowy extends Miernik {
    protected Float klasa;

    /**
     * Konstruktor klasy MiernikAnalogowy
     * @param init_typ typ miernika
     * @param init_model model miernika
     * @param init_klasa klasa miernika
     * @throws NullPointerException jeżeli nie podano klasy miernika
     * @throws IllegalArgumentException jeżeli klasa przyjmuje niepoprawne wartości
     */
    public MiernikAnalogowy(String init_typ, String init_model, Float init_klasa) {
        super(init_typ, init_model);
        try {
            if (init_klasa == null) {
                throw new NullPointerException("Nie podano klasy miernika. To pole nie może być puste.");
            } else if (init_klasa <= 0){
                throw new IllegalArgumentException("Klasa miernika nie może być liczbą mniejszą lub równą zero.");
            } else {
                this.klasa = init_klasa;
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Metoda ustawia klasę miernika
     * @param nowe_klasa typ miernika
     * @throws NullPointerException jeżeli nie wprowadzono modelu miernika
     * @throws IllegalArgumentException jeżeli klasa przyjmuje niepoprawne wartości
     */
    public void setKlasa(Float nowe_klasa) {
        try {
            if (nowe_klasa == null) {
                throw new NullPointerException("Nie podano klasy miernika. To pole nie może być puste.");
            } else if (nowe_klasa <= 0){
                throw new IllegalArgumentException("Klasa miernika nie może być liczbą mniejszą lub równą zero.");
            } else {
                klasa = nowe_klasa;
            }
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Metoda zwraca klasę miernika
     * @return klasa miernika
     */
    public Float getKlasa(){
        return klasa;
    }
    /**
     * Metoda oblicza niepewność bezwzględną pomiaru miernika analogowego
     * @param zakres zakres miernika
     * @return niepewność bezwzględną pomiaru miernika
     * @throws IllegalArgumentException jeżeli zakres przyjmuje niepoprawną wartość
     */
    public float obliczNiepewnosc(Float zakres){
        if (zakres == null || zakres < 0) {
                throw new IllegalArgumentException("Zakres przyjmuje niepoprawną wartość.");
            }
        return (klasa * zakres)/100;
    }
    @Override
    public void getInfo(){
        if (typ != null && model != null && klasa != null && klasa > 0){
            System.out.println(typ + " [" + model + "], klasa = " + klasa);
        } else if (typ == null || model == null || klasa == null || klasa <= 0) {
            System.out.println("Nie podano wszystkich wymaganych argumentów. W celu otrzymania infromacji zwrotnej " +
                    "uzupełnij informacje o mierniku.");
        }
    }
}
