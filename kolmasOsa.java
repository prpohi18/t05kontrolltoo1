import java.io.*;
import java.util.*;
import java.lang.Math;

public class kolmasOsa{
	public static void main(String[] args) throws Exception{
		 List<Double> palgad = new ArrayList<Double>();
		 
		 BufferedReader in = new BufferedReader(new FileReader(new File("koefitsent.txt")));
		 double palk = 0;
		 int rida = 0;
		 double esimenePalk = 0;
		 double konstantKoef = 0;
		 double uusPalk = 0;
		 double esimeneKoef = 0;
		 double samaKoef = 0;
		 for (String x = in.readLine(); x != null; x = in.readLine()){
			rida++;
			 
			if (rida <= 1){
				palk = Double.parseDouble(x);
				esimenePalk = palk;
				konstantKoef = palk;
			} if (rida == 2){
				esimeneKoef = (Double.parseDouble(x));
				uusPalk = esimeneKoef * esimenePalk + esimenePalk;
				System.out.println(uusPalk);
				palk = uusPalk;
				palgad.add(palk);
			} else {
				uusPalk = (Double.parseDouble(x)) * palk + palk;
				palk = uusPalk;
				palgad.add(palk);
			}
			
		}
		
		System.out.println(konstantKoef); 
		System.out.println(esimeneKoef);
		 for (int i=0; i<5; i++){
			konstantKoef = konstantKoef * esimeneKoef + konstantKoef;
		 }
		 
		 String tmp=palgad.toString();
		 PrintWriter pw=new PrintWriter(new FileWriter("uuedpalgad.txt"));
		 try{	
			pw.println(tmp.substring(1,tmp.length()-1));
			pw.println("kui koef oleks algusest lõpuni sama, oleks palk: "+ konstantKoef);
			pw.close();
		} catch(Exception ex){
			ex.printStackTrace();
		}
			
		 
		

		System.out.println(palgad);
		}
		
	}