package dokumenty;

public class RozdzialDemo {
    public static void main(String[] args) {
        Rozdzial rozdzial1 = new Rozdzial("A. Nowak", "Stawy jednoosiowe", 2020,
                "Politechnika Wrocławska", "J. Lewandowski",
                "Biomechaniczne podstawy połączeń kości");
        rozdzial1.wygenerujOdnosnik(); //A. Nowak: Stawy jednoosiowe. W: Biomechaniczne podstawy połączeń kości, red. J. Lewandowski.
                                       //Politechnika Wrocławska, 2020
        rozdzial1.setRedaktor("J. Osa");
        rozdzial1.setTytul_ksiazki("Stawy w ludzkim ogranizmie");
        System.out.println(rozdzial1.getRedaktor()); //J. Osa
        System.out.println(rozdzial1.getTytul_ksiazki()); //Stawy w ludzkim ogranizmie

        Rozdzial rozdzial2 = new Rozdzial("R. Hyży", "Wstęp", 2000, "WSiP",
                null, "Boso po Tajlandii");
        rozdzial2.wygenerujOdnosnik(); //Nie podano redaktora. To pole nie może być puste.
                                       //Nie podano wszystkich niezbędnych danych. Uzupełnij informacje, aby móc wygenerować odnośnik

        Rozdzial rozdzial3 = new Rozdzial("R. Hyży", "Wstęp", 2000, "WSiP",
                "P. Nizioł", null);
        rozdzial3.wygenerujOdnosnik(); //Nie podano tytułu książki. To pole nie może być puste.
                                       //Nie podano wszystkich niezbędnych danych. Uzupełnij informacje, aby móc wygenerować odnośnik

    }
}
