import java.util.*;
import java.io.*;
import java.net.*;

public class arvestus{

  public static void main(String[] arg) throws Exception{
    String address="http://greeny.cs.tlu.ee/~kogejaro/prpohi/t05kontrolltoo1/kiirused.txt";
    BufferedReader br=new BufferedReader(new InputStreamReader(new URL(address).openStream()));
        String rida=br.readLine();
        int sum=0;
        int count =0;
        int keskkiirus = 0;


        while(rida!=null){
            //System.out.println(rida);
            String[] m = rida.split(" ");
            int loigukiirus = Integer.parseInt(m[0]);
              if(loigukiirus >= 0){
                  System.out.println(loigukiirus + "km/h");
                  sum = sum + loigukiirus;

                  count++;

              }else{
                    System.out.println("Kiirus ei saa olla negatiivne!");
              }

            rida=br.readLine();

        }
        keskkiirus = sum / count;
    //  System.out.println(sum);
  //    System.out.println(count);
    //  System.out.println(keskkiirus);

      System.out.println("Keskmine kiirus on  " + keskkiirus + "km/h");
      teekeskmine a  = new teekeskmine(keskkiirus);
      System.out.println(a.looKiirusFail());
      System.out.println(a.kiirusKeskKontroll());
      System.out.println(a.loeKiirus());
  }
}
