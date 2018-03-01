package kt1.kaalutud_keskmine;

import java.io.*;
import java.util.*;

public class KT1Kaalutud_keskmine {
          
    public static void main(String[] args) throws IOException {
        BufferedReader into = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Sisestage palun esimese aine hinne: ");
        String Grade1 = into.readLine();
        int grade1 = Integer.parseInt(Grade1);
        
        System.out.println("Sisestage palun esimese aine ainepunktid: ");
        String EAP1 = into.readLine();
        int eap1 = Integer.parseInt(EAP1);
        
        System.out.println("Sisestage palun teise aine hinne: ");
        String Grade2 = into.readLine();
        int grade2 = Integer.parseInt(Grade2);
        
        System.out.println("Sisestage palun teise aine ainepunktid: ");
        String EAP2 = into.readLine();
        int eap2 = Integer.parseInt(EAP2);
        
        double weightedArithmeticMean = weightedArithmetic(grade1, grade2, eap1, eap2);
        
        System.out.println("Kaalutud keskmine hinne on: " + weightedArithmeticMean);
        
    }
    
    public static double weightedArithmetic(int grade1,  int grade2,  int eap1,  int eap2){
        double result = ((grade1*eap1)+(grade2*eap2))/(eap1+eap2);
        return result;
    }
}
