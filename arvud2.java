import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.awt.image.*;
import javax.imageio.*;
import java.awt.*;

public class arvud2{
	public static void main(String [] args) throws Exception{
		java.util.List<Integer> arvudList = new ArrayList<Integer>();
		int arv1, arv2, arv3;
		int korrutis;
		double kuupjuur;
		int arrayLength;
		//int str;
		 Scanner input = new Scanner (System.in);
		 
		 System.out.println("Sisesta 3 arvu ja leitakse nende korrutis ning vastavalt arvude koguse järgi kuupjuur" );
		 arv1 = input.nextInt();
		 arv2 = input.nextInt();
		 arv3 = input.nextInt();
		 
		 input.close();
		 
		 korrutis = arv1*arv2*arv3;
		  
		 //arrayLength= arvudList.length; 
		 
		 arvudList.add(arv1);
		 arvudList.add(arv2);
		 arvudList.add(arv3);
		 //System.out.println(arvudList);
		 //System.out.println(arvudList.size());
		 int massiivipikkus = arvudList.size();
		 kuupjuur = Math.pow(korrutis, 1.0/massiivipikkus);
		 System.out.println("Arvude korrutis on " + korrutis + " ja kuupjuur sellest on " + kuupjuur);
		 
		 double muut1 = arvudList.get(2)/arvudList.get(1);
		 double muut2 = arvudList.get(1)/arvudList.get(0);
		 double avg = muut1 + muut2/2;
		 double ennustus1= arv1*avg;
		 double ennustus2= arv2*avg;
		 
		 
		 System.out.println("Palga keskmine muut oli " + avg);
		 
		 
		 BufferedImage bi=new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
		 Graphics g=bi.createGraphics();
		 g.setColor(Color.GREEN);
		 g.fillRect(10, 20, 380, 260);
		 g.setColor(Color.BLUE);
		 g.fillRect(arv1, 200, 10, 10);
		 g.setColor(Color.BLUE);
		 g.fillRect(arv2, 200, 10, 10);
		 g.setColor(Color.BLUE);
		 g.fillRect(arv3, 200, 10, 10);
		 g.drawLine(70, 250, 330, 250);
		 g.drawString("0", 70, 260);
		 g.drawString("300", 300, 260);
		 g.setColor(Color.RED);
		 g.fillRect((int)Math.round(ennustus1), 200, 5, 5);
		 g.setColor(Color.RED);
		 g.fillRect((int)Math.round(ennustus2), 200, 5, 5);
		 //g.setColor(arv2/30, 200)
		 System.out.println((int)Math.round(ennustus2));
		 
		 
		 ImageIO.write(bi, "png", new File("palk.png"));
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
}
		