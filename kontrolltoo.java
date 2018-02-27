import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class kontrolltoo{
	public static void main(String[] arg) throws Exception{
		String aadress="http://www.tlu.ee/~rolandka/kiirused.txt";
		BufferedReader br=new BufferedReader(new InputStreamReader(
			new URL(aadress).openStream()));
		String rida=br.readLine();
		int loik=1;
		double kiirus1=50;
		double kiirus2=75;
		int nr=0;
		double keskmine;
		double summa=0;
		double vahearv=0;
		
		BufferedImage bi=new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
		Graphics g=bi.createGraphics();
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, 400, 300);
		g.setColor(Color.BLUE);
		g.drawLine(40, 250, 40, 50);//x1, y1, x2, y2
	    g.drawLine(40, 250, 300, 250);
		g.setFont(new Font("Arial Black", Font.BOLD, 20));
        g.drawString("Aeg", 10, 25);
		g.drawString("Kaugus", 310, 250);
		
		
		while(rida!=null){
			nr+=1;
			g.drawLine(50+(nr*20), 255, 50+(nr*20), 245);
			System.out.println(rida);
			summa+=(loik/Double.parseDouble(rida));
			vahearv=summa*300;
			int i = (int) vahearv;
			g.drawLine(45+(nr*20), 230-i, 55+(nr*20), 230-i);
			rida=br.readLine();
		}		
		//kiirus2=(loik/kiirus2);
		//kiirus1=(loik/kiirus1);
		//keskmine=(kiirus1+kiirus2)/nr;
		//keskmine=((loik/kiirus1)+(loik/kiirus2)/nr);
		keskmine=(summa/nr)*60;
		System.out.println("Keskmine aeg on: "+keskmine);
		System.out.println("Keskmine kiirus on: "+60/keskmine);
		ImageIO.write(bi, "png", new File("KT.png"));
		br.close();
	}
}