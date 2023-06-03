package urzadzenia;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeParseException;


class Urzadzenie_Medyczne {
    /**
     * Klasa reprezentująca urządzenie medyczne
     */
    private Integer nr_seryjny;
    private Integer rok_produkcji;
    private String oddzial;
    private String data_przegladu;

    public Urzadzenie_Medyczne(Integer init_nr_seryjny, Integer init_rok_produkcji, String init_oddzial, String init_data_przegladu) {
        /**
         * Konstruktor Urzadzenia Medycznego pobierający cztery parametry
         * @param init_nr_seryjny numer seryjny urządzenia medycznego
         * @param init_rok_produkcji rok produkcji urządzenia medycznego
         * @param init_oddzial oddział na jakim znajduje się urządzenie medyczne
         * @param init_data_przegladu data następnego przeglądu
         * @throws IllegalArgumentException jeżeli dane nie są poprawne
         * @throws NullPointerException jeżeli nie został wprowadzony parametr
         */
        try {
            if (init_nr_seryjny == null) {
                throw new NullPointerException("Nie wprowadzono numeru seryjnego. To pole nie może być puste.");
            } else if (init_nr_seryjny <= 0) {
                throw new IllegalArgumentException("Numer seryjny musi być liczbę całkowitą większą od 0.");
            } else if (init_rok_produkcji == null) {
                throw new NullPointerException("Nie wprowadzono roku produkcji. To pole nie może być puste.");
            } else if (Year.now().getValue() < init_rok_produkcji) {
                throw new IllegalArgumentException("Wprowadzono niepoprawny rok produkcji urządzenia.");
            } else if (init_oddzial == null) {
                throw new NullPointerException("Nie wprowadzono nazwy oddziału. To pole nie może być puste.");
            } else if (init_data_przegladu == null) {
                throw new NullPointerException("Nie wprowadzono daty przeglądu. To pole nie może być puste.");
            } else {
                nr_seryjny = init_nr_seryjny;
                rok_produkcji = init_rok_produkcji;
                oddzial = init_oddzial;
                data_przegladu = init_data_przegladu;
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public Urzadzenie_Medyczne(Integer init_nr_seryjny, Integer init_rok_produkcji, String init_oddzial) {
        /**
         * Konstruktor Urzadzenia Medycznego pobierający trzy parametry i ustawiający datę następnego przeglądu jako pustą
         * @param init_nr_seryjny numer seryjny urządzenia medycznego
         * @param init_rok_produkcji rok produkcji urządzenia medycznego
         * @param init_oddzial oddział na jakim znajduje się urządzenie medyczne
         */
        try {
            if (init_nr_seryjny == null) {
                throw new NullPointerException("Nie wprowadzono numeru seryjnego. To pole nie może być puste.");
            } else if (init_nr_seryjny <= 0) {
                throw new IllegalArgumentException("Numer seryjny musi być liczbę całkowitą większą od 0.");
            } else if (init_rok_produkcji == null) {
                throw new NullPointerException("Nie wprowadzono roku produkcji. To pole nie może być puste.");
            } else if (Year.now().getValue() < init_rok_produkcji) {
                throw new IllegalArgumentException("Wprowadzono niepoprawny rok produkcji urządzenia. To pole nie może być puste.");
            } else if (init_oddzial == null) {
                throw new NullPointerException("Nie wprowadzono nazwy oddziału. To pole nie może być puste.");
            } else {
                nr_seryjny = init_nr_seryjny;
                rok_produkcji = init_rok_produkcji;
                oddzial = init_oddzial;
                data_przegladu = null;
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setNr_seryjny(Integer nowe_nr_seryjny) {
        /**
         * Metoda pozwala na ustawienie numeru seryjnego urzadzenia medycznego
         * @param nowe_nr_seryjny  numer seryjny urzadzenia medycznego
         */
        try {
            if (nowe_nr_seryjny == null) {
                throw new NullPointerException("Nie wprowadzono numeru seryjnego. To pole nie może być puste.");
            } else if (nowe_nr_seryjny <= 0) {
                throw new IllegalArgumentException("Numer seryjny musi być liczbę całkowitą większą od 0.");
            } else {
                nr_seryjny = nowe_nr_seryjny;
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setRok_produkcji(Integer nowe_rok_produkcji) {
        /**
         * Metoda pozwala na ustawienie roku produkcji urzadzenia medycznego
         * @param nowe_nr_seryjny  rok produkcji urzadzenia medycznego
         */
        try {
            if (nowe_rok_produkcji == null) {
                throw new NullPointerException("Nie wprowadzono roku produkcji. To pole nie może być puste.");
            } else if (Year.now().getValue() > nowe_rok_produkcji) {
                throw new IllegalArgumentException("Wprowadzono niepoprawny rok produkcji urządzenia. To pole nie może być puste.");
            } else {
                rok_produkcji = nowe_rok_produkcji;
            }
        } catch (NullPointerException e) {
            System.out.println("Wprowadź dane roku produkcji ponownie.");
        } catch (IllegalArgumentException e) {
            System.out.println("Sprawdź poprawność wprowadzonych danych.");
        }
    }

    public void setOddzial(String nowe_oddzial) {
        /**
         * Metoda pozwala na ustawienie oddzialu urzadzenia medycznego
         * @param nowe_oddzial  oddzial urzadzenia medycznego
         */
        try {
            if (nowe_oddzial == null) {
                throw new NullPointerException("Nie wprowadzono nazwy oddziału. To pole nie może być puste.");
            } else {
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Sprawdź poprawność wprowadzonych danych.");
        }
    }

    public void setData_przegladu(String nowe_data) {
        /**
         * Metoda pozwala na ustawienie daty przeglądu urzadzenia medycznego
         * @param nowe_data  data przeglądu urzadzenia medycznego
         */
        try {
            if (nowe_data == null) {
                throw new NullPointerException("Nie wprowadzono daty przeglądu. To pole nie może być puste.");
            } else {
                data_przegladu = nowe_data;
            }
        } catch (NullPointerException e) {
            System.out.println("Wprowadź date ponownie.");
        } catch (IllegalArgumentException e) {
            System.out.println("Sprawdź poprawność wprowadzonych danych.");
        }
    }

    public Integer getNr_seryjny() {
        /**
         * Metoda wywołuje informację o numerze serujnym
         */
        return nr_seryjny;
    }

    public Integer getRok_produkcji() {
        /**
         * Metoda wywołuje informację o roku produkcji
         */
        return rok_produkcji;
    }

    public String getOddzial() {
        /**
         * Metoda wywołuje informację o oddziale
         */
        return oddzial;
    }

    public String getData_przegladu() {
        /**
         * Metoda wywołuje informację o dacie przegladu
         */
        return data_przegladu;
    }

    public boolean czyWazny() {
        /**
         * Metoda sprawdza czy urządzenie posiada waąny przegląd
         * @returns true jeśli przegląd jest ważny/false jeśli jest nieważny lub jeżeli nie został podany
         */
        try {
            if (data_przegladu == null) {
                throw new NullPointerException("Urządzenie nie ma wprowadzonej daty przeglądu");
            } else {
                return LocalDate.parse(data_przegladu).isAfter(LocalDate.now());
            }
        } catch (NullPointerException e) {
            System.out.println("Wprowadź datę przeglądu, aby móc zobaczyć czy jest ważny.");
            return false;
        } catch (DateTimeParseException e) {
            System.out.println("Zły format daty.");
            return false;
        }
    }

    public void getInfo() {
        /**
         * Metoda zwraca tekstową reprezentację klasy
         */
        if (nr_seryjny != null && rok_produkcji != null && oddzial != null) {
            if (czyWazny()) {
                System.out.println("SN: "+ nr_seryjny +" [" + rok_produkcji + "], " + oddzial + ", przegląd ważny");
            } else {
                System.out.println("SN: "+ nr_seryjny +" [" + rok_produkcji + "], " + oddzial + ", przegląd nieważny");
            }
        }
    }
}
