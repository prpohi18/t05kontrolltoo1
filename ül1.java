import java.net.*;
import java.io.*;

public class ül1{
	public static void main(String[] arg){
		
	int aine1 =30;
	int aine2 =19;
	int hinne1 =5;
	int hinne2 =3;
	//int ainekesk = (aine1 + aine2) / 2;
	//int hinnekesk = (hinne1 + hinne2)/ 2;
	int keskmine = (aine1 * hinne1 + aine2 * hinne2) / (aine1 + aine2);
	//System.out.println("Ainepunktide keskmine on "+ainekesk);
	//System.out.println("Hinnete keskmine on "+hinnekesk);
	System.out.println("Kaalutletud keskmine on "+keskmine);
	
	}
}
// (30 * 5 + 19 * 3) / (30 + 19)