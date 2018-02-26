import java.util.concurrent.ThreadLocalRandom; //suvalise arv
import java.util.*; //ArrayList
import java.math.*; //ruutjuur

public class Massiiv1 {
    
    private int tolerants = 2;
    private int x_pikkus;
    private int y_pikkus;
    ArrayList<Integer> x_koordinaadid = new ArrayList<Integer>();
    ArrayList<Integer> y_koordinaadid = new ArrayList<Integer>();
    private double ab_vahe;
    private double bc_vahe;
    private double ca_vahe;
    
    public void Massiiv1() {
        
        for (int i=0; i<3; i++) {
            x_koordinaadid.add(ThreadLocalRandom.current().nextInt(0, 10 + 1));
            y_koordinaadid.add(ThreadLocalRandom.current().nextInt(0, 10 + 1));
        }
        for (int i=0; i<x_koordinaadid.size(); i++) {
            System.out.printf("%s %s \n", Integer.toString(x_koordinaadid.get(i)), Integer.toString(y_koordinaadid.get(i)));
        }
    }
    
    public void vordkylgsus() {
        
        //külg nr1
        x_pikkus = x_koordinaadid.get(0) - x_koordinaadid.get(1);
        if (x_pikkus < 0) {
            x_pikkus *= -1;
        }
        y_pikkus = y_koordinaadid.get(0) - y_koordinaadid.get(1);
        if (y_pikkus < 0) {
            y_pikkus *= -1;
        }
        double a = Math.sqrt((x_pikkus * x_pikkus)+(y_pikkus * y_pikkus));
        
        //külg nr2
        x_pikkus = x_koordinaadid.get(1) - x_koordinaadid.get(2);
        if (x_pikkus < 0) {
            x_pikkus *= -1;
        }
        y_pikkus = y_koordinaadid.get(1) - y_koordinaadid.get(2);
        if (y_pikkus < 0) {
            y_pikkus *= -1;
        }
        double b = Math.sqrt((x_pikkus * x_pikkus)+(y_pikkus * y_pikkus));
        
        //külg 3
        x_pikkus = x_koordinaadid.get(2) - x_koordinaadid.get(0);
        if (x_pikkus < 0) {
            x_pikkus *= -1;
        }
        y_pikkus = y_koordinaadid.get(2) - y_koordinaadid.get(0);
        if (y_pikkus < 0) {
            y_pikkus *= -1;
        }
        double c = Math.sqrt((x_pikkus * x_pikkus)+(y_pikkus * y_pikkus));
        System.out.println("Külg a: " + a + "\nKülg b: " + b + "\nKülg c: " + c);
        
        //arvuta a, b ja c vahed
        ab_vahe = a - b;
        if (ab_vahe < 0) {
            ab_vahe *= -1;
        }
        bc_vahe = b - c;
        if (bc_vahe < 0) {
            bc_vahe *= -1;
        }
        ca_vahe = c - a;
        if (ca_vahe < 0) {
            ca_vahe *= -1;
        }
        
        System.out.println("");
        
        //kontrolli, kas sarnased
        if (ab_vahe <= tolerants) {
            System.out.println("Küljed a ja b on sarnased.");
        }
        if (bc_vahe <= tolerants) {
            System.out.println("Küljed b ja c on sarnased.");
        }
        if (ca_vahe <= tolerants) {
            System.out.println("Küljed c ja a on sarnased.");
        }
        if (ab_vahe <= 2 && bc_vahe <= 2 && ca_vahe <= 2) {
            System.out.println("Kõik küljed on sarnased.");
        }
    }
}