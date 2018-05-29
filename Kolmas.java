import java.io.*;
import java.util.*;
import java.lang.Math;

public class Kolmas{
	public static void main(String[] args) throws Exception{
		 List<Double> palgad = new ArrayList<Double>();
		 
		 BufferedReader in = new BufferedReader(new FileReader(new File("koefitsent.txt")));
		 double palk = 0;
		 int rida = 0;
		 double esiPalk = 0;
		 double konstKoef = 0;
		 double uusPalk = 0;
		 double esiKoef = 0;
		 double samaKoef = 0;
		 for (String x = in.readLine(); x != null; x = in.readLine()){
			rida++;
			 
			if (rida <= 1){
				palk = Double.parseDouble(x);
				esiPalk = palk;
				konstKoef = palk;
			} if (rida == 2){
				esiKoef = (Double.parseDouble(x));
				uusPalk = esiKoef * esiPalk + esiPalk;
				System.out.println(uusPalk);
				palk = uusPalk;
				palgad.add(palk);
			} else {
				uusPalk = (Double.parseDouble(x)) * palk + palk;
				palk = uusPalk;
				palgad.add(palk);
			}
			
		}
		
		System.out.println(konstKoef); 
		System.out.println(esiKoef);
		 for (int i=0; i<5; i++){
			konstKoef = konstKoef * esiKoef + konstKoef;
		 }
		 
		 String tmp=palgad.toString();
		 PrintWriter pw=new PrintWriter(new FileWriter("uuedpalgad.txt"));
		 try{	
			pw.println(tmp.substring(1,tmp.length()-1));
			pw.println("Kui koefitsent oleks sama, oleks palk: "+ konstKoef);
			pw.close();
		} catch(Exception ex){
			ex.printStackTrace();
		}

		System.out.println(palgad);
		}
		
	}