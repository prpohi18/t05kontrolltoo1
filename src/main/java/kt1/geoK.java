

import java.io.*;
import java.util.*;


public class geoK {

    public static String p1() {
        int n1 = 5;
        int n2 = 10;
        double sqrt1 = Math.sqrt(n1);
        double sqrt2 = Math.sqrt(n2);
        int korrutis = n1 * n2;
        return "Arvude korrutis: " + korrutis + "\n1. arvu ruut: " + sqrt1 + "\n2. arvu ruut: " + sqrt2;
    }

    public static double p2(double[] data) {

        int kogus = 0;
        double korrutis = 1;
        double result = 0;

        for (int i = 1; i < data.length; i++) {
            korrutis = korrutis * data[i];
            kogus += 1;
        }

        result = Math.pow(korrutis, 1.0 / kogus);
        System.out.println("Korrutise vastus: " + korrutis);
        return result;

    }


    public static void main(String[] args) {

        double[] data = {3, 5, 4, 6};
        double algPalk = 0;
        List<Double> koef = new ArrayList<>(Arrays.asList());

        //1.
        System.out.println("KT 1.punkt");
        System.out.println(p1());

        //2.
        System.out.println("\nKT 2.punkt ");
        System.out.println(p2(data));

        //3.
        System.out.println("\nKT 3.punkt");
        try {
            BufferedReader br = new BufferedReader(new FileReader("./dataIn.txt"));

            int i = 0;
            String ln = br.readLine();

            while (ln != null) {
                if (i == 0) {
                    algPalk = Double.parseDouble(ln);
                }
                if (i > 0) {
                    koef.add(Double.parseDouble(ln));
                }
                ln = br.readLine();
                i += 1;
            }

            br.close();
            System.out.println("koefitsiendid: " + koef);
            System.out.println("algPalk: " + algPalk);

        } catch (FileNotFoundException e) {
            System.out.println("The file doesn't exist.");
        } catch (IOException e) {
            // do something, when the file is not readable
            System.out.println("The file could not be read.");
        }
        try {
            //PrintWriter pw = new PrintWriter(new FileWriter("./dataOut.txt"));
            FileWriter fileWriter = new FileWriter("./dataOut.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            double uusPalk = algPalk;
            printWriter.println("Algpalk on: " + algPalk + "\n");
            for (int i = 0; i < koef.size(); i++) {
                uusPalk = koef.get(i) * uusPalk;
                System.out.println("Uus palk: "+ algPalk * koef.get(i) + "  ||  koefitsent: " + koef.get(i) + "  ||  palk, kui koef yhtlane: " + uusPalk);
                printWriter.println("Uus palk: "+ algPalk * koef.get(i)+ "  ||  koefitsent: " + koef.get(i) + "  ||  palk, kui koef yhtlane: " + uusPalk + "\n");
            }

            printWriter.flush();
            printWriter.close();


        } catch (IOException e) {
            // do something, when the file is not readable
            System.out.println("The file could not be read.");
        }
    }
}