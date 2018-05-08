import java.net.*;
import java.io.*;


public class kt_autode_sisselugemine {
    public static void main(String [] args) throws Exception{
		String auto;
		double kaugus;
		double kiirus;
		double kiirus_meetrit_sekundis;
		double kaugus_meetrites;
		double uus_kaugus;
		double uus_kaugus1;
		double uus_kaugus2;
		double distants_aeg_sekund = 3;
		double distants_aeg_minut = 300;
		double distants_aeg_minut1 = 7200;
		String aadress="http://www.tlu.ee/~kalmerr/Andmed/autodeandmed.txt";
		BufferedReader br= new BufferedReader(new InputStreamReader(
			new URL(aadress).openStream()));
		String rida=br.readLine();
		if(!rida.startsWith("auto")){
			System.out.println("Sobiva pealkirjata fail");
			return;
		}
		rida=br.readLine();
		
		while(rida!=null){
			//System.out.println(rida);
			String[] m=rida.split(",");
			if(m[0].equals("Sinine_auto")){
				kiirus_meetrit_sekundis = (Integer.parseInt(m[2])) * 0.27;
				kaugus_meetrites = (Integer.parseInt(m[1])) * 1000;
				uus_kaugus = kaugus_meetrites - (kiirus_meetrit_sekundis * distants_aeg_sekund);
				uus_kaugus1 = kaugus_meetrites - (kiirus_meetrit_sekundis * distants_aeg_minut);
				uus_kaugus2 = kaugus_meetrites - (kiirus_meetrit_sekundis * distants_aeg_minut1);
				System.out.println("Auto: "+m[0]+ ", kaugus maantee otspunktist: "+m[1]+" KM, auto kiirus on: "+m[2]+ " KM/H.\n");
				System.out.println("Kaugus meetrites on: "+ kaugus_meetrites);
				System.out.println("Auto liigub: "+kiirus_meetrit_sekundis+ " meetrit sekundis.");
				System.out.println("Auto uus kaugus meetrites on (3sekundit): "+uus_kaugus);
				System.out.println("Auto uus kaugus meetrites on (300sekundit): "+uus_kaugus1);
				System.out.println("Auto uus kaugus meetrites on (7200sekundit): "+uus_kaugus2);
			}
			if(m[0].equals("Roheline_auto")){
				kiirus_meetrit_sekundis = (Integer.parseInt(m[2])) * 0.27;
				kaugus_meetrites = (Integer.parseInt(m[1])) * 1000;
				uus_kaugus = kaugus_meetrites - (kiirus_meetrit_sekundis * distants_aeg_sekund);
				uus_kaugus1 = kaugus_meetrites - (kiirus_meetrit_sekundis * distants_aeg_minut);
				uus_kaugus2 = kaugus_meetrites - (kiirus_meetrit_sekundis * distants_aeg_minut1);
				System.out.println("Auto: "+m[0]+ ", kaugus maantee otspunktist: "+m[1]+" KM, auto kiirus on: "+m[2]+ " KM/H.\n");
				System.out.println("Kaugus meetrites on: "+ kaugus_meetrites);
				System.out.println("Auto liigub: "+kiirus_meetrit_sekundis+ " meetrit sekundis.");
				System.out.println("Auto uus kaugus meetrites on (3sekundit): "+uus_kaugus);
				System.out.println("Auto uus kaugus meetrites on (300sekundit): "+uus_kaugus1);
				System.out.println("Auto uus kaugus meetrites on (7200sekundit): "+uus_kaugus2);
			}
			if(m[0].equals("Helesinine_auto")){
				kiirus_meetrit_sekundis = (Integer.parseInt(m[2])) * 0.27;
				kaugus_meetrites = (Integer.parseInt(m[1])) * 1000;
				uus_kaugus = kaugus_meetrites - (kiirus_meetrit_sekundis * distants_aeg_sekund);
				uus_kaugus1 = kaugus_meetrites - (kiirus_meetrit_sekundis * distants_aeg_minut);
				uus_kaugus2 = kaugus_meetrites - (kiirus_meetrit_sekundis * distants_aeg_minut1);
				System.out.println("Auto: "+m[0]+ ", kaugus maantee otspunktist: "+m[1]+" KM, auto kiirus on: "+m[2]+ " KM/H.\n");
				System.out.println("Kaugus meetrites on: "+ kaugus_meetrites);
				System.out.println("Auto liigub: "+kiirus_meetrit_sekundis+ " meetrit sekundis.");
				System.out.println("Auto uus kaugus meetrites on (3sekundit): "+uus_kaugus);
				System.out.println("Auto uus kaugus meetrites on (300sekundit): "+uus_kaugus1);
				System.out.println("Auto uus kaugus meetrites on (7200sekundit): "+uus_kaugus2);
			}
			if(m[0].equals("Lilla_auto")){
				kiirus_meetrit_sekundis = (Integer.parseInt(m[2])) * 0.27;
				kaugus_meetrites = (Integer.parseInt(m[1])) * 1000;
				uus_kaugus = kaugus_meetrites - (kiirus_meetrit_sekundis * distants_aeg_sekund);
				uus_kaugus1 = kaugus_meetrites - (kiirus_meetrit_sekundis * distants_aeg_minut);
				uus_kaugus2 = kaugus_meetrites - (kiirus_meetrit_sekundis * distants_aeg_minut1);
				System.out.println("Auto: "+m[0]+ ", kaugus maantee otspunktist: "+m[1]+" KM, auto kiirus on: "+m[2]+ " KM/H.\n");
				System.out.println("Kaugus meetrites on: "+ kaugus_meetrites);
				System.out.println("Auto liigub: "+kiirus_meetrit_sekundis+ " meetrit sekundis.");
				System.out.println("Auto uus kaugus meetrites on (3sekundit): "+uus_kaugus);
				System.out.println("Auto uus kaugus meetrites on (300sekundit): "+uus_kaugus1);
				System.out.println("Auto uus kaugus meetrites on (7200sekundit): "+uus_kaugus2);
			}
			rida=br.readLine();
		}
		

	}
}
