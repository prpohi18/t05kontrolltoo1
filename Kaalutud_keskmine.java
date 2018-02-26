import java.io.*;
import java.util.*;

public class Kaalutud_keskmine {

	public static double kaalutudKeskmine(int hinne1, int hinne2, int maht1, int maht2){   				
			int kaalutud_summa=hinne1*maht1+hinne2*maht2;
			int ainepunktide_summa=maht1+maht2;
			double keskmine=(double) kaalutud_summa/ainepunktide_summa;		
			return keskmine;
	}

	public static void main(String[] argumendid) throws IOException{
		BufferedReader sisse=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Sisesta esimese aine hinne:");
		String Hinne1=sisse.readLine();
		int hinne1=Integer.parseInt(Hinne1);
		
		System.out.println("Sisesta esimese aine ainepunktide maht:");
		String Ainepunkt1=sisse.readLine();
		int ainepunkt1=Integer.parseInt(Ainepunkt1);
		
		System.out.println("Sisesta teise aine hinne:");
		String Hinne2=sisse.readLine();
		int hinne2=Integer.parseInt(Hinne2);
		
		System.out.println("Sisesta teise aine ainepunktide maht:");
		String Ainepunkt2=sisse.readLine();
		int ainepunkt2=Integer.parseInt(Ainepunkt2);
		
		double kaalutud_keskmine_hinne=kaalutudKeskmine(hinne1, hinne2, ainepunkt1, ainepunkt2);
		
		System.out.println("Kaalutud keskmine hinne on: " +kaalutud_keskmine_hinne);
	}

}
