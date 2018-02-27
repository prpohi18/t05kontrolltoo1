//Libisev keskmine
import java.net.*;
import java.io.*;

public class Kontrolltoo1{
	public static int[] arvud(String[]sisArv){
		int[] sisArvud=new int[sisArv.length];
		int summa=0;		
		for (int i=0; i<sisArv.length; i++){
			sisArvud[i]=Integer.parseInt(sisArv[i]);
		}
		return sisArvud;
	}
	
	public static int arvudeSum(int[] a){
		int summa=0;
		for(int arv: a){
			summa+=arv;
		}
		return summa;
	}
	
	public static void main(String[] args){
		int[] pikkusteArv=new int [args.length];
		int[] summa=arvud(args);
		float aritm=0;
		aritm = (float) arvudeSum(summa)/args.length;
		System.out.println("Aritmeetiline keskmine on: "+aritm);

	}
}

/*java Kontrolltoo1 2 5 7 9
Aritmeetiline keskmine on: 5.75
*/
