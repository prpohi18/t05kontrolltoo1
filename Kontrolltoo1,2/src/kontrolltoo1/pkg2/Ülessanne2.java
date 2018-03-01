package kontrolltoo1.pkg2;

import java.net.*; 
import java.io.*;

public class Ülessanne2 {
    public static void main(String[] arg) throws Exception{ 
		String aadress="http://www.tlu.ee/~egert112/KTandmed.txt"; 
		BufferedReader br=new BufferedReader(new InputStreamReader(new URL(aadress).openStream())); 
		String rida=br.readLine(); 
		if(!rida.startsWith("asukoht")){
			System.out.println("Ebasobiv pealkiri");
			return;
		}
		rida=br.readLine();
		System.out.println("Andmed failis:");
		int keskmistesumma=0;
		int jagatavatesumma=0;
		while(rida!=null){
			System.out.println(rida);
			String[] m=rida.split(",");
			if(m[0].equals("aares")){
				jagatavatesumma+=Integer.parseInt(m[1]);
			}
			rida=br.readLine();
			if(m[0].equals("keskel")){ 
				keskmistesumma+=Integer.parseInt(m[1]); 
			} 
		}
		System.out.println("Keskel olevate arvude kokku liidetud summa: "+keskmistesumma+".");
		System.out.println("Esimene ja viimane arv jagatud pooleks ja nende summa : "+jagatavatesumma/2+".");
		System.out.println("Kronoloogiline keskmine, äärmiste ja keskmiste arvude summa jagatud kuuega: "+(keskmistesumma+(jagatavatesumma/2))/6+".");
                
	}
    //Keskel olevate arvude kokku liidetud summa: 200.
    //Esimene ja viimane arv jagatud pooleks ja nende summa : 55.
    //Kronoloogiline keskmine, äärmiste ja keskmiste arvude summa jagatud kuuega: 42.
}
