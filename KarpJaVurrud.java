import java.io.*;
import java.util.*;
import java.lang.*;
public class KarpJaVurrud{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("andmed.txt"));
        List<Integer> andmed = new ArrayList<Integer>();
        String rida=br.readLine();
 /*           
 
                while(rida != null) {
                andmed.add(rida);
                rida=br.readLine();

 }*/

        while(rida!=null){
            andmed.add(Integer.parseInt(rida));
            rida=br.readLine();
        }
        int[] stat = statistika(andmed);
        joonistus(stat);

    }
    public static int[] statistika(List<Integer> andmed){
        int[] stat = new int[5]; 

        Collections.sort(andmed);
        System.out.println(andmed);
        stat[0] = andmed.get(0);
        stat[1] = andmed.get((int)(andmed.size()/4));
        stat[2] = andmed.get((int)(andmed.size()/2));
        stat[3] = andmed.get((int)(andmed.size()*3/4));
        stat[4] = andmed.get(andmed.size()-1);


        System.out.println(Arrays.toString(stat));
        return stat;
    }

    public static void joonistus(int[] stat){
    try{
            PrintWriter pw = new PrintWriter(new FileWriter("Statistika.txt", false));

            /*--------------------Algamas on esimene vaatus-----------------------*/

            for(int i = 1; i < stat[1]; i++) pw.print(" "); pw.print("+");
            for(int i = stat[1] + 1; i < stat[2]; i++) pw.print("-"); pw.print("+");
            for(int i = stat[2] + 1; i < stat[3]; i++) pw.print("-"); pw.println("+");
            
            /*--------------------Algamas on eelviimane vaatus-----------------------*/
            
            for(int i = 1; i < stat[0]; i++) pw.print(" ");
            for(int i = stat[0]; i < stat[1]; i++) pw.print("-"); pw.print("|");
            for(int i = stat[1] + 1; i < stat[2]; i++) pw.print(" "); pw.print("|");
            for(int i = stat[2] + 1; i < stat[3]; i++) pw.print(" "); pw.print("|");
            for(int i = stat[3] + 1; i < stat[4]; i++) pw.print("-"); pw.println();
            

            /*--------------------Algamas on viimane vaatus-----------------------*/

            for(int i = 1; i < stat[1]; i++) pw.print(" "); pw.print("+");
            for(int i = stat[1] + 1; i < stat[2]; i++) pw.print("-"); pw.print("+");
            for(int i = stat[2] + 1; i < stat[3]; i++) pw.print("-"); pw.println("+");
            pw.close();

        } catch(Exception ex){
            System.out.println(ex);
        }
    }
}
