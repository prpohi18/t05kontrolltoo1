/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmoonilinekeskmine;
import java.net.*;
import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;



/**
 *
 * @author Robert Shevchenko 
 */
public class HarmoonilineKeskmine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int a = 67;//keskmine arvestades aega
        int b = 58;
        float test = average (a,b);
        System.out.println("Esimese kilomeetri kiirus "+a);
        System.out.println("Teise kilomeetri kiirus "+b);
        System.out.println("Kahe kilomeetri keskmine kiirus on "+test);
        int[] A = numbers();//here must be returned array from reader
        try{
            String aadress="http://www.tlu.ee/~jaagup/andmed/muu/ounad/antoonovka2.txt";//http://greeny.cs.tlu.ee/~sevtrobe/javaKT/keskminekiirus.txt lin2?
            BufferedReader br=new BufferedReader(new InputStreamReader(
               new URL(aadress).openStream()
            ));
            String line=br.readLine();
            System.out.println("Tulbad: " + line);
            line=br.readLine();
            double[] sums=new double[line.split(",").length];
            while(line!=null){
               String[] m=line.split(",");
               for(int i=0; i<m.length; i++){
                  sums[i]+=Double.parseDouble(m[i]);
               }
               line=br.readLine();
            }
            br.close();
            System.out.println("pikkused: "+sums[0]);
            System.out.println("ajad: "+sums[1]);
            float avgSpeed = (float)(sums[0]/sums[1]);
            System.out.println("keskmine kiirus loetud veebilingist on " + avgSpeed);
            boolean saved = saveResult(avgSpeed);
            if (saved = true){
                System.out.println("Fail salvestatud.");
            }else {
                System.out.println("Fail salvestamata");//harmoonilised kiiruse kiirused ja ajad 
            }
            
      }catch(Exception ex){
         System.out.println("Probleem: "+ex);
         ex.printStackTrace();
      }
        
    }
    //return avergae speed 
    public static float average(int a, int b) {
        float averageSpeed = (a+b)/2;
        return averageSpeed;
    }

    public static int[] numbers(){
        int[] A ={90,56,34,46,6,57,76,56,54,34,54,89};
        return A;
    }
    
    //return average speed from array of speeds
    public static boolean saveResult(float sum){
        try {
            File file = new File("JavaTestFile.txt");
            file.createNewFile();
            if(!file.exists())
                file.createNewFile();
            PrintWriter pw = new PrintWriter(file);
            pw.println("Keskmine kiirus on " + sum);
            pw.close();
            
        } catch(IOException e) {
            System.out.print("Error: " + e);
            return false;
        }
        return true;
    
    }
}
