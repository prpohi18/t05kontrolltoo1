package kt;

import java.net.*;
import java.io.*;
import java.util.*;
import java.awt.image.*;
import java.awt.*;
import javax.imageio.*;

/* 1.Koosta funktsioon, mis järjestab massiivi ning leiab sealt vähima ja suurima väärtuse.
   2.Täienda funktsiooni nõnda, et etteantud massiivist väljastatakse massiivina järgmised väärtused: vähim, väärtuse millest 25% on väiksemad;
väärtuse millest 50% on väiksemad;väärtuse millest 75% on väiksemad; suurim.
   3.Koosta funktsioon töö tulemuse põhjal joonis, kus 50% juures on püstkriips, 25%st 75%ni ulatub ristkülik ning miinimumist maksimumini joon
*/

public class main {
    public static void main(String[] arg) throws Exception {
        //Loen andmed sisse
        String location = "http://www.tlu.ee/~daisyp/sisend.txt";
        BufferedReader br = new BufferedReader(new InputStreamReader(new URL(location).openStream()));
        String line = br.readLine();
        int[] data1 = new int[8];
        int index = 0;
        while (line != null) {
            data1[index] = Integer.parseInt(line);
            index++;
            line = br.readLine();
        }

        int[] data = {14,7,9,5,22,1,23,16};
        int[] functionPerc = percentage(data1);
        drawGraph(functionPerc);

    }

    public static void drawGraph(int[] data) throws Exception{
        int imgW = 500;
        int imgH = 500;
        int yp = 250;
        int xp = 50;
        int index = 0;
        BufferedImage bi = new BufferedImage(imgW, imgH, BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.createGraphics();
        g.setColor(Color.pink);
        g.fillRect(0, 0, 500, 500);
        g.setColor(Color.red);
        //Joonistan 50% püstkriips, 25%st 75%ni ristkülik, min/max joon
        for(int i : data) {
            if (index == 2) {
                int a = 0;
                while (a <= 5) {
                    g.drawString("|", xp-25,yp+(5*a));
                    g.drawString("|", xp-25,yp-(5*a));
                    g.drawString("|", xp+25, yp+(5*a));
                    g.drawString("|",xp+25, yp-(5*a));
                    a++;
                }
            }
            g.drawString(String.valueOf(i),xp,yp);
            xp = xp+100;
            index++;
        }
        g.drawRect(125,225, 250,50);
        g.drawLine(45,yp+5, 470,yp+5);
        g.setColor(Color.darkGray);
        g.drawString("min",20, yp+5);
        g.drawString("max", 475, yp+5);
        g.drawString("25% kuni 75%", 210, 210);
        g.drawString("50%", 240, 270);
        g.drawString("Protsentide väärtuste funktsioon", 165, 150);
        ImageIO.write(bi,"png",new File("percentage.png"));

    }

    public static int[] percentage(int[] data) {
        for (int i=0;i<=data.length-1;i++) {
            for (int j=0;j<=data.length-2;j++) {
                if (data[j] > data[j+1]) {
                    int a = 0;
                    a = data[j];
                    data[j] = data[j+1];
                    data[j+1] = a;
                }
            }
        }

        //Arvutan vajalikud väärtused
        int a = data.length;
        int position = (int) (Math.round(a * 0.25));
        int perc25 = data[position];
        position = (int) (Math.round(a * 0.5));
        int perc50 = data[position];
        position = (int) (Math.round(a * 0.75));
        int perc75 = data[position];
        int[] returnPerc = {data[0], perc25, perc50, perc75, data[data.length-1]};
        System.out.println("Massiivi vähim väärtus on " + data[0]);
        System.out.println("Massiivi suurim väärtus on " + data[data.length-1]);
        return returnPerc;
    }

}
