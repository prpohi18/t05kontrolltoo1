import java.io.*;
import java.util.*;

public class kt1 {
	public static void main(String[] argumendid) throws IOException{
		BufferedReader sisse=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Esimese aine hinne: ");
		String Hinne1=sisse.readLine();
		int hinne1=Integer.parseInt(Hinne1);
		
		System.out.println("Ainepunktide arv: ");
		String Ainepunkt1=sisse.readLine();
		int ainepunkt1=Integer.parseInt(Ainepunkt1);
		
		System.out.println("Teise aine hinne: ");
		String Hinne2=sisse.readLine();
		int hinne2=Integer.parseInt(Hinne2);
		
		System.out.println("Ainepunktide arv: ");
		String Ainepunkt2=sisse.readLine();
		int ainepunkt2=Integer.parseInt(Ainepunkt2);
		
		double keskmine_hinne=keskmineHinne(hinne1, hinne2, ainepunkt1, ainepunkt2);
		
		System.out.println("Keskmine hinne on: " +keskmine_hinne);
	}
	
	public static double keskmineHinne(
		int hinne1, int hinne2, int arv1, int arv2){
			//SUMMA
			int kaalutud_summa=hinne1*arv1+hinne2*arv2;
			//AINEPUNKTIDE SUMMA
			int ainepunktide_summa=arv1+arv2;
			//KAALUTUD KESKMINE
			double keskmine=(double) kaalutud_summa/ainepunktide_summa;		
			return keskmine;
	}
}