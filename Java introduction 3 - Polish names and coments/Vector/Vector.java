package Vector;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
* A class that represents a vector in a two-dimensional Cartesian coordinate system
*/
public class Vector {
    private double x;
    private double y;

    /**
    * The default vector constructor
    */
    public Vector(){
        x = 0;
        y = 0;
    }

    /**
    * Vector constructor that retrieves information about the ends of the vector in the form of two parameters
    * @param init_x x coordinate of the end of the vector
    * @param init_y y coordinate of the end of the vector
    */
    public Vector (double init_x, double init_y){
        x = init_x;
        y = init_y;
    }
    
    /**
    * The method allows you to change the x-coordinate of the end of the vector
    * @param new_x x coordinate of the end of the vector
    */
    public void setX (float nowe_x) {
        
        x = nowe_x;
    }
    
    /**
    * The method allows you to change the y coordinate of the end of the vector
    * @param new_y y coordinate of the end of the vector
    */
    public void setY (float nowe_y) {
        y = nowe_y;
    }

    /**
    * The method returns information about the x-coordinate of the end of the vector
    */
    public double getX () {
        return x;
    }

    /**
    * The method returns information about the y coordinate of the end of the vector
    */
    public double getY () {
        return y;
    }

    /**
    * A method that calculates the length of a vector
    * @return vector length
    */
    public double dlugoscWektora () {
        return sqrt(pow((0 - x), 2) + pow((0 - y), 2));
    }

    /**
    * A method that scales a vector by a given integer
    * @return scaled vector
    */
    public Vector skalowanie (int k) {
        try {
            return new Vector(k * x, k *y);
        } catch (IllegalArgumentException e) {
            System.out.println("k musi być liczbą całkowitą. Wektir nie został przeskalowany");
            return new Vector(x, y);
        }
    
    /**
    * The method calls information about the coordinates of the end of the vector
    */
    }
    public void getInfo () {
        System.out.println("v = [" + x +", " + y + "]" );
    }
}