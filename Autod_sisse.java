import java.net.*;
import java.io.*;


public class Autod_sisse {
    public static void main(String [] args) throws Exception{
		String auto;
		double kaugus;
		double kiirus;
		double kms;
		double kaugus_meetrites;
		double new_kaugus;
		double new_kaugus1;
		double new_kaugus2;
		double distants_sekundid = 3;
		double distants_minutid = 300;
		double distants_minutid1 = 7200;
		String aadress="http://greeny.cs.tlu.ee/~martandr/prgpohi/kodut%C3%B6%C3%B6d/t05kontrolltoo1/Andmed.txt";
		BufferedReader br= new BufferedReader(new InputStreamReader(
			new URL(aadress).openStream()));
		String rida=br.readLine();
		if(!rida.startsWith("")){
			System.out.println("Sobiva pealkirjata fail");
			return;
		}
		rida=br.readLine();
		
		while(rida!=null){
			//System.out.println(rida);
			String[] m=rida.split(",");
			if(m[0].equals("BMW")){
				kms = (Integer.parseInt(m[2])) * 0.27;
				kaugus_meetrites = (Integer.parseInt(m[1])) * 1000;
				new_kaugus = kaugus_meetrites - (kms * distants_sekundid);
				new_kaugus1 = kaugus_meetrites - (kms * distants_minutid);
				new_kaugus2 = kaugus_meetrites - (kms * distants_minutid1);
				System.out.println("Auto: "+m[0]+ ", kaugus maantee otspunktist: "+m[1]+" KM, auto kiirus on: "+m[2]+ " KM/H.\n");
				System.out.println("Kaugus meetrites on: "+ kaugus_meetrites);
				System.out.println("Auto liigub: "+kms+ " meetrit sekundis.");
				System.out.println("Auto uus kaugus meetrites on (3sekundit): "+new_kaugus);
				System.out.println("Auto uus kaugus meetrites on (300sekundit): "+new_kaugus1);
				System.out.println("Auto uus kaugus meetrites on (7200sekundit): "+new_kaugus2);
			}
			if(m[0].equals("Audi")){
				kms = (Integer.parseInt(m[2])) * 0.27;
				kaugus_meetrites = (Integer.parseInt(m[1])) * 1000;
				new_kaugus = kaugus_meetrites - (kms * distants_sekundid);
				new_kaugus1 = kaugus_meetrites - (kms * distants_minutid);
				new_kaugus2 = kaugus_meetrites - (kms * distants_minutid1);
				System.out.println("Auto: "+m[0]+ ", kaugus maantee otspunktist: "+m[1]+" KM, auto kiirus on: "+m[2]+ " KM/H.\n");
				System.out.println("Kaugus meetrites on: "+ kaugus_meetrites);
				System.out.println("Auto liigub: "+kms+ " meetrit sekundis.");
				System.out.println("Auto uus kaugus meetrites on (3sekundit): "+new_kaugus);
				System.out.println("Auto uus kaugus meetrites on (300sekundit): "+new_kaugus1);
				System.out.println("Auto uus kaugus meetrites on (7200sekundit): "+new_kaugus2);
			}
			if(m[0].equals("Opel")){
				kms = (Integer.parseInt(m[2])) * 0.27;
				kaugus_meetrites = (Integer.parseInt(m[1])) * 1000;
				new_kaugus = kaugus_meetrites - (kms * distants_sekundid);
				new_kaugus1 = kaugus_meetrites - (kms * distants_minutid);
				new_kaugus2 = kaugus_meetrites - (kms * distants_minutid1);
				System.out.println("Auto: "+m[0]+ ", kaugus maantee otspunktist: "+m[1]+" KM, auto kiirus on: "+m[2]+ " KM/H.\n");
				System.out.println("Kaugus meetrites on: "+ kaugus_meetrites);
				System.out.println("Auto liigub: "+kms+ " meetrit sekundis.");
				System.out.println("Auto uus kaugus meetrites on (3sekundit): "+new_kaugus);
				System.out.println("Auto uus kaugus meetrites on (300sekundit): "+new_kaugus1);
				System.out.println("Auto uus kaugus meetrites on (7200sekundit): "+new_kaugus2);
			}
			if(m[0].equals("Volvo")){
				kms = (Integer.parseInt(m[2])) * 0.27;
				kaugus_meetrites = (Integer.parseInt(m[1])) * 1000;
				new_kaugus = kaugus_meetrites - (kms * distants_sekundid);
				new_kaugus1 = kaugus_meetrites - (kms * distants_minutid);
				new_kaugus2 = kaugus_meetrites - (kms * distants_minutid1);
				System.out.println("Auto: "+m[0]+ ", kaugus maantee otspunktist: "+m[1]+" KM, auto kiirus on: "+m[2]+ " KM/H.\n");
				System.out.println("Kaugus meetrites on: "+ kaugus_meetrites);
				System.out.println("Auto liigub: "+kms+ " meetrit sekundis.");
				System.out.println("Auto uus kaugus meetrites on (3sekundit): "+new_kaugus);
				System.out.println("Auto uus kaugus meetrites on (300sekundit): "+new_kaugus1);
				System.out.println("Auto uus kaugus meetrites on (7200sekundit): "+new_kaugus2);
			}
			rida=br.readLine();
		}
		

	}
}