package Vector;

public class VectorDemo {
    /**
     * The class demonstrates the operation of the Vector class
     */
    public static void main(String[] args) {
        Vector wektor_1 = new Vector(1,1);
        Vector wektor_2 = new Vector(1.5, 4.9);

        System.out.println(wektor_1.getX()); //1
        System.out.println(wektor_1.getY()); //1

        System.out.println(wektor_1.dlugoscWektora()); //1,41...

        Vector wektor_3 = wektor_1.skalowanie(3);
        wektor_1.getInfo(); //v = [1.0, 1.0]
        wektor_3.getInfo(); //v = [3.0, 3.0]

        wektor_1.setX(2);
        wektor_1.setY(3);
        wektor_1.getInfo(); //v = [2.0, 3.0]

        wektor_2.getInfo(); //v = [1.5, 4.9]
        System.out.println(wektor_2.dlugoscWektora()); //Poprawne: 5,12...
        wektor_2 = wektor_2.skalowanie(3);
        System.out.println(wektor_2.dlugoscWektora()); //Poprawne: 15,37...
    }
}
