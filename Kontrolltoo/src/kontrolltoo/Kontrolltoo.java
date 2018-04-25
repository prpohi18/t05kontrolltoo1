package kontrolltoo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Kontrolltoo {
    
    public static double ruutjuur(double arv1, double arv2) {
        double korrutis = arv1 * arv2;
        return Math.round(Math.sqrt(korrutis));
    }
    
    public static double geo_kesk(int[] arvud) {
        int korrutis = 1;
        int kogus = 0;
        if (arvud.length == 1) {
            return Math.sqrt(arvud[0]);
        } else {
            for (int arv: arvud) {
                korrutis = korrutis * arv;
                kogus++;
            }
        }
        return Math.pow(korrutis, 1.0 / kogus);
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int[] arvud = {3, 5, 2};
        int x = 5;
        int y = 20;
        
        System.out.println("Ruutjuur on " + ruutjuur(x, y));
        System.out.println("Geomeetriline keskmine on " + geo_kesk(arvud));
        
        List<String> koefitsiendid;
        double palk;
        try (BufferedReader br = new BufferedReader(new FileReader("andmed.txt"))) {
            koefitsiendid = new ArrayList<>();
            String FailiPalk = br.readLine();
            palk = Double.parseDouble(FailiPalk);
            String rida = br.readLine();
            while (rida != null) {
                koefitsiendid.add(rida);
                rida = br.readLine();
            }
        }
        
        double yhtlaneKoefPalk = palk;
        double yhtlaneKoef = Double.parseDouble(koefitsiendid.get(0));
        double[] uuedPalgad = new double [koefitsiendid.size()];
        double[] yhtlaneKoefPalgad = new double[5];
        
        for (int i = 0; i < koefitsiendid.size(); i++) {
            uuedPalgad[i] = Double.parseDouble(koefitsiendid.get(i)) * palk;
            palk = uuedPalgad[i];
            yhtlaneKoefPalgad[i] = yhtlaneKoef * yhtlaneKoefPalk;
            yhtlaneKoefPalk = yhtlaneKoefPalgad[i];
        }

        PrintWriter pw = new PrintWriter(new FileWriter("palgad.txt"));
        
        for (int i = 0; i < uuedPalgad.length; i++) {
            pw.printf("%d ___ %d", (int) uuedPalgad[i], (int) yhtlaneKoefPalgad[i]);
            pw.println();
        }
        pw.close();
    } 
}
