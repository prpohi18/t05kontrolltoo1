import javax.imageio.*;
import java.awt.image.*;
import java.awt.*;
import java.io.*;
import java.net.*;
public class ül3{
	public static void main (String[] arg) throws Exception{
		BufferedImage bi=new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
		Graphics g=bi.createGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 400, 300);
		String aadress="http://greeny.cs.tlu.ee/~pettkair/hinded.txt";
		BufferedReader br=new BufferedReader(new InputStreamReader(
		  new URL(aadress).openStream()));
		String rida=br.readLine();
		rida=br.readLine();
		int mate=0;
		int proge=0;
		int ainepunktid1=0;
		int hinded1=0;
		int ainepunktid2=0;
		int hinded2=0;
		int lisa=1;
		while(rida!=null){
			System.out.println(rida);
			String[] m=rida.split(",");
			if(m[0].equals("matemaatika")){g.setColor(Color.blue);
				mate+=Integer.parseInt(m[1]);
			
			}
			if(m[0].equals("programmeerimine")){g.setColor(Color.red);
				proge+=Integer.parseInt(m[1]);
			
			}
			if(m[0].equals("programmeerimine")){g.setColor(Color.red);
				ainepunktid1+=Integer.parseInt(m[1]);
			
			}
			if(m[0].equals("programmeerimine")){g.setColor(Color.red);
				hinded1+=Integer.parseInt(m[2]);
			
			}
			if(m[0].equals("matemaatika")){g.setColor(Color.blue);
				ainepunktid2+=Integer.parseInt(m[1]);
			
			}
			if(m[0].equals("matemaatika")){g.setColor(Color.blue);
				hinded2+=Integer.parseInt(m[2]);
			
			}
			/*if(m[0].equals("programmeerimine")){g.setColor(Color.red);
				ainepunktidekogus+=lisa;
			
			}
			if(m[0].equals("programmeerimine")){g.setColor(Color.red);
				hinnetekogus+=lisa;
			
			}
			if(m[0].equals("matemaatika")){g.setColor(Color.blue);
				ainepunktidekogus+=lisa;
			
			}
			if(m[0].equals("matemaatika")){g.setColor(Color.blue);
				hinnetekogus+=lisa;
			}*/
			
			
			
			int keskmine = (ainepunktid1 * hinded1 + ainepunktid2 * hinded2) / (ainepunktid1 + ainepunktid2);
			int punktid = ainepunktid1 + ainepunktid2;
			//double average1 = ainepunktidesumma / ainepunktidekogus;
			//double average2 = hinnetesumma / hinnetekogus;
			//g.fillRect((int)(keskmine), 300-Integer.parseInt(m[2])*2, 5, 5);
			//g.fillRect((int)(average2), 300-Integer.parseInt(m[2])*2, 5, 5);
			//g.fillRect((int)(proge), 300-Integer.parseInt(m[1])*2, 5, 5);
			//g.fillRect((int)(mate), 300-Integer.parseInt(m[1])*2, 5, 5);
			//g.fillRect((int)(hinnetesumma), 300-Integer.parseInt(m[2])*2, 5, 5);
			//g.fillRect((int)(ainepunktidesumma), 300-Integer.parseInt(m[1])*2, 5, 5);
			g.setColor(Color.GREEN);
			g.fillRect(25, 50, punktid, keskmine);
			g.setColor(Color.RED);
			g.fillRect(100, 50, ainepunktid1, hinded1);
			g.setColor(Color.BLUE);
			g.fillRect(150, 50, ainepunktid2, hinded2);
			g.setColor(Color.GREEN);
			g.drawString("Kaalutud keskmine", 50, 200);
			g.setColor(Color.RED);
			g.drawString("Programmeerimine", 50, 220);
			g.setColor(Color.BLUE);
			g.drawString("Matemaatika", 50, 240);
			
		rida=br.readLine();
		
		
		
		}
		
		ImageIO.write(bi, "png", new File("Hinded.png"));
	}
}