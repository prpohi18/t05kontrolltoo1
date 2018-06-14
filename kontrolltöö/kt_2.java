import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.awt.image.*;
import javax.imageio.*;
import java.awt.*;


public class kt_2{
    public static void main(String [] args) throws Exception{
        Scanner in=new Scanner (System.in);
        int arvud[]=new int[5];
        int i=0;
		int korrutis = 1;

        for (i=0;i<arvud.length;i++) {
            System.out.println("Sisesta number: ");
            arvud[i]=in.nextInt();
			korrutis = korrutis * arvud[i];
			
        }
		
		double pikkus = arvud.length;
        double juur = Math.pow(korrutis, 1.0 / pikkus);
        System.out.println("Arvud võetakse kokku ja võetakse juur, kuimitu arvu oli. ");
		for (i=0; i<arvud.length;i++){
		System.out.println("Arv: " + arvud[i]);
		}
		System.out.println("Juur nendest arvudest: " + juur);
		
		/*Sisesta number:
		5
		Sisesta number:
		4
		Sisesta number:
		2
		Sisesta number:
		1
		Sisesta number:
		6
		Arvud võetakse kokku ja võetakse juur, kuimitu arvu oli.
		Arv: 5
		Arv: 4
		Arv: 2
		Arv: 1
		Arv: 6
		Juur nendest arvudest: 2.9925557394776896*/
		
	int palk1 = 100;
	int palk2 = 200;
	int palk3 = 300;
	
	int vahe1 = palk3 / palk2;
	int vahe2 = palk2 / palk1;
	
	double keskmine = Math.sqrt(vahe1*vahe2);
	System.out.println("Palga geomeetriline keskmine aastane muutus: "+keskmine);
	
	int muutus1 = palk1*keskmine;
	int muutus2 = palk2*keskmine;

	
	BufferedImage bi=new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
	Graphics g=bi.createGraphics();
	g.setColor(Color.WHITE);
	g.fillRect(10, 20, 380, 260);
	g.setColor(Color.BLUE);
	g.fillRect(palk1, 200, 10, 10);
	g.setColor(Color.BLUE);
	g.fillRect(palk2, 200, 10, 10);
	g.setColor(Color.BLUE);
	g.fillRect(palk3, 200, 10, 10);
	g.drawLine(50, 250, 330, 250);
	g.drawString("100", 100, 260);
	g.drawString("200", 200, 260);
	g.drawString("300", 300, 260);
	g.setColor(Color.RED);
	g.fillRect((int)Math.round(muutus1), 200, 5, 5);
	g.setColor(Color.RED);
	g.fillRect((int)Math.round(muutus2), 200, 5, 5);
	//g.setColor(arv2/30, 200)
		 
		 
	ImageIO.write(bi, "png", new File("palk.png"));
    }
	
}