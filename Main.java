import java.net.*;
import java.io.*;
import java.util.*;
import java.awt.image.*;
import java.awt.*;
import javax.imageio.*;

public class Main{
	public static void main(String[] arg) throws Exception {
		//loen sisse andmed
		String location = "http://www.tlu.ee/~mkivikin/sisend.txt";
		int[] data1 = new int [8];
		int index = 0;
		String fileName = "valjund.txt";
		BufferedReader bi = new BufferedReader(new InputStreamReader(new URL(location).openStream()));
		String rida = bi.readLine();
		while (rida != null) {
			data1[index] = Integer.parseInt(rida);
			index++;
			rida = bi.readLine();
		}
		
		int[] data = {1, 7, 9, 3, 6, 11, 23, 16};
		int[] functionData = quickMaths(data1);
		/*for (int i: functionData){
			System.out.println(i);
		}*/
		drawGraph(functionData);
		
		if(!(new File(fileName).exists())) {
			try{
				index = 0;
				int charLen = 0;
				PrintWriter pw = new PrintWriter (new FileWriter(fileName));
				for (int i: functionData){
					if (index == 2) {
						pw.print("| "); 
						charLen = charLen+2;
					}
					pw.print(functionData[index] + " ");
					if (index == 2) {
						pw.print("| "); 
						charLen = charLen + 2;
					}
					charLen = charLen+2;
					index++;
				}
				pw.println();
				index = 0;
				while(index < charLen-1){
					pw.print("-");
					index++;
				}
				pw.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
	}

}
	
	public static void drawGraph(int[] data) throws Exception{
		int imgWidth = 500;
		int imgHeight = 500;
		BufferedImage bi = new BufferedImage(imgWidth, imgHeight, BufferedImage.TYPE_INT_RGB);
		Graphics g = bi.createGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 500, 500);
		g.setColor(Color.BLUE);
		int ypos = 250;
		int xpos = 50;
		int index = 0;
		for(int i : data) {
			if (index == 2) {
				int temp = 0;
				while(temp <= 5) {
					g.drawString("|", xpos-25, ypos+(5*temp));
					g.drawString("|", xpos-25, ypos-(5*temp));
					g.drawString("|", xpos+25, ypos+(5*temp));
					g.drawString("|", xpos+25, ypos-(5*temp));
					temp++;
				}
			}
			g.drawString(String.valueOf(i), xpos, ypos);
			xpos = xpos+100;
			index++;
		}
		g.drawRect(125, 225, 275, 50);
		g.drawLine(50, ypos+5, 460, ypos+5);
		ImageIO.write(bi, "png", new File("keskmised.png"));
	}
	
	public static int[] quickMaths(int[] data) {
		for(int i=0;i<=data.length-1;i++){
			for(int j=0;j<=data.length-2;j++){
				if(data[j] > data[j+1]) {
					int temp = 0;
					temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		/*if (tehe == "min"){
			return data[0];
		}
		if (tehe == "max"){
			return data[data.length-1];
		} else {
			System.out.println("Vigane sisestus");
			return 0;
		}*/
		int temp = data.length;
		int position = (int) (Math.round(temp * 0.25));
		int data25 = data[position];
		position = (int) (Math.round(temp * 0.5));
		int data50 = data[position];
		position = (int) (Math.round(temp * 0.75));
		int data75 = data[position];
		int[] returnData = {data[0], data25, data50, data75, data[data.length-1]};
		return returnData;
	}
}