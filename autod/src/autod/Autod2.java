package autod;
/**
 *
 * @author Anu
 */
public class Autod2 {
   
    double s, v, t1, t2, t3;
    
    public Autod2(double kaugus, double kiirus, double sekund, double minut, double tund){
        s=kaugus;
        v=kiirus;
        
        t1=sekund;
        t2=minut;
        t3=tund;
    }
    //s = v * t
    public double tund(){
        return s+(v*t3);
    }
    public double minut(){
        return s+(v*(t2/60));
    }
    public double sekund(){
        return s+(v*(t1/3600));
    }
     
}
