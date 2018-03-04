import java.awt.image.*;
import javax.imageio.*;
import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class punkt2 {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader("kiirused.txt"));
		String rida = br.readLine();
		float aeg1;
		float aeg2;
		float aeg3;
		int kiirused;
		float kiirus1;
		float kiirus2;
		float kiirus3;
		
		while (rida != null) {
			String[] m = rida.split(",");
			if (m[0].equals("1")){
				aeg1 = (Integer.parseInt(m[0]) / Integer.parseInt(m[1])) * 60;
				kiirused=kiirused+1;
				kiirus1 = Integer.parseInt(m[1]);
			}
			if (m[0].equals("2")){
				aeg2 = (Integer.parseInt(m[0]) / Integer.parseInt(m[1])) * 60;
				kiirused=kiirused+1;
				kiirus2 = Integer.parseInt(m[1]);
			}
			if (m[0].equals("3")){
				aeg3 = (Integer.parseInt(m[0]) / Integer.parseInt(m[1])) * 60;
				kiirused=kiirused+1;
				kiirus3 = Integer.parseInt(m[1]);
			}
			rida = br.readLine();
			double keskminekiirus = (kiirus1 + kiirus2 + kiirus3) / kiirused;
			double aegkokku = aeg1 + aeg2 + aeg3;
		}
		System.out.print("Aeg esimesel kilomeetril: "+aeg1+" minutit\n");
		System.out.print("Aeg esimesel kilomeetril: "+aeg2+" minutit\n");
		System.out.print("Aeg esimesel kilomeetril: "+aeg3+" minutit\n");
		System.out.print("Kogu tee läbiti keskmise kiirusega: "+keskminekiirus+" km/h\n");
	}
}	
