import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Kolmas {
    public static void main(String[] args) throws Exception{
      BufferedReader br=new BufferedReader(new FileReader("sisend.txt"));
      String rida=br.readLine();
      List<Integer> arvud=new ArrayList<>();
      int keskmine1 = 0;
      int keskmine2 = 0;
      int keskmine3 = 0;
      int keskmine4 = 0;
      while(rida!=null){
        String[] tykid=rida.split(" ");
        arvud.add(Integer.parseInt(tykid[0]));
        rida=br.readLine();
        }
      br.close();
      
      System.out.println(arvud);
      keskmine1 = (arvud.get(0)+arvud.get(1)+arvud.get(2))/3;
      keskmine2 = (arvud.get(1)+arvud.get(2)+arvud.get(3))/3;
      keskmine3 = (arvud.get(2)+arvud.get(3)+arvud.get(4))/3;
      keskmine4 = (arvud.get(3)+arvud.get(4)+arvud.get(5))/3;
      PrintWriter pw=new PrintWriter(new FileWriter("fail.txt"));
       pw.println(keskmine1);
       pw.println(keskmine2);
       pw.println(keskmine3);
       pw.println(keskmine4);
       pw.close();
   } 

}
