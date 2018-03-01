package kontrolt66;
import java.io.*;
import java.util.*;

public class Kontrolt66 {
    public static void main(String[] args)throws Exception{
        //Esimene osa
        main arv=new main(7,8);
        
        System.out.println("Ruutjuur on:"+arv.Ruutjuur());
        
        //teine osa
        int i=0;
        int arvudeSumma=1;
        int vastus=0;
         BufferedReader br=new BufferedReader(new FileReader("sisend.txt"));
        String rida=br.readLine();
        while (rida!=null){
            String[] m=rida.split(",");
            System.out.println(rida);
            rida=br.readLine();
            i++;
            arvudeSumma*=Integer.parseInt(m[0]);            
        }
        vastus=(int) Math.pow(arvudeSumma,(1.0/i));
        br.close();
        System.out.println("Juure arv: "+i);
        System.out.println("Arvude summa on: "+arvudeSumma);
        System.out.println("Teine vastus on: "+vastus);
    }
}
/*
Ruutjuur on:7.483314773547883
5
6
7
7
8
9
9
4
2
Juure arv: 9
Arvude summa on: 7620480
Teine vastus on: 5 (Vastus on ligikaudu õige. tegelik astus peaks olema:    5.8165397858573883 
*/