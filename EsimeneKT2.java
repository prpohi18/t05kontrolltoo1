import java.io.PrintWriter; 
import java.io.File; 
import java.io.*; 
import java.util.*; 
public class EsimeneKT2{ 
	public static void main(String[] args) throws Exception{ 
		EsimeneKT1 objekt1=new EsimeneKT1(); 
		ArrayList<Integer> hinded=new ArrayList<Integer>(); 
		ArrayList<Integer> punktid=new ArrayList<Integer>(); 
		BufferedReader br=new BufferedReader(new FileReader("Hinded.txt")); 
		BufferedReader sisse=new BufferedReader(new InputStreamReader(System.in)); 
		String rida=br.readLine(); 
		rida=br.readLine(); 
		while(rida!=null){ 
			String[] m=rida.split(","); 
			hinded.add(objekt1.Teisendamine(m[1])); 
			punktid.add(Integer.parseInt(m[2])); 
			rida=br.readLine(); 
		} 
		br.close(); 
		System.out.println("Sisesta õpilase eesnimi:"); 
		String eesnimi=sisse.readLine(); 
		System.out.println("Sisesta õpilase perekonnanimi:"); 
		String perekonnanimi=sisse.readLine(); 
		double kaalutud=objekt1.kaalutud(punktid, hinded); 
		String FailiNimi = (eesnimi+ "_" +perekonnanimi+ ".txt");  
        PrintWriter pw=new PrintWriter(new FileWriter(FailiNimi)); 
        pw.println("Õpilase eesnimi: " +eesnimi); 
		pw.println("Õpilase perekonnanimi: " +perekonnanimi); 
		pw.println("Kaalutud keskmine hinne: " +kaalutud); 
        pw.close();
	}	 
} 