import java.io.PrintWriter;
import java.io.File;
import java.io.*;
import java.util.*;

public class kt3{
	public static void main(String[] args) throws Exception{
		kt2 objekt1=new kt2();
		
		ArrayList<Integer> hinded=new ArrayList<Integer>();
		ArrayList<Integer> punktid=new ArrayList<Integer>();
		
		BufferedReader br=new BufferedReader(new FileReader("hinded.txt"));
		BufferedReader sisse=new BufferedReader(new InputStreamReader(System.in));
	
		String rida=br.readLine();
		rida=br.readLine();
		
		//FAILIST LUGEMINE JA TEISENDAMINE
		while(rida!=null){
			String[] m=rida.split(",");
			hinded.add(objekt1.Teisendus(m[1]));
			punktid.add(Integer.parseInt(m[2]));
			rida=br.readLine();
		}
		br.close();
		
		//SISESTUS
		System.out.println("Sisesta üliõpilase eesnimi:");
		String eesnimi=sisse.readLine();
		
		System.out.println("Sisesta üliõpilase perekonnanimi:");
		String perekonnanimi=sisse.readLine();
		
		double keskmineHinne=objekt1.keskmineHinne(punktid, hinded);
		
		//UUDE FAILI KIRJUTAMINE
		String file =(eesnimi+ "_" +perekonnanimi+ ".txt");
		PrintWriter printWriter=new PrintWriter(new FileWriter(file));
		
		printWriter.println("Õpilase eesnimi: " +eesnimi);
		printWriter.println("Õpilase perekonnanimi: " +perekonnanimi);
		printWriter.println("Kaalutud keskmine hinne: " +keskmineHinne);
        printWriter.close();

	}	
}