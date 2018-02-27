import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.lang.Math;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.util.*;
public class Veebileht{
	public static void main(String[] arg) throws Exception{
		String aadress="http://www.tlu.ee/~valerivv/kiirused.txt";
		BufferedReader br=new BufferedReader(new InputStreamReader(new URL(aadress).openStream()));
		String rida=br.readLine();
		int kokku=0;
		float keskmine=0;
		int loendur=0;
		int rida_nr=1;
		ArrayList<Integer> arvud = new ArrayList<Integer>();
		//Prindib igat rida, mis on lehel. Listi lisamine rida 23
		while(rida!=null){
			loendur++;
			System.out.println(rida_nr+". "+rida);
			rida_nr++;
			//System.out.println(rida);
			int arv1 = Integer.parseInt(rida);
			kokku=arv1+kokku;
			arvud.add(Integer.parseInt(rida));
			rida=br.readLine();
		}
		br.close();
		float minutit = 0.0f;
		int loendur1 = 0;
		for(int i=0; i<arvud.size(); i++){
			loendur1++;
			minutit = (60.0f/arvud.get(i)*1.0f) + minutit; 
		}
		//keskmine kiirus
		float tulemus = (60*1.0f)/minutit;
		float keskmine1 = tulemus*1.0f * loendur1;
		System.out.println("Keskmine kiirus: "+keskmine1);
		//teksti kontroll
		BufferedReader br1=new BufferedReader(new FileReader("vastus.txt"));
		String rida1=br1.readLine();
		br1.close();
		if (rida1!=null){
			float kiri = Float.parseFloat(rida1);
			if (kiri != keskmine1) {
				PrintWriter pw=new PrintWriter(new FileWriter("vastus.txt"));
				pw.println(keskmine1);
				pw.close();
			}
		}
	}
}
