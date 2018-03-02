public class Arvutus{
    protected String xy;
    protected String[] m;
    public Arvutus(String andmed){
        xy=andmed;
        m=xy.split(";");
    } 
    public String[] kahedKoordinaadid(){
        return m;
    }
    public String koordinaadid(){
        return xy;
    }

    @Override
    public String toString(){
        return koordinaadid();
    }
}