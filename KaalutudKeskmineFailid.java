import java.io.PrintWriter;
import java.io.File;
import java.io.*;
import java.util.*;

public class KaalutudKeskmineFailid{
	public static void main(String[] args) throws Exception{
		Keskmine kt1=new Keskmine();
		
		ArrayList<Integer> hinded=new ArrayList<Integer>();
        ArrayList<Integer> ainepunktid=new ArrayList<Integer>();
		
		BufferedReader br=new BufferedReader(new FileReader("andmed.txt"));
		BufferedReader uus=new BufferedReader(new InputStreamReader(System.in));
	
		String rida=br.readLine();
		rida=br.readLine();
		
		while(rida!=null){
			String[] m=rida.split(",");
			hinded.add(kt1.Hinded(m[1]));
			ainepunktid.add(Integer.parseInt(m[2]));
			rida=br.readLine();
		}
		br.close();
		
	//faili loomine
		System.out.println("Sisestage õpilase eesnimi:");
		String eesnimi=uus.readLine();
		
		System.out.println("Sisestage õpilase perekonnanimi:");
		String perekonnanimi=uus.readLine();
		
		double keskmineHinne=kt1.keskmineHinne(ainepunktid, hinded);
	
		String file =(eesnimi+ "" +perekonnanimi+ ".txt");
        PrintWriter printWriter=new PrintWriter(new FileWriter(file));
        
		printWriter.println("Õpilase eesnimi: " +eesnimi);
		printWriter.println("Õpilase perekonnanimi: " +perekonnanimi);
		printWriter.println("Kaalutud keskmine hinne: " +keskmineHinne);
        printWriter.close();

    }	
    ArrayList<Integer> ainepunktid=new ArrayList<Integer>();
	ArrayList<Integer> hinded=new ArrayList<Integer>();

	public double keskmineHinne(ArrayList<Integer> ainepunktid, ArrayList<Integer> hinded){
		int kk_summa=0;
		int ap_summa=0;
//kaalutud keskmine kk = kaalutud keskmine ap = ainepunkt				
		for(int i=0; i<ainepunktid.size(); i++){
			kk_summa+=ainepunktid.get(i)*hinded.get(i);
			ap_summa+=ainepunktid.get(i);	
		}
		double keskmine=(double) kk_summa/ap_summa;	
		return keskmine;
	}
}