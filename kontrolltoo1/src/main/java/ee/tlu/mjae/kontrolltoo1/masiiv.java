package ee.tlu.mjae.kontrolltoo1;

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
    int[] a = {81, 23, 45, 12, 34, 98, 72, 123, -7, 0};
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
         g.drawLine(100+min*2, 270-min*2, 100+max*2, 270-max*2);
         g.drawString("Min", 70+min*2, 240-min*2);
         g.drawString("Max", 70+max*2, 260-max*2);
         int len = a.length;
         for(int i = 0; i < len; i++){
             g.setColor(Color.BLUE);
             g.fillRect(100+a[i]*2,267-a[i]*2 ,5, 5);
         }
         
         ImageIO.write(bi, "png", new File("joonis.png"));
}
}

