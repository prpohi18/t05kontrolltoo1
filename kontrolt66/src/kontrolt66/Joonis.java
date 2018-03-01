package kontrolt66;
import java.awt.image.*;
import javax.imageio.*;
import java.awt.*;
import java.net.*;
import java.io.*;
public class Joonis {
    public static void main(String[] arg) throws Exception{
        BufferedImage bi=new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
        Graphics g=bi.createGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 400, 300);
        BufferedReader br=new BufferedReader(new FileReader("sisend.txt"));
        String rida=br.readLine();
        rida=br.readLine();
        
        int arvud=0;
        int i=0;
        int keskmine=0;
        
        while(rida!=null){
            String[] m=rida.split(",");
            g.setColor(Color.pink);
            g.fillRect(100/Integer.parseInt(m[0])*5,100/Integer.parseInt(m[0])*5, 5, 5);
            arvud+=Integer.parseInt(m[0]);
            i++;
            rida=br.readLine();
            g.setColor(Color.black);
            g.fillRect(100/Integer.parseInt(m[1])*5,100/Integer.parseInt(m[1])*5, 5, 5);
        }
        keskmine=arvud/i;
        g.setColor(Color.red);
        g.fillRect(100/keskmine*3,100/keskmine*3, 5, 5);
        
        g.setColor(Color.black);
        
        g.drawLine(10,0,10,300);
        g.drawLine(0,290,400,290);
        ImageIO.write(bi, "png", new File("loomad.png"));
    }
}  
