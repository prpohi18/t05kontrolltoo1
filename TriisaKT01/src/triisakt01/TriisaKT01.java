/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triisakt01;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import static java.lang.Math.abs;
import java.util.Arrays;
import javax.imageio.ImageIO;

public class TriisaKT01 {
    
    private static int min;
    private static int max;
    private static int quarter;
    private static int half;
    private static int threeQuarter;
    private static int absSumValue;
    
    
    public static int[] sorteerimine(int[] massiiv){
        int[] massiivSorted = massiiv;
        Arrays.sort(massiivSorted);
        min = Arrays.stream(massiiv).min().getAsInt();
        max = Arrays.stream(massiiv).max().getAsInt();
        int arrayLength = massiiv.length;
        int indexQuarter = (int)(arrayLength * 0.25);
        int indexHalf = (int)(arrayLength * 0.50);
        int indexThreeQuarter = (int)(arrayLength * 0.75);
        quarter = massiivSorted[indexQuarter];
        half = massiivSorted[indexHalf];
        threeQuarter = massiivSorted[indexThreeQuarter];
        absSumValue = abs(min)+max;    

        

        
        return massiivSorted;
    }
    
    public static void main(String[] args) throws Exception {
        int[] massiiv = {103, 0, 28, 13, -52, 78, -24, 140};
        /*int[] massiiv = new int[100];
        for (int x = 0; x < 100; x++) {
            massiiv[x] = x+1;
        }*/
        int[] massiivSorted = sorteerimine(massiiv);
        System.out.println("Massiivi väikseim: "+ min);
        System.out.println("Massiivi suurim: "+ max);
        System.out.println("Sorteeritud massiiv: "+ Arrays.toString(massiivSorted));
        System.out.println("Massiivi number millest 25% on väiksemad: "+ quarter);
        System.out.println("Massiivi number millest 50% on väiksemad: "+ half);
        System.out.println("Massiivi number millest 75% on väiksemad: "+ threeQuarter);
        
        BufferedImage bi = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.createGraphics();
        g.setColor(Color.darkGray);
        g.fillRect(0, 0, 800, 600);
        int verticalStep = 400 / massiiv.length;
        int horizontalStep = 700 / absSumValue;
        for (int i = 0; i < massiiv.length; i++) {
            g.setColor(Color.pink);
            g.fillOval(((int)(((massiivSorted[i]+abs(min))/(float)(absSumValue))*100))*horizontalStep+50-5, 500-5-(verticalStep * i), 10, 10);
            g.drawString(String.valueOf(massiivSorted[i]),((int)(((massiivSorted[i]+abs(min))/(float)(absSumValue))*100))*horizontalStep+50+5, 500+5-(verticalStep * i));
        }       
        g.setColor(Color.red);
        g.fillOval(((int)(((max+abs(min))/(float)(absSumValue))*100))*horizontalStep+50-5, 500-5-(verticalStep * (massiiv.length-1)), 10, 10);
        g.drawString("max",((int)(((max+abs(min))/(float)(absSumValue))*100))*horizontalStep+50-5, 500-5-(verticalStep * (massiiv.length-1)));
        
        g.setColor(Color.blue);
        g.fillOval(((int)(((min+abs(min))/(float)(absSumValue))*100))*horizontalStep+50-5, 500-5, 10, 10);
        g.drawString("min", ((int)(((min+abs(min))/(float)(absSumValue))*100))*horizontalStep+50-5, 500-5);
        
        g.setColor(Color.green);
        g.drawLine(((int)(((min+abs(min))/(float)(absSumValue))*100))*horizontalStep+50, 500, ((int)(((max+abs(min))/(float)(absSumValue))*100))*horizontalStep+50, 500-(verticalStep * (massiiv.length-1)));
        
        g.setColor(Color.yellow);
        g.drawLine((((int)(((half+abs(min))/(float)(absSumValue))*100))*horizontalStep+50), 0, (((int)(((half+abs(min))/(float)(absSumValue))*100))*horizontalStep+50), 600);
        g.drawString("50%",(((int)(((half+abs(min))/(float)(absSumValue))*100))*horizontalStep+50), (int)(500-5-(verticalStep * (massiiv.length*0.5))));
        
        g.setColor(Color.cyan);
        g.drawRect((((int)(((quarter+abs(min))/(float)(absSumValue))*100))*horizontalStep+50), (int)(500-5-(verticalStep * (massiiv.length*0.75)))+5, (((int)(((threeQuarter+abs(min))/(float)(absSumValue))*100))-((int)(((quarter+abs(min))/(float)(absSumValue))*100))) * horizontalStep, (int)((massiiv.length*0.75)-(massiiv.length*0.25)) * verticalStep);
        g.drawString("25%",(((int)(((quarter+abs(min))/(float)(absSumValue))*100))*horizontalStep+50), (int)(500-5-(verticalStep * (massiiv.length*0.25))));
        g.drawString("75%",(((int)(((threeQuarter+abs(min))/(float)(absSumValue))*100))*horizontalStep+50), (int)(500-5-(verticalStep * (massiiv.length*0.75))));
        
        ImageIO.write(bi, "png", new File("KTPic.png"));
    }
    
}
