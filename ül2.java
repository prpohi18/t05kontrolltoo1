import java.net.*;
import java.io.*;
import java.util.*;

public class ül2{
	public static void main(String[] arg) throws Exception{
		String aadress="http://greeny.cs.tlu.ee/~pettkair/hinded.txt";
		BufferedReader br=new BufferedReader(new InputStreamReader(
		  new URL(aadress).openStream()));
		String rida=br.readLine();
		/*if(!rida.startsWith("liik")){
			System.out.println("sobiva pealkirjata fail");
			return;
		}*/
		rida=br.readLine();
		/*int ainepunktidesumma=0;
		int hinnetesumma=0;
		int ainepunktidekogus=0;
		int hinnetekogus=0;*/
		int lisa=1;
		int ainepunktid1=0;
		int hinded1=0;
		int ainepunktid2=0;
		int hinded2=0;
		while(rida!=null){
			System.out.println(rida);
			String[] m=rida.split(",");
			if(m[0].equals("programmeerimine")){
				ainepunktid1+=Integer.parseInt(m[1]);
			
			}
			if(m[0].equals("programmeerimine")){
				hinded1+=Integer.parseInt(m[2]);
			
			}
			if(m[0].equals("matemaatika")){
				ainepunktid2+=Integer.parseInt(m[1]);
			
			}
			if(m[0].equals("matemaatika")){
				hinded2+=Integer.parseInt(m[2]);
			
			}
			/*if(m[0].equals("programmeerimine")){
				ainepunktid2+=lisa;
			
			}
			if(m[0].equals("programmeerimine")){
				hinded2+=lisa;
			
			}
			if(m[0].equals("matemaatika")){
				ainepunktid2+=lisa;
			
			}
			if(m[0].equals("matemaatika")){
				hinded2+=lisa;
			}*/
			
		rida=br.readLine();
		
		}
		
		int keskmine = (ainepunktid1 * hinded1 + ainepunktid2 * hinded2) / (ainepunktid1 + ainepunktid2);
		
		//double average1 = ainepunktidesumma / ainepunktidekogus;
		//double average2 = hinnetesumma / hinnetekogus;
				
	//System.out.println("Ainepunktide keskmine "+average1);
	//System.out.println("Hinnete keskmine "+average2);
	//System.out.println("ainepunktid1 "+ainepunktid1);
	//System.out.println("hinded1 "+hinded1);
	//System.out.println("ainepunktid2 "+ainepunktid2);
	//System.out.println("hinded2 "+hinded2);
	
	System.out.println("Kaalutletud keskmine on "+keskmine);
	
	}
}