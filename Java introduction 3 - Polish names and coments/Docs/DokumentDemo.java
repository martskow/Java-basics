package dokumenty;

/**
 * Klasa pokazuje działanie klasy Dokument
 */
public class DokumentDemo {
    public static void main(String[] args) {
        Dokument dok1 = new Dokument("Adrian Baranowski", "Psy i koty");
        dok1.wygenerujOdnosnik(); //Adrian Baranowski: Psy i koty
        System.out.println(dok1.getTytul()); //Psy i koty
        System.out.println(dok1.getAutor()); //Adrian Baranowski

        dok1.setAutor("A. Baranowski");
        dok1.setTytul("Tylko koty");
        dok1.wygenerujOdnosnik(); //A. Baranowski: Tylko koty

        Dokument dok2 = new Dokument(null, "Psy"); //Nie podano autora. To pole nie może być puste.
        System.out.println(dok2.getAutor()); //null
        dok2.wygenerujOdnosnik(); //Nie podano wszystkich niezbędnych danych. Uzupełnij informację o autorze, aby móc wygenerować odnośnik

        Dokument dok3 = new Dokument("A. Baranowski", null); //Nie podano tytułu. To pole nie może być puste.
        System.out.println(dok3.getAutor()); //null
        dok3.wygenerujOdnosnik(); //Nie podano wszystkich niezbędnych danych. Uzupełnij informację o tytule, aby móc wygenerować odnośnik
        dok3.setTytul("Konie");
        dok3.wygenerujOdnosnik(); //A. Baranowski: Konie
    }
}
