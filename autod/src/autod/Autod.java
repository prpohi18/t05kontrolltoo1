package autod;
/**
 *
 * @author Anu
 */
public class Autod {
    
    public static void main(String[] args) {
        Autod2 auto1=new Autod2(500, 60, 3, 5, 2);
        Autod2 auto2=new Autod2(650, 55, 3, 5, 2);
        
        System.out.println("KT 1.osa:");
        System.out.println("Esimese auto kaugus on "+auto1.s +" km "
                + "ning tema kiirus on "+auto1.v+" km/h");
        System.out.println("Teise auto kaugus on "+auto2.s +" km "
                + "ning tema kiirus on "+auto2.v+" km/h");
        System.out.println("-----------");
        System.out.println("KT 2.osa:");
        System.out.println("Esimese auto kaugus algpunktist \n 1) 3 sekundi järel: "+auto1.sekund()+"\n 2) 5 minuti järel: "+auto1.minut()+" \n 3) 2 tunni järel: "+auto1.tund());
        System.out.println("Teise auto kaugus algpunktist \n 1) 3 sekundi järel: "+auto2.sekund()+"\n 2) 5 minuti järel: "+auto2.minut()+" \n 3) 2 tunni järel: "+auto2.tund());
        System.out.println("-----------");
    }
    
    /*
    KT 1.osa:
    Esimese auto kaugus on 500.0 km ning tema kiirus on 60.0 km/h
    Teise auto kaugus on 650.0 km ning tema kiirus on 55.0 km/h
    -----------
    KT 2.osa:
    Esimese auto kaugus algpunktist 
     1) 3 sekundi järel: 500.05
     2) 5 minuti järel: 505.0 
     3) 2 tunni järel: 620.0
    Teise auto kaugus algpunktist 
     1) 3 sekundi järel: 650.0458333333333
     2) 5 minuti järel: 654.5833333333334 
     3) 2 tunni järel: 760.0
    -----------
    */
}
