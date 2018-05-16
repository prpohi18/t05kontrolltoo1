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
                    // ainepunktidesumma + (EAP x HINNE)
			kaalutudKeskmiseEAPsumma = kaalutudKeskmiseEAPsumma + aineteMassiiv[i] * hinneteMassiiv[i];
		}
		
		double eapSumma = 0;
		                
                for(int i: aineteMassiiv){
			eapSumma += i;
		}
		
		kaalutudKeskmineKoguminaTulemus = kaalutudKeskmiseEAPsumma/eapSumma;
		return kaalutudKeskmineKoguminaTulemus;

	}
        
        //  3)  Funktsioon andmete lugemiseks ja kirjutamiseks

	//Failist loetud hinnete jaoks.
	public static double kaalutudKeskmineFailist(String aineNimi, int hindenr, int ainenr) throws IOException{
		System.out.println("KOLMAS PUNKT");
                BufferedReader reader = new BufferedReader(new FileReader(aineNimi));
		String rida = reader.readLine();
		rida = reader.readLine();
		int hinne;
		double korrutiste_summa = 0;
		double ainepunktide_summa = 0;
		double kaalutudKeskmineFaili;
		List<Integer> hinded = new ArrayList<Integer>();
		List<Integer> punktid = new ArrayList<Integer>();
		while(rida!=null){
			String[] m = rida.split(", ");
			String hindekontroll = m[hindenr];
			rida = reader.readLine();
			try{
				punktid.add(Integer.parseInt(m[ainenr]));
				if(hindekontroll.equals ("A")){
					hinne = 5;
					hinded.add(hinne);
				} else if(hindekontroll.equals ("B")){
					hinne = 4;
					hinded.add(hinne);
				} else if(hindekontroll.equals ("C")){
					hinne = 3;
					hinded.add(hinne);
				} else if(hindekontroll.equals ("D")){
					hinne = 2;
					hinded.add(hinne);
				} else if(hindekontroll.equals ("E")){
					hinne = 1;
					hinded.add(hinne);
				} else if(hindekontroll.equals ("F")){
					hinne = 0;
					hinded.add(hinne);
				}
			} catch (Exception ex){
				System.out.println("Andmetes on viga");
			}
		}
		for(int i=0; i<hinded.size(); i++){
			korrutiste_summa += hinded.get(i) * punktid.get(i);
			ainepunktide_summa += punktid.get(i);
		}
		kaalutudKeskmineFaili = korrutiste_summa/ainepunktide_summa;
		reader.close();
		return kaalutudKeskmineFaili;
	}
 
        
        
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
		
               //KOLMANDA PUNKTI TULEMUS

		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
		new FileOutputStream("keskmineHinneTulemus.txt"), "utf-8"));
		writer.write("Kaalutud keskmine on: " + kaalutudKeskmineFailist("Ained.txt", 1, 2));
		writer.close();
		System.out.println("Tulemus on kirjutatud faili keskmineHinneTulemus.txt");

	}
}






