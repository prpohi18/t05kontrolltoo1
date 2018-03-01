import java.lang.Math;
import java.io.*;

public class Main{
	
	public static double getSqrt(int a, int b) {
		double result=0;
		
		result=Math.sqrt(a*b);
		return result;
	}
	
	public static double doRoot(int[] dataIn) {
		int dataMult = 1;
		int j = 0;
		for(int i=0;i<dataIn.length;i++) {
			dataMult = dataMult*dataIn[i];
			j++;
		}
		double result = 0;
		result = Math.pow(dataMult, j);
		return result;
		
	}
	
	public static void calcWage(String fileIn, String fileOut) {
		double dataArray[] = new double[99];
		int i = 0;
		BufferedReader reader;
		try {
			
			reader = new BufferedReader(new FileReader(
					fileIn));
			String line = reader.readLine();
			while(line != null) {
				dataArray[i]=Double.parseDouble(line);
				System.out.println(dataArray[i]);
				i++;
				line=reader.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		i=0;
		double staticCoef = 1;
		while(dataArray[i]  != 0) {
			staticCoef = staticCoef*dataArray[i];
			i++;
		}
		staticCoef = staticCoef/dataArray[0];
		i=0;
		double cntrlVar = dataArray[0];
		
		try {
			FileWriter fileWriter=new FileWriter(fileOut, true);
			
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			while(dataArray[i+1] != 0) {
				cntrlVar = cntrlVar*staticCoef;
				bufferedWriter.write(cntrlVar*dataArray[i+1]+" "+cntrlVar);
				bufferedWriter.newLine();
				i++;
				
			}
			bufferedWriter.close();
		}
		catch(IOException ex) {
			System.out.println("Error writing to file!");
		}
		
	}
	
	public static void main(String[] arg) {
		//1 YL
		System.out.println(getSqrt(5,35));
		//2 YL
		int[] dataArray= {5,3,7,4,3,5,2};
		System.out.println(doRoot(dataArray));
		//3 YL
		calcWage("fileIn.txt","fileOut.txt");
		
		
	}
	
}