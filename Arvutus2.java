import java.awt.image.*;
import javax.imageio.*;
import java.awt.*;
import java.net.*;
import java.io.*;
public class Arvutus2{
    protected int[][] a;
    protected BufferedImage bi=new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
    protected Graphics g=bi.createGraphics();
    public Arvutus2(int[][] andmed){
        a=andmed;
    }
    public double ymberm66t(){
        double[] loik= new double[3];
        for(int i = 0; i < 3; i++){
            if(i==2){
                loik[i] =Math.sqrt(((a[0][0]-a[0][i])*(a[0][0]-a[0][i])) 
                + ((a[1][0]-a[1][i])*(a[1][0]-a[1][i])));
                break;
            }
            loik[i] =Math.sqrt(((a[0][i+1]-a[0][i])*(a[0][i+1]-a[0][i])) 
            + ((a[1][i+1]-a[1][i])*(a[1][i+1]-a[1][i])));

        }
        double ymberm66t= loik[0]+loik[1]+loik[2];
        return ymberm66t;
    }
    public void joonistaTeljestik() throws Exception{
        g.setColor(Color.BLACK);
        g.drawLine(2, 25, 2, 298);
        g.drawLine(2, 298, 375, 298);
        g.drawString("Y", 2, 10);
        g.drawString("X", 390, 298);
        int h = 5;
        for(int x = 0; x <  380;x+=10){
            g.drawLine(2+x, 290, 2+x, 300);
        }
        for(int y = 27; y < 295; y+=10){
            g.drawLine(0, 2+y, 10, 2+y);
        }

    }
    public void kuvamine() throws Exception{

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 400, 300);
        g.setColor(Color.red);
        g.drawLine(a[0][0], a[1][0], a[0][1], a[1][1]);
        g.drawLine(a[0][1], a[1][1], a[0][2], a[1][2]);
        g.drawLine(a[0][2], a[1][2], a[0][0], a[1][0]);
        joonistaTeljestik();
        /*for(int i = 0; i < 3; i++){
            g.fillRect(a[0][i]*3, a[1][i]*3, 5, 5);
        }*/
        
        ImageIO.write(bi, "png", new File("hulknurk.png"));
        //return true;
    }

}