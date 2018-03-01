import java.net.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{
		String aadress="http://www.tlu.ee/~kerttamm/prpohi/AutodeInfo.txt";
		BufferedReader buffer=new BufferedReader(new InputStreamReader(
			new URL(aadress).openStream()));
		//BufferedReader buffer= new BufferedReader(new FileReader("Autode info.txt"));
		String rida = buffer.readLine();
		String[] stringArray = rida.split(",");
		//System.out.println(Arrays.toString(stringArray));
		rida=buffer.readLine();
		PrintWriter writer = new PrintWriter("Leitud kaugused.txt", "UTF-8");
		int loendur=0;

		while(rida!=null){
			loendur++;
			
			String[] Autode_Info = rida.split(",");
			
			DataInput auto=new DataInput(Double.parseDouble(Autode_Info[0]), Double.parseDouble(Autode_Info[1]), Double.parseDouble(Autode_Info[2]), Double.parseDouble(Autode_Info[3]));
			for (int i=0;i<stringArray.length;i++) {
				if(stringArray[i].equals("3")){
					System.out.println(" ");
				}
			System.out.println("("+loendur+". paar) Esimene auto on " + stringArray[i] + " sekundi pärast " + auto.auto1LeitudDistants(Integer.parseInt(stringArray[i]))+ " km kaugusel ja teine auto on " + auto.auto2LeitudDistants(Integer.parseInt(stringArray[i]))+ " km kaugusel.");
			writer.println("("+loendur+". paar) Esimene auto on " + stringArray[i] + " sekundi pärast " + auto.auto1LeitudDistants(Integer.parseInt(stringArray[i]))+ " km kaugusel ja teine auto on " + auto.auto2LeitudDistants(Integer.parseInt(stringArray[i]))+ " km kaugusel.");
			}
			
			rida=buffer.readLine();
		}
		writer.close();
		buffer.close();
	}
}