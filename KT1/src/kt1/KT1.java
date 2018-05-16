package kt1;

import java.io.*;
import java.util.*;
public class KT1{
    
	//  1) Funktsioon kahe aine sisestamiseks (EAP ja hinded)
	static double kaalutudKeskmineKahega(double EAP1, double EAP2, double Hinne1, double Hinne2){
		//arvutan keskmise
		return ((EAP1*Hinne1)+(EAP2*Hinne2))/(EAP1+EAP2);
	}
        
	//  2)  Funktsioon kogumina saadud andmete jaoks (sisesta mituAinetKogumikus ainet, EApd, hinded)
        
        // Mate: EAP5, hinne 4.   Fyysika: EAP4, hinne 3. KAALUTUD KESKMISE VALEM: (5x4 + 4x3) / (5+4)
	public static double kaalutudKeskmineKogumina(int[] aineteMassiiv, int[] hinneteMassiiv){
		double kaalutudKeskmineKoguminaTulemus;
                double kaalutudKeskmiseEAPsumma = 0;
		
                //arvutan kokku EAPde kogusumma
                for(int i=0; i<aineteMassiiv.length; i++){
                    System.out.println("SSSSS    "+kaalutudKeskmiseEAPsumma);
                    // ainepunktidesumma + (EAP x HINNE)
			kaalutudKeskmiseEAPsumma = kaalutudKeskmiseEAPsumma + aineteMassiiv[i] * hinneteMassiiv[i];
		}
		
		double eapSumma = 0;
		                
                for(int i: aineteMassiiv){
                    System.out.println("EAPSUMMA   "+eapSumma);
			eapSumma += i;
		}
		
		kaalutudKeskmineKoguminaTulemus = kaalutudKeskmiseEAPsumma/eapSumma;
		return kaalutudKeskmineKoguminaTulemus;

	}
        
        //  3)  Funktsioon andmete lugemiseks ja kirjutamiseks
        
        
        
	public static void main(String[] args) throws IOException{
		
		//Esimene punkt
                    // (EAP1, EAP2, Hinne1, Hinne2)
		System.out.println("ESIMENE PUNKT");
		System.out.println("Arvutame kahe aine kaalutud keskmise: " + kaalutudKeskmineKahega(6, 5, 4, 3));
		
                
                
		//TEINE PUNKT - scanneriga loen sisse ja annan tulemuse
		Scanner scan = new Scanner(System.in);
		int mituAinetKogumikus;
                System.out.println("TEINE PUNKT");
                //kysin mitu ainet on kokku
		System.out.println("Mitu oppeainet kokku on? ");
		mituAinetKogumikus = scan.nextInt();
                //kysin nende ainete EAPd
		System.out.println("Sisesta nende oppeainete EAPd: ");
		int[] eapKogumikus = new int[mituAinetKogumikus];
		for(int i=0; i<mituAinetKogumikus; i++){
                    System.out.println("Sisesta "+(i+1)+". oppeaine EAP: ");
			eapKogumikus[i] = scan.nextInt();
		}
                //kysin nende ainete hinded
		System.out.println("Sisesta nende oppeainete hinded samas jarjekorras: ");
		int[] hindedKogumikus = new int[mituAinetKogumikus];
		for(int i=0; i<mituAinetKogumikus; i++){
                    System.out.println("Sisesta "+(i+1)+". oppeaine hinne: ");
                    hindedKogumikus[i] = scan.nextInt();
		}
                //trykin hinded valja		
		System.out.println("Sisestatud ainete kaalutud keskmine on " + kaalutudKeskmineKogumina(eapKogumikus, hindedKogumikus) + "\n");
		
	}
}






