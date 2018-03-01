package kontrolltöö1;

public class Autod {
   protected double autoEKiirus;    
   protected double autoTKiirus;    
   protected double autoEKaugus;
   protected double autoTKaugus;
   
   
   public Autod(double autoEKiirus, double autoTKiirus, double autoEKaugus, double autoTKaugus){
       this.autoEKaugus=autoEKaugus;
       this.autoTKaugus=autoTKaugus;
       this.autoEKiirus=autoEKiirus;
       this.autoTKiirus=autoTKiirus;
   }


public double getAutoEKaugus(){
return autoEKaugus;
}

public void setAutoEKaugus(double autoEKaugus) {
this.autoEKaugus = autoEKaugus;
}

public double getAutoEKiirus(){
return autoEKiirus;
}

public void setAutoEKiirus(double autoEKiirus) {
this.autoEKiirus = autoEKiirus;
}

public double getAutoTKaugus(){
return autoTKaugus;
}

public void setAutoTKaugus(double autoTKaugus) {
this.autoTKaugus = autoTKaugus;
}

public double getAutoTKiirus(){
return autoTKiirus;
}

public void setAutoTKiirus(double autoTKiirus) {
this.autoTKiirus = autoTKiirus;
}

  @Override
    public String toString() {
        return "Autod{" + "autoEKaugus=" + autoEKaugus + ", autoEKiirus=" + autoEKiirus + ", autoTKaugus=" + autoTKaugus + ", autoTKiirus=" + autoTKiirus + '}';
    }
    
    public void uuedKaugused(Double aeg){
        Double uusKaugusE = this.autoEKaugus + (this.autoEKiirus * aeg);
        Double uusKaugusT = this.autoEKaugus + (this.autoTKiirus * aeg);
        this.setAutoEKaugus(uusKaugusE);
        this.setAutoTKaugus(uusKaugusT);
        System.out.println("Esimese auto uus kaugus on: " + uusKaugusE +"km ja teise auto uus kaugus on: " + uusKaugusT +" km");
    }
}
