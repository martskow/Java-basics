package dokumenty;

public class KsiazkaDemo {
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka(null, null, 2009, "WSiP");
        ksiazka1.wygenerujOdnosnik(); //Nie podano autora i tytułu. Te pola nie mogą być puste.
                                      //Nie podano wszystkich niezbędnych danych. Uzupełnij informacje, aby móc wygenerować odnośnik
       ksiazka1.setAutor("A. Nowak");
       ksiazka1.setTytul("Mechanika układu kostnego");
       ksiazka1.wygenerujOdnosnik(); //A. Nowak: Mechanika układu kostnego. WSiP, 2009

        Ksiazka ksiazka2 = new Ksiazka("O. Ryszard", "Ciała niebieskie", 2025, "Czerwona Jaskółka");
        ksiazka2.wygenerujOdnosnik(); //Podano błędny rok.
                                      //Nie podano wszystkich niezbędnych danych. Uzupełnij informacje, aby móc wygenerować odnośnik
        ksiazka2.setRok(2020);
        ksiazka2.setWydawca("Czerwona stopa");
        System.out.println(ksiazka2.getWydawca()); //Czerwona stopa
        System.out.println(ksiazka2.getRok()); //2020
    }
}
