
package ee.tlu.sergei.kt1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KroonoloogilineKeskmine {

    /*public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int c = 3;
    System.out.println(KronKesk(a, b, c));
    // output: 2.0
    
    double[] b = {1,2,3,4,5,6,7};
    System.out.println(KronKesk2(b));
    //output: 4.0
    }*/
    
    
    public static double KronKesk(double a, double b, double c){
        return (a/2+b+c/2)/2;
        
    } 
    
    
     public static double KronKesk2(double[] b){
        int jag = 0;
        double sum = 0;
        for (int i = 0; i < b.length; i++) {
            jag++;
        }
        jag = jag - 1;
        sum = ArraySum(b) - b[0] - b[b.length-1];
        return (b[0]/2 + sum +b[b.length-1]/2)/jag;
     }
     
     
    public static double ArraySum(double[] a){
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum+a[i];   
        }
        return sum;
    }

    public static void main(String[] args) {
        try{
            String filePath = "C:\\Users\\user\\Desktop\\TLU\\Semester 2\\ProgPohikursus\\temp";
            BufferedReader br = new BufferedReader(new FileReader(filePath  + ".txt"));
            String rida;
            
            List<Andmed> andmed = new ArrayList<>();
            int ridaCount = 0;
            while((rida = br.readLine()) != null){
                String[] temp = rida.split(",");
                Andmed andmed0 = new Andmed();
                andmed0.setKuupaev(Double.valueOf(temp[0]));
                andmed0.setTemp0(Double.valueOf(temp[1]));
                andmed0.setTemp6(Double.valueOf(temp[2]));
                andmed0.setTemp12(Double.valueOf(temp[3]));
                andmed0.setTemp18(Double.valueOf(temp[4]));
                andmed0.setTemp24(Double.valueOf(temp[5]));
                
                andmed.add(andmed0);
                ridaCount++;
                
            }
            
            br.close();
            File fout = new File(filePath + "_avgtemp"  + ".txt");
            FileOutputStream fos = new FileOutputStream(fout);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            Andmed andmed0 = new Andmed();
            
            for (int i = 0; i < ridaCount; i++) {
                
                double[] andmed1 = {andmed0.getTemp0(), andmed0.getTemp12(), andmed0.getTemp18(), andmed0.getTemp24()};
                double[] andmedFaili = {andmed0.getKuupaev(), KronKesk2(andmed1)};
                bw.write(Arrays.toString(andmedFaili) + "\n");
            }
            bw.close();
            
        } catch(Exception ex){
            ex.printStackTrace();
        }
    
    }



    
}
