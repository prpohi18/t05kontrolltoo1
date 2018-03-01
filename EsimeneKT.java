import java.io.*;
import java.util.*;  
public class EsimeneKT {  
	public static double kaalutud(int hinne1, int hinne2, int ainepunkt1, int ainepunkt2){   				 
			int kaalutudsumma=hinne1*ainepunkt1+hinne2*ainepunkt2; 
			int ainepunktidesumma=ainepunkt1+ainepunkt2;  
			double keskmine=(double) kaalutudsumma/ainepunktidesumma;		  
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
		double kaalutudkeskmine=kaalutud(hinne1, hinne2, ainepunkt1, ainepunkt2);
		System.out.println("Esimese aine hinne on: " +hinne1);
		System.out.println("Teise aine hinne on: " +hinne2);
		System.out.println("Esimese aine ainepunktide maht on: " +ainepunkt1);
		System.out.println("Teise aine ainepunktide maht on: " +ainepunkt2);
		System.out.println("Kaalutud keskmine hinne on: " +kaalutudkeskmine); 
	}  
}