package mierniki;

/**
 * Klasa pokazuje działanie klasy Miernik
 */
public class MiernikDemo {
    public static void main(String[] args) {
        Miernik miernik1 = new Miernik("Woltomierz", "ABC-123");
        miernik1.getInfo(); //Poprawne: "Woltomierz [ABC-123]"
        System.out.println(miernik1.getTyp());
        System.out.println(miernik1.getModel());

        Miernik miernik2 = new Miernik(null, "123-456"); //Poprawne: "Nie wprowadzono typu miernika. To pole nie może być puste"
        miernik2.getInfo(); //"Nie podano wszystkich wymaganych argumentów. W celu otrzymania infromacji zwrotnej uzupełnij informacje o typie miernika"
        System.out.println(miernik2.getTyp()); //null
        miernik2.setTyp("Omomierz");
        System.out.println(miernik2.getTyp()); //Omomierz
        miernik2.getInfo(); //Omomierz [123-456]

        Miernik miernik3 = new Miernik("Watomierz", null); //Poprawne: "Nie wprowadzono modelu miernika. To pole nie może być puste"
        miernik3.getInfo(); //"Nie podano wszystkich wymaganych argumentów. W celu otrzymania infromacji zwrotnej uzupełnij informacje o modelu miernika"
        miernik3.setModel("CCC-111");
        System.out.println(miernik3.getTyp()); //Watomierz
        miernik3.getInfo(); //Watomierz [CCC-111]

        Miernik miernik4 = new Miernik(null, null);
        miernik4.getInfo(); //"Nie podano wszystkich wymaganych argumentów. W celu otrzymania infromacji zwrotnej uzupełnij informacje o typie i modelu miernika"
        miernik4.setModel("AAABBB");
        miernik4.setTyp("Amperomierz");
        miernik4.getInfo(); //Amperomierz [AAABBB]
    }
}
