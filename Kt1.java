import java.lang.*;
import java.io.*;
import java.util.*;

public class Kt1{
    public static void main(String[] args) throws Exception{
        int arv1 = 5;
        int arv2 = 8;
        ruutjuur(arv1, arv2);
        int[] arvud = {5, 8, 4, 6, 9, 2};
        ruutjuur2(arvud);
        fail();
    }

    public static void ruutjuur(int arv1, int arv2){
        int korrutis = arv1 * arv2;
        double juur = Math.sqrt(korrutis);
        System.out.println("Arv1 on: " + arv1);
        System.out.println("Arv2 on: " + arv2);
        System.out.println("Korrutis on: " + korrutis);
        System.out.println("Ruutjuur on: " + juur);
    }
    public static void ruutjuur2(int[] arvud){
        int korrutis = 1;
        for (int i=0; i < arvud.length; i++){
            korrutis = korrutis * arvud[i];
        }
        double pikkus = arvud.length;
        double test = Math.pow(korrutis, 1.0 / pikkus);
        System.out.println("\nKorrutis on: " + korrutis);
        System.out.println("Test on: " + test + "\n");
    }

    public static void fail() throws Exception{
        String fileName = "palk.txt";
        int i = 0;
        double algPalk = 0;
        List<Double> koefid = new ArrayList<>(Arrays.asList());

        try{
            FileReader fileReader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fileReader);
            String rida = br.readLine();

            while(rida != null) {
                if (i==0){
                    algPalk = Double.parseDouble(rida);
                }
                if (i > 0){
                    koefid.add(Double.parseDouble(rida));
                }
                rida = br.readLine();
                i++;
            }

            br.close();
            System.out.println(koefid);
            System.out.println(algPalk);
        } catch(NumberFormatException ex){
            ex.printStackTrace();
        }

        try{
			PrintWriter pw = new PrintWriter(new FileWriter("arvutatud" + ".txt"));

            double uusPalk = algPalk;
            pw.println("Algpalk on: " + algPalk);
            for(int k = 0; k < koefid.size(); k++){
                uusPalk = koefid.get(k) * uusPalk;
                pw.println(koefid.get(k) + " " + uusPalk);
            }
            double koefidKokku = 0;
            double keskmineKoef = 0;
            for (int j = 0; j < koefid.size(); j++){
                koefidKokku = koefidKokku + koefid.get(j);
            }
            keskmineKoef = koefidKokku / koefid.size();
            uusPalk = algPalk;
            pw.println("\nKeskmine koefitsient on: " + keskmineKoef);
            for(int p = 0; p < koefid.size(); p++){
                uusPalk = keskmineKoef * uusPalk;
                pw.println(uusPalk);
            }
			pw.close();
		} catch(Exception ex) {
			System.out.println(ex);
		}
    }
}