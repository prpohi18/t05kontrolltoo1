




package ee.tlu.piibor12.kontrolltoo1;
import java.io.*;
import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Kolmas {
    public static void main(String[] args) throws Exception{
      BufferedReader br=new BufferedReader(new FileReader("D:\\arvud.txt"));
      String rida=br.readLine();
      List<Integer> arvud=new ArrayList<Integer>();
        float keskmine1=0;
        float keskmine2=0;
        float keskmine3=0;
        float keskmine4=0;
        float summa=0;
        float vahe_summa1=0;
        float vahe_summa2=0;
        float vahe_summa3=0;
        float vahe_summa4=0;
        int loendur=0;
      while(rida!=null){
        System.out.println(rida);
        String[] tykid=rida.split(" ");
        arvud.add(Integer.parseInt(tykid[0]));    
            

        rida=br.readLine();
            
        
      }
      
      br.close();

      vahe_summa1 = arvud.get(0) + arvud.get(1) + arvud.get(2);
      keskmine1=vahe_summa1/3;
      vahe_summa2 = arvud.get(1) + arvud.get(2) + arvud.get(3);
      keskmine2=vahe_summa2/3;
      vahe_summa3 = arvud.get(2) + arvud.get(3) + arvud.get(4);
      keskmine3=vahe_summa3/3;
      vahe_summa4 = arvud.get(3) + arvud.get(4) + arvud.get(5);
      keskmine4=vahe_summa4/3;
      System.out.println("1. libisev keskmine: "+keskmine1);
      System.out.println("2. libisev keskmine: "+keskmine2);
      System.out.println("3. libisev keskmine: "+keskmine3);
      System.out.println("4. libisev keskmine: "+keskmine4);
      PrintWriter pw=new PrintWriter(new FileWriter("failike.txt"));
      pw.println("1. libisev keskmine: "+keskmine1);
      pw.println("2. libisev keskmine: "+keskmine2);
      pw.println("3. libisev keskmine: "+keskmine3);
      pw.println("4. libisev keskmine: "+keskmine4);
      pw.close();
   }    
    
}
