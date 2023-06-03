package mierniki;

public class MiernikAnalogowyDemo {
    public static void main(String[] args){
        MiernikAnalogowy analogowy1 = new MiernikAnalogowy("Amperomierz", "M-124", 1F);
        System.out.println(analogowy1.getTyp()); //Amperomierz
        System.out.println(analogowy1.getModel()); //M-124
        System.out.println(analogowy1.getKlasa()); //1.0
        analogowy1.getInfo(); //Amperomierz [M-124], klasa = 1.0
        analogowy1.setKlasa(0.5F);
        System.out.println(analogowy1.obliczNiepewnosc(0.2F)); //0.001

        MiernikAnalogowy analogowy2 = new MiernikAnalogowy("Amperomierz", "B-111", null);
        analogowy2.getInfo(); //Nie podano klasy miernika. To pole nie może być puste.
                              //Nie podano wszystkich wymaganych argumentów. W celu otrzymania infromacji zwrotnej uzupełnij informacje o mierniku.
        System.out.println(analogowy2.getKlasa()); //null
        analogowy2.setKlasa(1.5F);
        System.out.println(analogowy2.getKlasa()); //1.5

    }
}
