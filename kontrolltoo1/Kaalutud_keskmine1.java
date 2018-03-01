import java.io.*;
import java.util.*;
import java.util.ArrayList;

/* <<<<<<<<<<<<<<<<<<< 1 osa >>>>>>>>>>>>>>>>>>>>>>>>>>>>>
public class Kaalutud_keskmine1{
	public static double kaalutudKesk(int ainePunktid1,int ainePunktid2, int hinne1,int hinne2) {
			double ainePunktideSumma = ainePunktid1 + ainePunktid2;
			double osaKaal1 = ainePunktid1 * hinne1;
			double osaKaal2 = ainePunktid2 * hinne2;
			double kaalutudKeskmine = (osaKaal1/ainePunktideSumma)+(osaKaal2/ainePunktideSumma);
				
			return kaalutudKeskmine;
	}
	public static void main(String[] args) throws IOException{	
		int ainePunktid1 = 6;
		int ainePunktid2 = 3;		
		int hinne1 = 4;		
		int hinne2 = 5;
		
		double kaalutudKeskmineHinne = kaalutudKesk(ainePunktid1,ainePunktid2,hinne1,hinne2);
	
		System.out.println("Kaalutud keskmine hinne on: " +kaalutudKeskmineHinne);
	}
} */

public class Kaalutud_keskmine1{

	public static void main(String[] args) throws Exception{
		funktsioonid object1=new funktsioonid();
		
		ArrayList<Integer> ainetePunktid=new ArrayList<Integer>();
		ArrayList<Integer> aineteHinded=new ArrayList<Integer>();
		
		BufferedReader br=new BufferedReader(new FileReader("andmed.txt"));
		BufferedReader sisse=new BufferedReader(new InputStreamReader(System.in));
	
		
		String rida=br.readLine();
		rida=br.readLine();
		while(rida!=null){
			String[] m=rida.split(",");
			aineteHinded.add(object1.hinneteVaartused(m[2]));
			ainetePunktid.add(Integer.parseInt(m[1]));
			rida=br.readLine();
		}
		br.close();
		
		System.out.println("Sisesta opilase eesnimi:");
		String eesnimi=sisse.readLine();
		
		System.out.println("Sisesta opilase perekonnanimi:");
		String perekonnanimi=sisse.readLine();
		
		double kaalutudKeskmine=object1.kaalutudKeskmine(ainetePunktid, aineteHinded);
		
		String FailiNimi = eesnimi+ "_" +perekonnanimi+ ".txt";

		try{
            PrintWriter pw=new PrintWriter(new FileWriter(FailiNimi));
            pw.println("Eesnimi: " +eesnimi);
			pw.println("Perekonnanimi: " +perekonnanimi);
			pw.println("Kaalutud keskmine: " +kaalutudKeskmine);
            pw.close();
           } catch(Exception ex){
               ex.printStackTrace();
           }
	}
}	