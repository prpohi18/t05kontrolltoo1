package kontrolltoo1;

import java.util.*;
import java.io.*;

public class Kontrolltoo1 {

    public static void main(String[] args) throws Exception {
        Autod autodPaar1 = new Autod(0.0, 45.0, 0.0, 50.0);
        Autod autodPaar2 = new Autod(100.0, 60.0, 150.0, 40.0);

        ArrayList<Autod> autoPaarid = new ArrayList<Autod>();
        autoPaarid.add(autodPaar1);
        autoPaarid.add(autodPaar2);

        for (Autod autoPaar : autoPaarid) {
            System.out.println("Auto kiirus on: " + autoPaar.getAuto1Kiirus() + " km/h ja kaugus maantee algusest on: " + autoPaar.getAuto1Kaugus() + " km");
            System.out.println("Auto kiirus on: " + autoPaar.getAuto2Kiirus() + " km/h ja kaugus maantee algusest on: " + autoPaar.getAuto2Kaugus() + " km");
        }

        //3 sekundit = 0.000833333 tundi
        autodPaar1.uuendaKaugus(0.000833333);

        //5 minutit = 0.0833333 tundi
        autodPaar1.uuendaKaugus(0.0833333);

        //2 tundi
        autodPaar1.uuendaKaugus(2.0);

        //Proovin kolmandat punkti teha
        System.out.println();
        System.out.println("KOLMANDA PUNKTI VÄLJUNDID");
        System.out.println();
        BufferedReader br = new BufferedReader(new FileReader("sisend1.txt"));
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
        PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
        for (Autod autoPaar : autod) {
            pw.println("Auto paar: "+i);
            br = new BufferedReader(new FileReader("ajad.txt"));
            rida = br.readLine();
            while (rida != null) {
                String[] tykid = rida.split(" ");
                autoPaar.uuendaKaugus(Double.parseDouble(tykid[0]));
                
                pw.println("Esimese auto uus kaugus on: " + autoPaar.getAuto1Kaugus() + " km ja teise auto uus kaugus on: " + autoPaar.getAuto2Kaugus() + " km");
                rida = br.readLine();
            }
            i++;
        }
        pw.close();
        br.close();
    }

}
