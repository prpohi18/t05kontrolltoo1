import java.util.*;
public class Hulknurk{
    public static void main(String[] arg) throws Exception{
        List<Arvutus> koordinaadid = new ArrayList<Arvutus>();
        koordinaadid.add(new Arvutus("20;14"));
        koordinaadid.add(new Arvutus("300;50"));
        for(int i = 0;i<koordinaadid.size(); i++){
            System.out.println("koordinaadid: "+koordinaadid.get(i));
        }
        koordinaadid.add(new Arvutus("168;240"));
        System.out.println("lisasin kolmanda koordinaatide paari");
        int[][] a= new int[2][3];
        int suurendus = 1;
        for(int i = 0;i<koordinaadid.size(); i++){
            // a[0][i] on x-koordinaadid ja a[1][i] y-koordinaadid
            a[0][i]=2 + (suurendus * Integer.parseInt((koordinaadid.get(i)).kahedKoordinaadid()[0]));
            a[1][i]=2 + (300 - (suurendus * Integer.parseInt((koordinaadid.get(i)).kahedKoordinaadid()[1])));
        }
        Arvutus2 kuljed=new Arvutus2(a);
        System.out.println("Kolmnurga ümbermõõt on "+kuljed.ymberm66t());
        kuljed.kuvamine();
        
    }
}