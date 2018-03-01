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
        int arvudeSumma1=1;
        double vastus=0;
        double vastus2=0;
        BufferedReader br=new BufferedReader(new FileReader("sisend.txt"));
        String rida=br.readLine();
        while (rida!=null){
            
            String[] m=rida.split(",");
            System.out.println(rida);
            i++;
            arvudeSumma1*=Integer.parseInt(m[1]);//teine aasta
            arvudeSumma*=Integer.parseInt(m[0]);//esimene aasta
            
            rida=br.readLine();            
        }
        vastus=(double) Math.pow(arvudeSumma,(1.0/i));
        vastus2=(double) Math.pow(arvudeSumma1,(1.0/i));
        
        br.close();
        System.out.println("Juure arv: "+i);
        System.out.println("Esimese aasta Arvude summa on: "+arvudeSumma);
        System.out.println("Teise aasta Arvude summa on: "+arvudeSumma1);
        System.out.println("Esimese aasta Teine vastus on: "+vastus);
        System.out.println("Teise aasta Teine vastus on: "+vastus2);
        
    }
}
/*
Ruutjuur on:7.483314773547883
5,7
6,8
7,9
15,17
8,10
10,12
9,11
4,6
17,19
11,13
Juure arv: 10
Esimese aasta Arvude summa on: 1696464000
Teise aasta Arvude summa on: -418804864
Esimese aasta Teine vastus on: 8.374414729131573
Teise aasta Teine vastus on: NaN
*/