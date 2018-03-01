import java.lang.Math;
import java.io.*;

public class Main{
	
	public static double getSqrt(int a, int b) {
		double result=0;
		
		result=Math.sqrt(a*b);
		return result;
	}
	
	public static double doRoot(double[] dataIn) {
		double dataMult = 1;
		double j = 0;
		double j_pow = 0;
		for(int i=1;i<dataIn.length;i++) {
			if(dataIn[i] == 0) {
				j++;
			}
			else {
				dataMult = dataMult*dataIn[i];
				j++;
				j_pow++;
			}
		}
		double result = 0;
		result = Math.pow(dataMult, 1.0/j_pow);
		System.out.println(result);
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
		double cntrlVar = dataArray[0];
		double cntrlVar2 = dataArray[0];
		double dataAnswer[] = new double[99];
		
		while(dataArray[i+1] != 0) {
			cntrlVar2=cntrlVar2*dataArray[i+1];
			dataAnswer[i]=cntrlVar2;
			i++;
		}
		
		i=0;
		double staticCoef = doRoot(dataArray);
		
		try {
			FileWriter fileWriter=new FileWriter(fileOut, true);
			
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("A0: "+Math.round(dataArray[0])+" A0: "+Math.round(dataArray[0]));
			bufferedWriter.newLine();
			
			while(dataArray[i+1] != 0) {
				cntrlVar = cntrlVar*staticCoef;
				bufferedWriter.write("A"+(i+1)+": "+Math.round(dataAnswer[i])+" "+"A"+(i+1)+": "+Math.round(cntrlVar));
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
		double[] dataArray= {2,8};
		System.out.println(doRoot(dataArray));
		//3 YL
		calcWage("fileIn.txt","fileOut.txt");
		
		
	}
	
}