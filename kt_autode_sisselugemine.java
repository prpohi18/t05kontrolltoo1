import java.net.*;
import java.io.*;


public class kt_autode_sisselugemine {
    public static void main(String [] args) throws Exception{
		kt_autod test = new kt_autod();
		String aadress="http://www.tlu.ee/~kalmerr/autodeandmed.txt";
		BufferedReader br= new BufferedReader(new InputStreamReader(
			new URL(aadress).openStream()));
		String rida=br.readLine();
		if(!rida.startsWith("auto")){
			System.out.println("Sobiva pealkirjata fail");
			return;
		}
		rida=br.readLine();
		//int koertemassidesumma=0;
		//int kassidemassidesumma=0;
		
		while(rida!=null){
			//System.out.println(rida);
			test.asukohtade_m22ramine();
			String[] m=rida.split(",");
			if(m[0].equals("Sinine_auto")){
				System.out.println("Auto: "+m[0]+ ", kaugus maantee otspunktist: "+m[1]+" KM, auto kiirus on: "+m[2]+ " KM/H.");
				System.out.println("Kaugus meetrites on: "+test.kaugus_meetrites);
				System.out.println("Auto liigub: "+test.kiirus_meetrit_sekundis+ " meetrit sekundis.");
				System.out.println("Auto uus kaugus meetrites on (3sekundit): "+test.uus_kaugus);
				System.out.println("Auto uus kaugus meetrites on (300sekundit): "+test.uus_kaugus1);
				System.out.println("Auto uus kaugus meetrites on (7200sekundit): "+test.uus_kaugus2);
			}
			if(m[0].equals("Roheline_auto")){
				//koertemassidesumma+=Integer.parseInt(m[1]);
				System.out.println("Auto: "+m[0]+ ", kaugus maantee otspunktist: "+m[1]+" KM, auto kiirus on: "+m[2]+ " KM/H.");
			}
			if(m[0].equals("Helesinine_auto")){
				//koertemassidesumma+=Integer.parseInt(m[1]);
				System.out.println("Auto: "+m[0]+ ", kaugus maantee otspunktist: "+m[1]+" KM, auto kiirus on: "+m[2]+ " KM/H.");
			}
			if(m[0].equals("Lilla_auto")){
				//koertemassidesumma+=Integer.parseInt(m[1]);
				System.out.println("Auto: "+m[0]+ ", kaugus maantee otspunktist: "+m[1]+" KM, auto kiirus on: "+m[2]+ " KM/H.");
			}
			rida=br.readLine();
		}
		

	}
}
