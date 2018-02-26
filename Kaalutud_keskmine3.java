import java.io.*;
import java.util.*;

public class Kaalutud_keskmine3{
	public static void main(String[] args) throws Exception{
		Kaalutud_keskmine2 objekt1=new Kaalutud_keskmine2();
		
		ArrayList<Integer> hinded=new ArrayList<Integer>();
		ArrayList<Integer> punktid=new ArrayList<Integer>();
		
		BufferedReader br=new BufferedReader(new FileReader("Hinded.txt"));
		BufferedReader sisse=new BufferedReader(new InputStreamReader(System.in));
	
		String rida=br.readLine();
		rida=br.readLine();
		while(rida!=null){
			String[] m=rida.split(",");
			hinded.add(objekt1.Teisendus(m[1]));
			punktid.add(Integer.parseInt(m[2]));
			rida=br.readLine();
		}
		br.close();
		
		System.out.println("Sisesta yli6pilase eesnimi:");
		String eesnimi=sisse.readLine();
		
		System.out.println("Sisesta yli6pilase perekonnanimi:");
		String perekonnanimi=sisse.readLine();
		
		double kaalutudKeskmine=objekt1.kaalutudKeskmine(punktid, hinded);
		
		String FailiNimi = "Tulemused/" +eesnimi+ "_" +perekonnanimi+ ".txt";

		try{
            PrintWriter pw=new PrintWriter(new FileWriter(FailiNimi));
            pw.println("Yli6pilase eesnimi: " +eesnimi);
			pw.println("Yli6pilase perekonnanimi: " +perekonnanimi);
			pw.println("Kaalutud keskmine hinne: " +kaalutudKeskmine);
            pw.close();
           } catch(Exception ex){
               ex.printStackTrace();
           }
	}	
}