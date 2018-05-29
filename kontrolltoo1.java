import java.awt.*;
import java.io.*;
import java.util.Arrays;

public class kontrolltoo1{

	public double kolmeAritKeskmine(double[] sisendArvud, int input){
		int counterThree=0;
		double summa=0;
		double keskmine=0;
		while(counterThree<(input)){
			summa+=sisendArvud[counterThree];
			//System.out.println(sisendArvud[counterThree]);
			
			counterThree+=1;
		}
		keskmine=summa/(input);
		return keskmine;
	}

	public void libisevKeskminein(int input)throws Exception {
		int countM=0;
		int moment=0;
		int counter=0;
		int numbercounter=0;
		int count=0;
		
		
		BufferedReader br=new BufferedReader(new FileReader("KT1.txt"));
        String line=br.readLine();
		while(line!=null){
			line=br.readLine();
			countM+=1;
		}
		br.close();
		double[] loetudNumbrid=new double[countM];
		double[] libisevKeskmine= new double[countM-(input-1)];
		double[] sisendArvud= new double[input-1];
		BufferedReader is=new BufferedReader(new FileReader("KT1.txt"));
        String rida=is.readLine();
		while(rida!=null){
			loetudNumbrid[count]=Integer.parseInt(rida);
			count+=1;
			rida=is.readLine();
		}
		is.close();
		while((moment+(input-1))<countM){
			while(counter<(input-1)){
				sisendArvud[counter]=loetudNumbrid[numbercounter];
				counter+=1;
				numbercounter+=1;
			}
			libisevKeskmine[moment]= kolmeAritKeskmine(sisendArvud,input-1);
			moment+=1;
			counter=0;
			numbercounter=moment;
		}
		
		PrintWriter pw=new PrintWriter(new FileWriter("Output.txt"));
		pw.println(Arrays.toString(libisevKeskmine));
		pw.close();
		//int[] libKeskm=kolmeAritKeskmine();
		//System.out.println(Arrays.toString(libisevKeskmine));
		
		
	}

	
	
}