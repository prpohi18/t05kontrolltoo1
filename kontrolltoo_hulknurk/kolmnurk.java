package kontrolltoo_hulknurk;

public class kolmnurk {
    public static void main(String[] args) {
        
        massiiv_1 kolmnurk = new massiiv_1();
        massiiv_2 kolmnurk_2 = new massiiv_2();
        hulknurk hulknurk = new hulknurk();
        
        //ESIMENE KOLMNURK
            System.out.println("Esimese kolmnurga X koordinaadid on: \n"); 
                kolmnurk.x_koordinaadid();
        
            System.out.println("\nEsimese kolmnurga Y koordinaadid on: \n");
        
                kolmnurk.y_koordinaadid();
        
                kolmnurk.kontroll_ligikaudne();
        //TEINE KOLMNURK
            System.out.println("\nTeise kolmnurga X koordinaadid on: \n"); 
                kolmnurk_2.x_koordinaadid();
        
            System.out.println("\nTeise kolmnurga Y koordinaadid on: \n");
        
                kolmnurk_2.y_koordinaadid();
        
                kolmnurk_2.kontroll_ligikaudne();
                
        //HULKNURK    
            System.out.println("Hulknurga X koordinaadid on: \n"); 
                
                hulknurk.x_koordinaadid();
                
            System.out.println("Hulknurga Y koordinaadid on: \n");
                
                hulknurk.y_koordinaadid();
                
                hulknurk.kontroll_ligikaudne();
    }
}