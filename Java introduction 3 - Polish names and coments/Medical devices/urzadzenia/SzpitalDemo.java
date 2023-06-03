package urzadzenia;

public class SzpitalDemo {
    public static void main(String[] args) {
        Szpital szpital_1 = new Szpital("Szpital 1");
        System.out.println(szpital_1.getNazwa());
        szpital_1.getUrzadzenia(); //Poprawne: "Szpital nie posiada wprowadzonych urządzeń. Uzupełnij listę, aby uzyskać informacje."
        szpital_1.getUrzadzeniaInfo(); //Poprawne: "Szpital nie posiada wprowadzonych urządzeń. Uzupełnij listę, aby uzyskać informacje."

        Urzadzenie_Medyczne urzadzenie_1 = new Urzadzenie_Medyczne(1111, 2000,
                "SOR", "2024-01-01");
        Urzadzenie_Medyczne urzadzenie_2 = new Urzadzenie_Medyczne(2222, 2005,
                "SOR");
        Urzadzenie_Medyczne urzadzenie_3 = new Urzadzenie_Medyczne(3333, 2021,
                "Onkologiczny", "2024-01-01");
        Urzadzenie_Medyczne urzadzenie_4 = new Urzadzenie_Medyczne(4444, 2021,
                "Onkologiczny", "2022-01-01");

        szpital_1.dodaj(urzadzenie_1);
        szpital_1.dodaj(urzadzenie_2);
        szpital_1.dodaj(urzadzenie_3);
        szpital_1.dodaj(urzadzenie_4);

        szpital_1.getUrzadzeniaInfo(); // Poprawne: wypisuje urządzenia 1111,2222,3333,4444
        szpital_1.niewazne_przeglady(); // Poprawne: urządzenia o nr 2222, 4444

        szpital_1.usun(1111);
        szpital_1.getUrzadzeniaInfo(); //Poprawne: wypisuje urządzenia bez 1111

        szpital_1.usun(0000); //Poprawne: "Nie znaleziono urządzenia o podanym numerze seryjnym."
    }
}
