package mierniki;

/**
 * Klasa nadrzędna reprezentująca miernik. Przyjmuje informacje o typie miernika i jego modelu.
 */
public class Miernik {
    protected String typ;
    protected String model;
    /**
     * Konstruktor klasy Miernik
     * @param init_typ typ miernika
     * @param init_model model miernika
     * @throws NullPointerException jeżeli nie wprowadzono modelu lub typu miernika
     */
    public Miernik(String init_typ, String init_model){
        try {
            if (init_model == null) {
                throw new NullPointerException("Nie wprowadzono modelu miernika. To pole nie może być puste");
            } else {
                this.model = init_model;
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        try {
            if (init_typ == null) {
                throw new NullPointerException("Nie wprowadzono typu miernika. To pole nie może być puste");
            } else {
                this.typ = init_typ;
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

    }
    /**
     * Metoda ustawia typ miernika
     * @param nowe_typ typ miernika
     * @throws NullPointerException jeżeli nie wprowadzono modelu miernika
     */
    public void setTyp(String nowe_typ){
        try {
            if (nowe_typ == null) {
                throw new NullPointerException("Nie wprowadzono typu miernika. To pole nie może być puste");
            } else {
                this.typ = nowe_typ;
            }
       } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    /**
     * Metoda ustawia model miernika
     * @param nowe_model model miernika
     * @throws NullPointerException jeżeli nie wprowadzono typu miernika
     */
    public void setModel(String nowe_model){
        try {
            if (nowe_model == null) {
                throw new NullPointerException("Nie wprowadzono typu miernika. To pole nie może być puste");
            } else {
                this.model = nowe_model;
            }
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    /**
     * Metoda zwraca typ miernika
     * @return typ miernika
     */
    public String getTyp(){
        return this.typ;
    }
    /**
     * Metoda zwraca typ miernika
     * @return model miernika
     */
    public String getModel(){
        return this.model;
    }
    /**
     * Metoda zwraca reprezentację tekstową miernika
     */
    public void getInfo(){
        if (typ != null && model != null){
            System.out.println(typ + " [" + model + "]");
        } else if (typ == null && model == null) {
            System.out.println("Nie podano wszystkich wymaganych argumentów. W celu otrzymania infromacji zwrotnej " +
                    "uzupełnij informacje o typie i modelu miernika");
        } else if (model == null) {
            System.out.println("Nie podano wszystkich wymaganych argumentów. W celu otrzymania infromacji zwrotnej " +
                    "uzupełnij informacje o modelu miernika");
        } else {
            System.out.println("Nie podano wszystkich wymaganych argumentów. W celu otrzymania infromacji zwrotnej " +
                    "uzupełnij informacje o typie miernika");
        }
    }
}
