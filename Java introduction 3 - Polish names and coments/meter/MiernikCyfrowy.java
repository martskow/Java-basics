package mierniki;
/**
 * Klasa MiernikAnalogowy - podrzędna w stosunku do klasy Miernik.
 * Przyjmuje informacje zawarte w klasie Miernik i informacje o składowych multiplikatywnej i addytywnej
 * miernika cyfrowego.
 */
public class MiernikCyfrowy extends Miernik {
    protected Float skladowa_multiplikatywna;
    protected Float skladowa_addytywna;

    /**
     * Konstruktor klasy MiernikAnalogowy
     * @param init_typ typ miernika
     * @param init_model model miernika
     * @param init_skladowa_multiplikatywna składowa multiplikatywna miernika
     * @param init_skladowa_addytywna składowa addytywna miernika
     * @throws NullPointerException jeżeli nie podano składowych miernika
     * @throws IllegalArgumentException jeżeli składowe (lub jedna z nich) przyjmuje niepoprawne wartości
     */
    public MiernikCyfrowy(String init_typ, String init_model, Float init_skladowa_multiplikatywna,
                          Float init_skladowa_addytywna) {
        super(init_typ, init_model);
        try {
            if (init_skladowa_multiplikatywna == null) {
                throw new NullPointerException("Nie podano składowej multiplikatywnej. To pole nie może być puste.");
            } else if (init_skladowa_multiplikatywna <= 0){
                throw new IllegalArgumentException("Składowa multiplikatywna miernika nie może być liczbą mniejszą lub równą zero.");
            } else {
                skladowa_multiplikatywna = init_skladowa_multiplikatywna;
            }
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            if (init_skladowa_addytywna == null) {
                throw new NullPointerException("Nie podano składowej addytywnej. To pole nie może być puste.");
            } else if (init_skladowa_addytywna <= 0){
                throw new IllegalArgumentException("Składowa addytywna miernika nie może być liczbą mniejszą lub równą zero.");
            } else {
                skladowa_addytywna = init_skladowa_addytywna;
            }
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Metoda ustawia składową multiplikatywną miernika
     * @param nowe_skladowa_multiplikatywna składowa multiplikatywna miernika
     * @throws NullPointerException jeżeli nie wprowadzono składowej multiplikatywnej miernika
     * @throws IllegalArgumentException jeżeli składowa multiplikatywna przyjmuje niepoprawne wartości
     */
    public void setSkladowa_multiplikatywna(Float nowe_skladowa_multiplikatywna) {
        try {
            if (nowe_skladowa_multiplikatywna == null) {
                throw new NullPointerException("Nie podano składowej multiplikatywnej miernika. To pole nie może być puste.");
            } else if (nowe_skladowa_multiplikatywna <= 0){
                throw new IllegalArgumentException("Składowa multiplikatywna miernika nie może być liczbą mniejszą lub równą zero.");
            } else {
                skladowa_multiplikatywna = nowe_skladowa_multiplikatywna;
            }
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Metoda ustawia składową addytywną miernika
     * @param nowe_skladowa_addytywna składowa addytywna miernika
     * @throws NullPointerException jeżeli nie wprowadzono składowej addytywnej miernika
     * @throws IllegalArgumentException jeżeli składowa addytywna przyjmuje niepoprawne wartości
     */
    public void setSkladowa_addytywna(Float nowe_skladowa_addytywna) {
        try {
            if (nowe_skladowa_addytywna == null) {
                throw new NullPointerException("Nie podano składowej addytywnej miernika. To pole nie może być puste.");
            } else if (nowe_skladowa_addytywna <= 0){
                throw new IllegalArgumentException("Składowa addytywna miernika nie może być liczbą mniejszą lub równą zero.");
            } else {
                skladowa_addytywna = nowe_skladowa_addytywna;
            }
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Metoda zwraca składową multiplikatywną miernika
     * @return składowa multiplikatywna miernika
     */
    public Float getSkladowa_multiplikatywna(){
        return skladowa_multiplikatywna;
    }
    /**
     * Metoda zwraca składową addytywną miernika
     * @return składowa addytywna miernika
     */
    public Float getSkladowa_addytywna(){
        return skladowa_addytywna;
    }
    /**
     * Metoda oblicza niepewność bezwzględną pomiaru miernika analogowego
     * @param wartosc_pomiaru wartość pomiaru miernikiem
     * @return niepewność bezwzględną pomiaru miernika
     * @throws IllegalArgumentException jeżeli któraś ze składowych (lub obie) przyjmują niepoprawną wartość
     */
    public float obliczNiepewnosc(Float wartosc_pomiaru){
        if (wartosc_pomiaru != null) {
            if ((skladowa_multiplikatywna == null || skladowa_multiplikatywna < 0) &&
                    (skladowa_addytywna == null || skladowa_addytywna < 0)) {
                throw new IllegalArgumentException("Obie składowe przyjmują niepoprawne wartości.");
            } else if (skladowa_multiplikatywna == null || skladowa_multiplikatywna < 0){
                throw new IllegalArgumentException("Składowa multiplikatywna przyjmuje niepoprawną wartość.");
            } else if (skladowa_addytywna == null || skladowa_addytywna < 0) {
                throw new IllegalArgumentException("Składowa addytywna przyjmuje niepoprawną wartość.");
            }
        } else {
            throw new IllegalArgumentException("Nie podano wartości pomiaru. To pole nie może być puste.");
        }
        return (skladowa_multiplikatywna * wartosc_pomiaru + skladowa_addytywna);
    }
    @Override
    public void getInfo(){
        if (typ != null && model != null && skladowa_multiplikatywna != null && skladowa_addytywna != null){
            System.out.println(typ + " [" + model + "], składowa multiplikatywna = " + skladowa_multiplikatywna +
                    ", składowa addytywna = " + skladowa_addytywna);
        } else if (typ == null || model == null || skladowa_multiplikatywna == null || skladowa_multiplikatywna <= 0 ||
                skladowa_addytywna == null || skladowa_addytywna <= 0) {
            System.out.println("Nie podano wszystkich wymaganych argumentów. W celu otrzymania infromacji zwrotnej " +
                    "uzupełnij informacje o mierniku");
        }
    }
}

