import java.awt.image.*;
import javax.imageio.*;
import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class punkt3{
    public static void main(String[] arg) throws Exception{
		BufferedImage bi = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.createGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 500, 400);
		BufferedReader br=new BufferedReader(new FileReader("kiirused.txt"));
		String rida = br.readLine();
		//tabeli sisu
		g.setColor(Color.RED);
		g.drawLine(30, 190, 30, 290);
		//tabeli kuju
		g.setColor(Color.BLACK);
        g.drawLine(30, 370, 440, 370); //alguspunkt x, y, lõpppunkt x, y
        g.drawLine(30, 170, 30, 370);
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.drawString("Teepikkus(m)", 230, 390);
        g.drawString("2000", 445, 375);
        g.drawString("Aeg(sek)", 20, 140);
        g.drawString("100", 20, 160);
		ImageIO.write(bi, "png", new File("kiirused.png"));
	}
}