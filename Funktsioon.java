import java.util.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.*;
import java.awt.*;
import java.net.*;
import java.util.Arrays; 

public class Funktsioon{
	static int max;
	static int min;
	static int a;
	static int b;
	static int kolmas;
	static int viies;
	static int seitsmes;

	public static void maxMin(int myArray[]) {
		max = myArray[0];
		min = myArray[0];
		int len = myArray.length;
		for (int i = 1; i < len - 1; i = i + 2) {
			if (i + 1 > len) {
				if (myArray[i] > max) max = myArray[i];
				if (myArray[i] < min) min = myArray[i];
			}
			if (myArray[i] > myArray[i + 1]) {
				if (myArray[i] > max) max = myArray[i];
				if (myArray[i + 1] < min) min = myArray[i + 1];
			}
			if (myArray[i] < myArray[i + 1]) {
				if (myArray[i] < min) min = myArray[i];
				if (myArray[i + 1] > max) max = myArray[i + 1];
			}
		}
		
	}
	
	public static void bubbleSort(int myArray[]) {
		boolean swapped = true;
		int j = 0;
		int tmp;
		int array[];
		while (swapped) {
			swapped = false;
			j++;
			for (int i = 0; i < myArray.length - j; i++) {
				if (myArray[i] > myArray[i + 1]) {
					tmp = myArray[i];
					myArray[i] = myArray[i + 1];
					myArray[i + 1] = tmp;
					swapped = true;
				}
			}
		}
		kolmas = myArray[3];
		viies = myArray[5];
		seitsmes = myArray[7];

	}

	public static void main(String[] args) throws Exception {
		int[] myArray = {25, 14, -7, 15, 36, 56, 0, 18, 29, 49};
		int[] newArray = new int[10];
		maxMin(myArray);
		
		BufferedImage bi=new BufferedImage(400,300, BufferedImage.TYPE_INT_RGB);
        Graphics g=bi.createGraphics();
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, 400, 300);
		g.setColor(Color.BLACK);
		g.setColor(Color.BLUE);
        g.drawLine(100+min*4, 170-min*3, 100+max*4, 170-max*3);
		g.drawString("min",70+min*4, 150-min*3);
		g.drawString("max",120+max*4, 20);
		
		int len = myArray.length;
		for (int i = 0; i < len; i++) {
			g.setColor(Color.RED);
			g.fillRect(100+myArray[i]*4,170-myArray[i]*3 ,5, 5);
		}
		
		System.out.println(" Massiiv: "+Arrays.toString(myArray));
		System.out.println(" Massiivi maksimaalne väärtus on " + max);
		System.out.println(" Massiivi minimaalne väärtud on " + min);
		
		bubbleSort(myArray);
		System.out.println(" Väärtus massiivist, millest 25% väärtustest on väiksemad on " + kolmas);
		System.out.println(" Väärtus massiivist, millest 75% väärtustest on väiksemad on " + seitsmes);
		System.out.println(" Väärtus massiivist, millest 50% väärtustest on väiksemad on " + viies);

		g.setColor(Color.GREEN);
        g.drawLine(100+viies*3, 300, 100+viies*3, 100+viies/4);
		g.drawString("50%",150, 100+viies*3);
		g.setColor(Color.PINK);
		g.drawRect(100+kolmas*4, 170-seitsmes*3, 90, 70);
		g.drawString("25% - 75%",90, 70);
		
		ImageIO.write(bi, "png", new File("tulemus.png"));
		
	}
	

}
