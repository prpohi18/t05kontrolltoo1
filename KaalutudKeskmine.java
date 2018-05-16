import java.io.*;
import java.util.*;

//esimene osa

public class KaalutudKeskmine{
	public static void main(String[] args) throws IOException{
		BufferedReader uus=new BufferedReader(new InputStreamReader(System.in));

		//kasutaja sisestab hinded ja ainepunktid
		System.out.println("Sisestage esimene hinne: ");
		String Hinne1 = uus.readLine();
		int hinne1 = Integer.parseInt(Hinne1);

		System.out.println("Sisestage ainepunktid: ");
		String EAP1 = uus.readLine();
		int eap1 = Integer.parseInt(EAP1);

		System.out.println("Sisestage teine hinne: ");
		String Hinne2 = uus.readLine();
		int hinne2 = Integer.parseInt(Hinne2);

		System.out.println("Sisestage ainepunktid: ");
		String EAP2 = uus.readLine();
		int eap2 = Integer.parseInt(EAP2);

		//keskmise arvutamine ja väljastamine
		//kaalutud keskmine valem: (hinne*EAP)+(hinne*EAP)/(EAP + EAP)
		double keskmine_hinne = ((hinne1*eap1)+(hinne2*eap2))/(eap1+eap2);
		System.out.println("Keskmine hinne on: " +keskmine_hinne);
	}
}

/*
Sisestage esimene hinne:
4
Sisestage ainepunktid:
4
Sisestage teine hinne:
5
Sisestage ainepunktid:
4
Keskmine hinne on: 4.0
*/

