import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] arg){
        System.out.println(calculateKeskmine(3,4,5,6));
        double[] EAPList = {3,7,4};
        double[] HinneList = {3,5,5};
        System.out.println(calculateArrayKeskmine(EAPList, HinneList));
        calculateFromFileKeskmine();
    }
    public static void writeFile(String str)
            throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/KKH.txt", true));
        writer.append(str);

        writer.close();
    }

    public static double calculateKeskmine (double esimeneHinne, double teineHinne, double esimeneEAP, double teineEAP) {
        double vastus = ((esimeneHinne*esimeneEAP)+(teineHinne*teineEAP))/(esimeneEAP+teineEAP);
        return vastus;
    }

    public static double calculateArrayKeskmine (double[] EAPList, double[] HinneList) {
        double total = 0;
        for (int i = 0; i < EAPList.length; i++) {
            total = total + (EAPList[i]*HinneList[i]);
        }
        double sum = 0;
        for(double num : EAPList) {
            sum = sum+num;
        }
        double vastus = total/sum;
        return vastus;
    }
    public static double calculateListKeskmine (List<Double> GradeList, List<Double> EAPList) {
        double total = 0;
        for (int i = 0; i < EAPList.size(); i++) {
            total = total + (EAPList.get(i)*GradeList.get(i));
        }
        double sum = 0;
        for(double num : EAPList) {
            sum = sum+num;
        }
        double vastus = total/sum;
        return vastus;
    }

    public static void calculateFromFileKeskmine () {
        String fileName = "src/kool.txt";

        String line = null;

        try {
            FileReader fileReader =
                    new FileReader(fileName);

            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            List<String> GradeList = new ArrayList<String>();
            List<Double> EAPList = new ArrayList<Double>();
            List<Double> GradeDoubleList = new ArrayList<Double>();

            while((line = bufferedReader.readLine()) != null) {
                String[] string = line.split(",");
                GradeList.add(string[1]);
                EAPList.add(Double.parseDouble(string[2]));
            }

            for (int i = 0; i < GradeList.size(); i++) {
                if (GradeList.get(i).contains("A")) {
                    GradeDoubleList.add(5.0);
                } else if (GradeList.get(i).contains("B")) {
                    GradeDoubleList.add(4.0);
                } else if (GradeList.get(i).contains("C")) {
                    GradeDoubleList.add(3.0);
                } else if (GradeList.get(i).contains("D")) {
                    GradeDoubleList.add(2.0);
                } else if (GradeList.get(i).contains("E")) {
                    GradeDoubleList.add(1.0);
                } else if (GradeList.get(i).contains("F")) {
                    GradeDoubleList.add(0.0);
                }
            }

            bufferedReader.close();
            String vastus = "Keskmine kaalutud hinne: " + (calculateListKeskmine(GradeDoubleList, EAPList));
            writeFile(vastus);
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file");
        }
    }
}
