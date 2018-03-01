package kontrolltöö;

import java.awt.image.*;
import java.io.*;


import javax.imageio.ImageIO;
import java.awt.*;


public class Joonis {

	public static void createImage(double kronoloogiline,String[] andmed) {
		try {
			int suurendaja=0;
			BufferedImage bi = new BufferedImage(500, 400, BufferedImage.TYPE_INT_RGB);
			Graphics g = bi.createGraphics();
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, 500, 400);
			g.setColor(Color.BLUE);
			g.drawString("Kronoloogiline keskmine" , 20, 35);
			g.drawLine(0, 200, 200, 200);
			g.drawRect(50, 200, 10, (int) kronoloogiline);
			g.fillRect(50, 200, 10, (int) kronoloogiline);
			g.setColor(Color.RED);
			g.drawString("Numbrilised üksikväärtused" , 20, 20);
			for(int i = 0; i < andmed.length; i++) {
				g.drawRect(suurendaja, 200-Integer.parseInt(andmed[i]), 20,Integer.parseInt(andmed[i]));
				g.fillRect(suurendaja, 200-Integer.parseInt(andmed[i]), 20,Integer.parseInt(andmed[i]));
				suurendaja=suurendaja+40;

			}


			ImageIO.write(bi, "png", new File("tulemused.png"));

		} catch (Exception ie) {
			ie.printStackTrace();
		}

	}

}
