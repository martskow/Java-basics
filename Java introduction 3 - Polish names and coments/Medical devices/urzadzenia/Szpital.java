package urzadzenia;

import java.util.ArrayList;

class Szpital {
    /**
     * Klasa reprezentująca zbiór wszystkich urządzeń medycznych w szpitalu
     */
    private String nazwa;
    private ArrayList<Urzadzenie_Medyczne> urzadzenia;

    public Szpital (String init_nazwa) {
        /**
         * Konstruktor Szpitala pobierający dwa parametry
         * @param init_nazwa nazwa szpitala
         * @param init_urzadzenia lista urządzeń szpitala
         * @throws IllegalArgumentException jeżeli dane nie są poprawne
         * @throws NullPointerException jeżeli nie został wprowadzony parametr
         */
        try {
            if (init_nazwa == null) {
                throw new NullPointerException("Nie wprowadzono nazwy szpitala. To pole nie może być puste.");
            } else {
                nazwa = init_nazwa;
                urzadzenia = new ArrayList<>();
            }
        } catch (NullPointerException e) {
            System.out.println("Wprowadź dane ponownie.");
        } catch (IllegalArgumentException e) {
            System.out.println("Sprawdź poprawność wprowadzonych danych.");
        }
    }

    public void setNazwa(String nowe_nazwa) {
        /**
         * Metoda pozwala na ustawienie nazwy szpitala
         * @param nowe_nazwa  nazwa szpitala
         */
        nazwa = nowe_nazwa;
    }

    public void setUrzadzenia(ArrayList<Urzadzenie_Medyczne> nowe_urzadzenia) {
        /**
         * Metoda pozwala na ustawienie listy urządzeń szpitala
         * @param nowe_urzadzenia  lista urządzeń szpitala
         */
        urzadzenia = nowe_urzadzenia;
    }

    public String getNazwa() {
        /**
         * Metoda wywołuje informację o nazwie szpitala
         * @returns nazwa nazwa szpitala
         */
        return nazwa;
    }

    public ArrayList<Urzadzenie_Medyczne> getUrzadzenia() {
        /**
         * Metoda wywołuje informację o urządzeniach szpitala
         * @returns urzadzenia urządzenia szpitala
         */
        if (urzadzenia.size() == 0) {
            System.out.println("Szpital nie posiada wprowadzonych urządzeń. Uzupełnij listę, aby uzyskać informacje.");
        }
        return urzadzenia;
    }

    public void  dodaj (Urzadzenie_Medyczne urzadzenie) {
        /**
         * Metoda dodaje urządzenie do listy urządzeń szpitala
         * @param urzadzenie obiekt urządzenie medyczne utworzone przez klasę Urzadzenie_Medyczne
         * @throws NullPointerException jeżeli nie został wprowadzony parametr
         */
        try {
            if (urzadzenie == null) {
                throw new NullPointerException("Nie wprowadzono urządzenia. W celu dodania urządzenia do listy wprowadź dane.");
            } else {
                urzadzenia.add(urzadzenie);
            }
        } catch (NullPointerException e) {
            System.out.println("Niepoprawne dane.Wprowadź dane urządzenia ponownie.");
        } catch (IllegalArgumentException e) {
            System.out.println("Sprawdź poprawność wprowadzonych danych urządzenia.");
        }
    }
    public void usun (int nr_seryjny) {
        /**
         * Metoda usuwa urządzenie o zadanym numerze seryjnym z listy urządzeń szpitalnych
         * o ile takowy się na niej znajduje
         * @param nr_seryjny unumer seryjny urządzenia
         */
        try {
            boolean znacznik = false;
            for (int i = 0; i < urzadzenia.size(); i++) {
                if (urzadzenia.get(i).getNr_seryjny() == nr_seryjny){
                    urzadzenia.remove(i);
                    znacznik = true;
                    break;
                }
            }
            if (znacznik) {
                System.out.println("Urządzenie zostało usunięte pomyślnie.");
            } else {
                System.out.println("Nie znaleziono urządzenia o podanym numerze seryjnym.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Sprawdź poprawność wprowadzonych danych.");
        } catch (NullPointerException e) {
            System.out.println("Wprowadź dane.");
        }
    }

    public void getUrzadzeniaInfo () {
        /**
         * Metoda zwraca tekstową informacje na temat wszystkich urządzeń szpitala
         */
        try {
            if (urzadzenia.size() == 0) {
                System.out.println("Szpital nie posiada wprowadzonych urządzeń. Uzupełnij listę, aby uzyskać informacje.");
            } else {
                for (int i = 0; i < urzadzenia.size(); i++) {
                    urzadzenia.get(i).getInfo();
                    }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Sprawdź poprawność wprowadzonych danych.");
        } catch (NullPointerException e) {
            System.out.println("Wprowadź dane.");
        }
    }

    public void niewazne_przeglady () {
        /**
         * Metoda zwraca reprezentację tekstową urządzeń o nieważnym przeglądzie.
         * @throws NullPointerException jeżeli nie został wprowadzony parametr
         */
        try {
            if (urzadzenia.size() == 0) {
                throw new NullPointerException("Szpital nie posiada wprowadzonych urządzeń. " +
                        "Uzupełnij listę, aby uzyskać informacje.");
            } else {
                for (int i = 0; i < urzadzenia.size(); i++) {
                    if (!urzadzenia.get(i).czyWazny()) {
                        urzadzenia.get(i).getInfo();
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Wprowadź dane.");
        } catch (IllegalArgumentException e) {
            System.out.println("Sprawdź poprawność wprowadzonych danych");
        }
    }


}
