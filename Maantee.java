
package kontrolltöö1;


import java.util.*;
import java.io.*;

public class Maantee {

    public static void main(String[] args) throws Exception {
        Autod autodYks = new Autod(10.0, 45.0, 20.0, 50.0);
        Autod autodKaks = new Autod(100.0, 60.0, 150.0, 40.0);

        ArrayList<Autod> autoPaarid = new ArrayList<Autod>();
        autoPaarid.add(autodYks);
        autoPaarid.add(autodKaks);

       for (Autod autoPaar : autoPaarid) {
            System.out.println("Auto kiirus on: " + autoPaar.getAutoEKiirus() + " km/h ja kaugus algusest on: " + autoPaar.getAutoEKaugus() + " km");
            System.out.println("Auto kiirus on: " + autoPaar.getAutoTKiirus() + " km/h ja kaugus algusest on: " + autoPaar.getAutoTKaugus() + " km");
        }

        /*3sek*/
        autodYks.uuedKaugused(0.000833333);

        /*5min*/
        autodYks.uuedKaugused(0.0833333);

        /*2h*/
        autodYks.uuedKaugused(2.0);


        System.out.println();
        BufferedReader br = new BufferedReader(new FileReader("sisend.txt"));
        String rida = br.readLine();
        List<Autod> autod = new ArrayList<Autod>();
        while (rida != null) {
            String[] tykid = rida.split(" ");
            autod.add(new Autod(Double.parseDouble(tykid[0]),
                    Double.parseDouble(tykid[1]), Double.parseDouble(tykid[2]), Double.parseDouble(tykid[3])));
            rida = br.readLine();
        }
        br.close();
        //System.out.println(autod);
        int i = 1;
        PrintWriter pw = new PrintWriter(new FileWriter("valjund.txt"));
        for (Autod autoPaar : autod) {
            pw.println("Autod: "+i);
            br = new BufferedReader(new FileReader("aeg.txt"));
            rida = br.readLine();
            while (rida != null) {
                String[] tykid = rida.split(" ");
                autoPaar.uuedKaugused(Double.parseDouble(tykid[0]));
                
                pw.println("Esimese auto uus kaugus on: " + autoPaar.getAutoEKaugus() + " km ja teise auto uus kaugus on: " + autoPaar.getAutoTKaugus() + " km");
                rida = br.readLine();
            }
            i++;
        }
        pw.close();
        br.close();
    }

}