
package ee.tlu.sergei.kt1;

import java.util.ArrayList;
import java.util.List;

public class Andmed {
    private double k;
    private double t0;
    private double t6;
    private double t12;
    private double t18;
    private double t24;
    /*protected static List<Double> allTemp = new ArrayList<Double>();
    
    public double tempListi(double t0, double t6, double t12, double t18, double t24){
    allTemp.add(t0);
    allTemp.add(t6);
    allTemp.add(t12);
    allTemp.add(t18);
    allTemp.add(t24);
    return 0;
    }*/
    
    public void setKuupaev(double k){
        this.k = k;
    }
    public void setTemp0(double t0){
        this.t0 = t0;
        
    }
    public void setTemp6(double t6){
        this.t6 = t6;
        
    }
    public void setTemp12(double t12){
        this.t12 = t12;
        
    }
    public void setTemp18(double t18){
        this.t18 = t18;
        
    }
    public void setTemp24(double t24){
        this.t24 = t24;
        
    }
    
    public double getKuupaev(){
        return k;
    }
    public double getTemp0(){
        return t0;
    }
    public double getTemp6(){
        return t6;
    }
    public double getTemp12(){
        return t12;
    }
    public double getTemp18(){
        return t18;
    }
    public double getTemp24(){
        return t24;
    }
}
