package kontrolltoo_hulknurk;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class hulknurk {
    private final int norm = 2;
    private int x_pikkus; 
    private int y_pikkus;
    ArrayList<Integer> x_koordinaadid = new ArrayList<>();
    ArrayList<Integer> y_koordinaadid = new ArrayList<>();
    private double ab_vahe;
    private double bc_vahe;
    private double cd_vahe;
    private double de_vahe;
    private double ef_vahe;
    private double fa_vahe;
    
    public void x_koordinaadid() {
        
        for (int i=0; i<6; i++) {
            x_koordinaadid.add(ThreadLocalRandom.current().nextInt(0, 15));
        }
        
        System.out.printf("x1= %d \n", x_koordinaadid.get(0));
        System.out.printf("x2= %d \n", x_koordinaadid.get(1));
        System.out.printf("x3= %d \n", x_koordinaadid.get(2));
        System.out.printf("x4= %d \n", x_koordinaadid.get(3));
        System.out.printf("x5= %d \n", x_koordinaadid.get(4));
        System.out.printf("x6= %d \n", x_koordinaadid.get(5));
    }

    
    public void y_koordinaadid() {
        
        for (int i=0; i<6; i++) {
            y_koordinaadid.add(ThreadLocalRandom.current().nextInt(0, 15));
        }
        System.out.printf("y1= %d \n", y_koordinaadid.get(0));
        System.out.printf("y2= %d \n", y_koordinaadid.get(1));
        System.out.printf("y3= %d \n", y_koordinaadid.get(2));
        System.out.printf("y4= %d \n", y_koordinaadid.get(3));
        System.out.printf("y5= %d \n", y_koordinaadid.get(4));
        System.out.printf("y6= %d \n", y_koordinaadid.get(5));
    }
    
    
    public void kontroll_ligikaudne() {
       
        //esimene külg
            x_pikkus = x_koordinaadid.get(1) - x_koordinaadid.get(0);
            if (x_pikkus < 0) {
                x_pikkus *= -1;
            }
            
            y_pikkus = y_koordinaadid.get(1) - y_koordinaadid.get(0);
            if (y_pikkus < 0) {
                y_pikkus *= -1;
            }
       
                double a = Math.round(Math.sqrt((x_pikkus * x_pikkus)+(y_pikkus * y_pikkus)));
        
        //teine külg
            x_pikkus = x_koordinaadid.get(2) - x_koordinaadid.get(1);
            if (x_pikkus < 0) {
                x_pikkus *= -1;
            }
            
            y_pikkus = y_koordinaadid.get(2) - y_koordinaadid.get(1);
            if (y_pikkus < 0) {
                y_pikkus *= -1;
            }
                double b = Math.round(Math.sqrt((x_pikkus * x_pikkus)+(y_pikkus * y_pikkus)));
        
        //kolmas külg
            x_pikkus = x_koordinaadid.get(3) - x_koordinaadid.get(2);
            if (x_pikkus < 0) {
                x_pikkus *= -1;
            }
            
            y_pikkus = y_koordinaadid.get(3) - y_koordinaadid.get(2);
            if (y_pikkus < 0) {
                y_pikkus *= -1;
            }
                double c = Math.round(Math.sqrt((x_pikkus * x_pikkus)+(y_pikkus * y_pikkus)));
                
                
        //neljas külg
            x_pikkus = x_koordinaadid.get(4) - x_koordinaadid.get(3);
            if (x_pikkus < 0) {
                x_pikkus *= -1;
            }
            
            y_pikkus = y_koordinaadid.get(4) - y_koordinaadid.get(3);
            if (y_pikkus < 0) {
                y_pikkus *= -1;
            }
                double d = Math.round(Math.sqrt((x_pikkus * x_pikkus)+(y_pikkus * y_pikkus)));
                
                
        //viies külg
            x_pikkus = x_koordinaadid.get(5) - x_koordinaadid.get(4);
            if (x_pikkus < 0) {
                x_pikkus *= -1;
            }
            
            y_pikkus = y_koordinaadid.get(5) - y_koordinaadid.get(4);
            if (y_pikkus < 0) {
                y_pikkus *= -1;
            }
                double e = Math.round(Math.sqrt((x_pikkus * x_pikkus)+(y_pikkus * y_pikkus)));     
                
        //kuues külg
            x_pikkus = x_koordinaadid.get(0) - x_koordinaadid.get(5);
            if (x_pikkus < 0) {
                x_pikkus *= -1;
            }
            
            y_pikkus = y_koordinaadid.get(0) - y_koordinaadid.get(5);
            if (y_pikkus < 0) {
                y_pikkus *= -1;
            }
                double f = Math.round(Math.sqrt((x_pikkus * x_pikkus)+(y_pikkus * y_pikkus)));        
                
            
            System.out.println("\nKülg a: " + a + "\nKülg b: " + b + "\nKülg c: " + c + "\nKülg d: " + d + "\nKülg e: " + e + "\nKülg f: " + f);
        
        //arvuta a, b ja c vahed
        ab_vahe = a - b;
        if (ab_vahe < 0) {
            ab_vahe *= -1;
        }
        bc_vahe = b - c;
        if (bc_vahe < 0) {
            bc_vahe *= -1;
        }
        cd_vahe = c - d;
        if (cd_vahe < 0) {
            cd_vahe *= -1;
        }
        de_vahe = b - c;
        if (de_vahe < 0) {
            de_vahe *= -1;
        }
        ef_vahe = b - c;
        if (ef_vahe < 0) {
            ef_vahe *= -1;
        }
        fa_vahe = b - c;
        if (fa_vahe < 0) {
            fa_vahe *= -1;
        }
        
        System.out.println("");
        
        //kontrolli, kas sarnased
        if (ab_vahe <= norm) {
            System.out.println("Küljed a ja b on sarnased.");
        }
        if (bc_vahe <= norm) {
            System.out.println("Küljed b ja c on sarnased.");
        }
        if (cd_vahe <= norm) {
            System.out.println("Küljed c ja d on sarnased.");
        }
        if (de_vahe <= norm) {
            System.out.println("Küljed d ja e on sarnased.");
        }
        if (ef_vahe <= norm) {
            System.out.println("Küljed e ja f on sarnased.");
        }
        if (fa_vahe <= norm) {
            System.out.println("Küljed f ja a on sarnased.");
        }
        if (ab_vahe <= 2 && bc_vahe <= 2 && cd_vahe <= 2 && de_vahe <= 2 && ef_vahe <= 2 && fa_vahe <= 2) {
            System.out.println("Kõik küljed on sarnased.");
        }
    }
}
