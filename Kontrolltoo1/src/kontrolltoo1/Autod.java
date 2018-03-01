package kontrolltoo1;
public class Autod {
    protected Double auto1Kaugus;
    protected Double auto1Kiirus;
    protected Double auto2Kaugus;
    protected Double auto2Kiirus;

    public Autod(Double auto1Kaugus, Double auto1Kiirus, Double auto2Kaugus, Double auto2Kiirus) {
        this.auto1Kaugus = auto1Kaugus;
        this.auto1Kiirus = auto1Kiirus;
        this.auto2Kaugus = auto2Kaugus;
        this.auto2Kiirus = auto2Kiirus;
    }

    public Double getAuto1Kaugus() {
        return auto1Kaugus;
    }

    public void setAuto1Kaugus(Double auto1Kaugus) {
        this.auto1Kaugus = auto1Kaugus;
    }

    public Double getAuto1Kiirus() {
        return auto1Kiirus;
    }

    public void setAuto1Kiirus(Double auto1Kiirus) {
        this.auto1Kiirus = auto1Kiirus;
    }

    public Double getAuto2Kaugus() {
        return auto2Kaugus;
    }

    public void setAuto2Kaugus(Double auto2Kaugus) {
        this.auto2Kaugus = auto2Kaugus;
    }

    public Double getAuto2Kiirus() {
        return auto2Kiirus;
    }

    public void setAuto2Kiirus(Double auto2Kiirus) {
        this.auto2Kiirus = auto2Kiirus;
    }

    @Override
    public String toString() {
        return "Autod{" + "auto1Kaugus=" + auto1Kaugus + ", auto1Kiirus=" + auto1Kiirus + ", auto2Kaugus=" + auto2Kaugus + ", auto2Kiirus=" + auto2Kiirus + '}';
    }
    
    public void uuendaKaugus(Double aeg){
        Double uusKaugus1 = this.auto1Kaugus + (this.auto1Kiirus * aeg);
        Double uusKaugus2 = this.auto2Kaugus + (this.auto2Kiirus * aeg);
        this.setAuto1Kaugus(uusKaugus1);
        this.setAuto2Kaugus(uusKaugus2);
        System.out.println("Esimese auto uus kaugus on: " + uusKaugus1 +"km ja teise auto uus kaugus on: " + uusKaugus2 +" km");
    }
}
