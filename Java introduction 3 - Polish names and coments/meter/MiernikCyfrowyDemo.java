package mierniki;

public class MiernikCyfrowyDemo {
    public static void main(String[] args){
        MiernikCyfrowy cyfrowy1 = new MiernikCyfrowy("Omomierz", "A-111", 0.05F, 0.3F);
        System.out.println(cyfrowy1.getSkladowa_multiplikatywna()); //0.05
        System.out.println(cyfrowy1.getSkladowa_addytywna()); //0.3
        cyfrowy1.setSkladowa_multiplikatywna(0.005F);
        cyfrowy1.setSkladowa_addytywna(0.4F);
        System.out.println(cyfrowy1.getSkladowa_multiplikatywna()); //0.005
        System.out.println(cyfrowy1.getSkladowa_addytywna()); //0.4
        System.out.println(cyfrowy1.obliczNiepewnosc(100F)); //0.9

        MiernikCyfrowy cyfrowy2 = new MiernikCyfrowy("Omomierz", "B-222", 0.5F, null);
        cyfrowy2.getInfo(); //Nie podano wszystkich wymaganych argumentów. W celu otrzymania infromacji zwrotnej uzupełnij informacje o mierniku
        System.out.println(cyfrowy2.getSkladowa_addytywna()); //null


    }


}
