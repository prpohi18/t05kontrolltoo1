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
        
        int arvud1=0;
        int arvud2=0;
        int i=0;
        int keskmine1=0;
        int keskmine2=0;
        while(rida!=null){
            String[] m=rida.split(",");
            int aasta1=Integer.parseInt(m[0]);
            int aasta2=Integer.parseInt(m[1]);
            g.setColor(Color.pink);
            g.fillRect(100/aasta1*5,100/aasta1*5, 5, 5);
            g.setColor(Color.green);
            g.fillRect(100/aasta2*5,100/aasta1*5, 5, 5);
            arvud1+=aasta1;
            arvud2+=aasta2;
            i++;
            rida=br.readLine();
        }
        //esimese aasta keskmine
        keskmine1=arvud1/i;
        g.setColor(Color.red);
        g.fillRect(100/keskmine1*3,100/keskmine1*3, 5, 5);
        
        //teise aasta keskmine
        keskmine2=arvud2/i;
        g.setColor(Color.orange);
        g.fillRect(100/keskmine2*3,100/keskmine2*3, 5, 5);
        
        g.setColor(Color.black);
        
        g.drawLine(10,0,10,300);
        g.drawLine(0,290,400,290);
        ImageIO.write(bi, "png", new File("loomad.png"));
    }
}  
