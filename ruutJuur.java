import java.io.*;
import java.util.*;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*; 
import java.math.*;

public class ruutJuur{	
	public static void main(String[] args) throws Exception{
		List<Integer> arvud = new ArrayList<Integer>();
		Integer loendur = 0;
		File fail = new File("andmed.txt");
		BufferedReader reader = null;
		double kokku = 1;
		
		try{
			reader = new BufferedReader(new FileReader(fail));
			String rida = null;
			
			
			while ((rida = reader.readLine()) != null) {
				arvud.add(Integer.parseInt(rida));
				kokku = Integer.parseInt(rida) * kokku;
				loendur += 1;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			}catch (IOException e) {
			}
		}
		
		double vastus = Math.pow(kokku, 1.0 / loendur);
		
		System.out.println(arvud);
		System.out.println(loendur);
		System.out.println(kokku);
		System.out.println("vastus on " + vastus);
		
	
	}
	
		
}		
