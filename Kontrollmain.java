import java.util.*;
import java.awt.image.*;
import javax.imageio.*;
import java.awt.*;
import java.net.*;
import java.io.*;

public class Kontrollmain {
   
    public static void main(String[] arg) throws Exception {
		int [] m = {3, -8, 0, 20, -1, 100, 7};
		int min = Arrays.stream(m).min().getAsInt();
        int max = Arrays.stream(m).max().getAsInt();
		
		System.out.println("Järjestatult massiiv alates vähimast:");
		
		Arrays.sort(m); 
		for ( int i = 0 ; i < m.length ; i++ ) {
            System.out.println(m[i]);
		}
        System.out.println("Vähim = " + min);
        System.out.println("Suurim = " + max);
		
		int sum = 0;
		for (int d : m) sum += d;
		double average = sum / m.length;
		System.out.println(average);
		
		int veerand = 0;
		int pool = (int)average;
		int kolmveerand = 0;
		

		
		ArrayList <Integer> massiiv = new ArrayList<Integer>();
		massiiv.add(min);
		massiiv.add(veerand);
		massiiv.add(pool);
		massiiv.add(kolmveerand);
		massiiv.add(max);
		System.out.println("Massiivi suurus " + massiiv.size()+ " elementi.");
		System.out.println(massiiv);
	
		// Joonis
		
		BufferedImage bi = new BufferedImage(575, 575, BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.createGraphics();
        
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 575, 575);

        g.setColor(Color.GRAY);
        
        g.drawLine(50, 475, 550, 475);
        g.drawString("Listi arvud", 450, 525);
		
      
        g.drawString(Integer.toString(min)+" Miinimum", 45, 500);
        g.drawString("Maksimum "+Integer.toString(max), 470, 500);
        
		//g.drawLine(pool, 40, pool, 475);
		
		ImageIO.write(bi, "png", new File("Ktjoonis.png"));
	}
}

