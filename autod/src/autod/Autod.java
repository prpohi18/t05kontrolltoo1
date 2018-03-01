package autod;

/**
 *
 * @author Anu
 */
public class Autod {
    
    
    
    public static void main(String[] args) {
        Autod2 auto1=new Autod2(500, 60);
        Autod2 auto2=new Autod2(650, 55);
        System.out.println("Esimese auto kaugus on "+auto1.s +" km "
                + "ning tema kiirus on "+auto1.v+" km/h");
        System.out.println("Teise auto kaugus on "+auto2.s +" km "
                + "ning tema kiirus on "+auto2.v+" km/h");
    }
    
}
