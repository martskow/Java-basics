package urzadzenia;

public class Urzadzenie_MedyczneDemo {
    public static void main(String[] args) {
        Urzadzenie_Medyczne urzadzenie_1 = new Urzadzenie_Medyczne(1111, 2000,
                "SOR", "2024-01-01");
        urzadzenie_1.getInfo(); //Poprawne: SN: 1111 [2000], SOR, przegląd ważny
        urzadzenie_1.setNr_seryjny(1110);
        urzadzenie_1.setRok_produkcji(2024);
        urzadzenie_1.setOddzial("Położniczy");
        urzadzenie_1.setData_przegladu("2022-01-01");
        urzadzenie_1.getInfo(); //Poprawne: SN: 1110 [2024], SOR, przegląd nieważny

        Urzadzenie_Medyczne urzadzenie_2 = new Urzadzenie_Medyczne(10, 2000,
                "SOR");
        urzadzenie_2.setNr_seryjny(13);
        System.out.println(urzadzenie_2.getNr_seryjny());
        urzadzenie_2.setRok_produkcji(2022);
        System.out.println(urzadzenie_2.getRok_produkcji());
        urzadzenie_2.setOddzial("Kardiologiczny");
        System.out.println(urzadzenie_2.getOddzial());
        urzadzenie_2.setData_przegladu("2024-01-01");
        System.out.println(urzadzenie_2.getData_przegladu());
        System.out.println(urzadzenie_2.czyWazny());

        Urzadzenie_Medyczne urzadzenie_3 = new Urzadzenie_Medyczne(12, 2025,
                "Onkologiczny", "2024-01-01");
        urzadzenie_3.getInfo(); // Poprawne: "Wprowadzono niepoprawny rok produkcji urządzenia."

        Urzadzenie_Medyczne urzadzenie_4 = new Urzadzenie_Medyczne(-10, 2022,
                "SOR", "2024-01-01");
        urzadzenie_4.getInfo(); //Numer seryjny musi być liczbę całkowitą większą od 0.

        Urzadzenie_Medyczne urzadzenie_5 = new Urzadzenie_Medyczne(12, 2022,
                "SOR", "data");
        urzadzenie_5.getInfo(); // Poprawne: "Zły format daty"


    }
}
