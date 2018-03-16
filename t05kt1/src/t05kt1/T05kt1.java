/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05kt1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author erike
 */
public class T05kt1 {
    static java.util.List<Double> dataToWrite = new ArrayList<Double>();
    
    public static double aritmKeskmine(double arv1, double arv2, double arv3) {
        double avg;
        avg = (arv1 + arv2 + arv3)/3;
        return avg;
    }
    public static double[] libisevKeskmine(double[] numbers, int range){
        int lenChange = range - 1;
        double[] result = new double[numbers.length - lenChange];
        for(int i = 0; i < numbers.length - 2; i++){
            result[i] = aritmKeskmine(numbers[i], numbers[i+1], numbers[i+2]);
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        int lenCounter = 0;
        double[] numbers = new double[] {2, 5, 6.5, 23, 8, 7, 3, 5, 3, 9};
        System.out.print("Sisesta arv: ");
        float arv1 = sc.nextFloat();
        System.out.print("Sisesta arv: ");
        float arv2 = sc.nextFloat();
        System.out.print("Sisesta arv: ");
        float arv3 = sc.nextFloat();
        System.out.println(aritmKeskmine(arv1, arv2, arv3));
        double[] result = libisevKeskmine(numbers, 3);
        FileReader in = new FileReader("C:\\Users\\erike\\Documents\\t05kontrolltoo1\\andmed.txt");
        double[] fileData = new double[lenCounter];
        BufferedReader br = new BufferedReader(in);
        String row = br.readLine();
        while(row != null){
            System.out.println(row);
            double parsedData = Double.parseDouble(row);
            dataToWrite.add(parsedData);
            row = br.readLine();
        }
        System.out.print("Sisesta libiseva keskmise arvutamiseks kasutatav arvude hulk: ");
        int range = sc.nextInt();
        double[] dataToWriteArr = new double[dataToWrite.size()];
        for (int i = 0; i < dataToWriteArr.length; i++){
            dataToWriteArr[i] = dataToWrite.get(i);
        }
        double[] outputData = libisevKeskmine(dataToWriteArr, range);
        PrintWriter writer = new PrintWriter("../output.txt", "UTF-8");
        for(int i = 0; i < outputData.length; i++){
            writer.println(outputData[i]);
        }
        writer.close();
    }
}
