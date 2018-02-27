import java.io.*;
import java.util.*;
public class Autod{
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new FileReader("autod.txt"));
		String rida = br.readLine();
		String[] strArray = rida.split(" ");
		System.out.println(Arrays.toString(strArray));
		rida=br.readLine();
		PrintWriter writer = new PrintWriter("kaugused.txt", "UTF-8");
		int counter=0;


		while(rida!=null){
			counter++;
			
			String[] autod = rida.split(" ");
			
			Asukoht auto=new Asukoht(Double.parseDouble(autod[0]), Double.parseDouble(autod[1]));
			for (int i=0;i<strArray.length;i++) {
			System.out.println("Auto kaugus: " + auto.newDistance(Integer.parseInt(strArray[i]))+ "km, " + strArray[i] + " sekundi pärast");
			writer.println("Auto " + counter + " kaugus: " + auto.newDistance(Integer.parseInt(strArray[i]))+ "km, " + strArray[i] + " sekundi pärast");
			}
			
			rida=br.readLine();
		}
		writer.close();
		br.close();

	}
}





/*
public class Autod{
	public static void main(String[] arg){
		Asukoht auto1=new Asukoht(10.2, 50.0);
		Asukoht auto2=new Asukoht(5.4, 90.0);
		System.out.println("Auto1 kaugus: " + auto1.dist()+ "km, auto kiirus: " + auto1.speed()+ "km/h");
		System.out.println("Auto2 kaugus: " + auto2.dist()+ "km, auto kiirus: " + auto2.speed()+ "km/h");
		
		//3sec
		System.out.println("Auto1 kaugus: " + auto1.newDistance(3)+ "km, 3 sekundi pärast");
		System.out.println("Auto2 kaugus: " + auto2.newDistance(3)+ "km, 3 sekundi pärast");
		//5min
		System.out.println("Auto1 kaugus: " + auto1.newDistance(300)+ "km, 5 minuti pärast");
		System.out.println("Auto2 kaugus: " + auto2.newDistance(300)+ "km, 5 minuti pärast");
		//3sec
		System.out.println("Auto1 kaugus: " + auto1.newDistance(7200)+ "km, 2 tunni pärast");
		System.out.println("Auto2 kaugus: " + auto2.newDistance(7200)+ "km, 2 tunni pärast");
	}
}*/