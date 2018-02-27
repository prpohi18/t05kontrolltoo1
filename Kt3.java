//Libisev keskmine 3.ülesanne
import java.net.*;
import java.io.*;
import java.util.*;

public class Kt3{
	public static void main(String[] arg) throws Exception{
		String aadress="http://www.tlu.ee/~ojagre/kt.txt";
		BufferedReader br=new BufferedReader(new InputStreamReader(new URL(aadress).openStream()));
		String rida=br.readLine();
		
		List<Integer> arvud = new ArrayList<Integer>();
		while(rida!=null){
			arvud.add(new Integer(rida));
			rida=br.readLine();
		}	
		System.out.println(arvud);
		
		int mitu=4;
		double keskmine1=0;
		double keskmine2=0;
		double keskmine3=0;
		double keskmine4=0;
		int summa1=0;
		int summa2=0;
		int summa3=0;
		int summa4=0;
		for(int i=0; i<mitu; i++){
		
			summa1=arvud.get(0) + arvud.get(1) + arvud.get(2);
			keskmine1= summa1*1.0/3;

			summa2=arvud.get(1) + arvud.get(2) + arvud.get(3);
			keskmine2= summa2*1.0/3;

			summa3=arvud.get(2) + arvud.get(3) + arvud.get(4);
			keskmine3= summa3*1.0/3;	

			summa4=arvud.get(3) + arvud.get(4) + arvud.get(5);
			keskmine4= summa4*1.0/3;	
		}			

		List<Double> keskmised = new ArrayList<Double>();
		keskmised.add(new Double(keskmine1));
		keskmised.add(new Double(keskmine2));
		keskmised.add(new Double(keskmine3));
		keskmised.add(new Double(keskmine4));

		System.out.println("Uus massiiv keskmistest" +keskmised);
		br.close();

		PrintWriter pw=new PrintWriter(new FileWriter("ktVastus.txt"));
		pw.println(keskmised);	
		pw.close();
	}
}