import java.awt.image.*;
import javax.imageio.*;
import java.awt.*;
import java.net.*;
import java.io.*;

public class KT{
	
	static float esimene(){
		float[] arvud={10,10,10};
		float vastus=0;
		for (int i = 0; i<arvud.length; i++){
			float arv=0;
			if((i+1) == (arvud.length)){
				arv = arvud[i]/2;
			}else if(i==0){
				arv = arvud[i]/2;
			}else{
				arv = arvud[i];
			}
			vastus = vastus + arv;
		}
		vastus = vastus/2;
		return vastus;
	}
	
	static float teine(String[] args){
		float vastus=0;
		int len=args.length;
			for (int i = 0; i<len; i++){
				float arv=0;
				if((i+1) == (len)){
					arv = Float.parseFloat(args[i])/2;
				}else if(i==0){
					arv = Float.parseFloat(args[i])/2;
				}else{
					arv = Float.parseFloat(args[i]);
				}
				vastus = vastus + arv;
		}
		vastus = vastus/(len-1);
		return vastus;
	}
	
	static void kolmas() throws Exception{
		String source = "http://greeny.cs.tlu.ee/~kellrasm/Java/java/t05kontrolltoo1/sisend.txt";
		BufferedReader br=new BufferedReader(new InputStreamReader(new URL(source).openStream()));
		String line=br.readLine(); //headers
		if(!line.startsWith("kuupaev")){
			System.out.println("sobiva pealkirjata fail");
			return;
		}
		PrintWriter print = new PrintWriter(new FileWriter("keskmised.txt"));
		line = br.readLine();
		while(line != null) {
			String[] osad = line.split(",");
			line = br.readLine();
			int len=osad.length;
			float answer=0;
			float kokku=0;
			String kuupaev = (osad[0]);
			print.println("Kuupäev: " + kuupaev);
			for(int i = 1; i<len; i++){
				if(i==1){
					kokku=kokku+Float.parseFloat(osad[i])/2;
				}else if(i==5){
					kokku=kokku+Float.parseFloat(osad[i])/2;
				}else{
					kokku=kokku+Float.parseFloat(osad[i]);
				}
			}
			answer=kokku/(len-1);
			kokku=0;
			print.println("Keskmine temperatuur: " + answer);
		}
	print.close();
	br.close();
	return;
	}
	
	
    public static void main(String[] arg) throws Exception{
		float ans1=esimene();
		float ans2=teine(arg);
		System.out.println("Esimene:");
		System.out.println(ans1);
		System.out.println("Teine:");
		System.out.println(ans2);
		kolmas();
		System.out.println("Kolmas vastus keskmised.txt failis");
		
	}
}