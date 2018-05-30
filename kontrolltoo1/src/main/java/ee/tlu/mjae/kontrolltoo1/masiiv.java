package ee.tlu.mjae.kontrolltoo1;
/*
karp ja vurrud joonisena
*/

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.imageio.ImageIO;

public class masiiv {
    public static void main(String[] arg) throws IOException{
    int[] a = {25, 14, -7, 15, 36, 56, 0, 18, 29, 49};
    int min = Arrays.stream(a).min().getAsInt();
    int max = Arrays.stream(a).max().getAsInt();
    System.out.println("Massiiv järjestatud kasvavas järjekorras: ");
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    System.out.println("Vähim: "+ min);
    System.out.println("Suurim: "+ max);
    
    int veerand = a[3];
    int pool = a[5];
    int kolmveerand = a[7];
    
    ArrayList <Integer> massiiv = new ArrayList<Integer>();
    massiiv.add(min);
    massiiv.add(veerand);
    massiiv.add(pool);
    massiiv.add(kolmveerand);
    massiiv.add(max);
    System.out.println("Massiiv min, 25%, 50%, 75%, max elementidega:\n"+ massiiv);
    
    BufferedImage bi=new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
         Graphics g=bi.createGraphics();
         g.setColor(Color.WHITE);
         g.fillRect(0, 0, 400, 300);
         g.setColor(Color.BLACK);
         g.drawLine(100+min*4, 170-min*3, 100+max*4, 170-max*3);
	 g.drawString("min",70+min*4, 150-min*3);
	 g.drawString("max",120+max*4, 20);
         
         g.setColor(Color.GREEN);
        g.drawLine(100+pool*3, 300, 100+pool*3, 100+pool/4);
		g.drawString("50%",150, 100+pool*3);
         g.setColor(Color.RED);
         g.drawRect(100+veerand*4, 170-kolmveerand*3, 90, 70);
         g.drawString("25% - 75%",90, 70);
         
         
         int len = a.length;
         for(int i = 0; i < len; i++){
             g.setColor(Color.BLUE);
             g.fillRect(100+a[i]*4,170-a[i]*3 ,5, 5);
         }
         
         ImageIO.write(bi, "png", new File("joonis.png"));
}
}
