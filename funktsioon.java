import java.util.Scanner;
import java.lang.*;
public class funktsioon{
	public static void main(String args[]){
		System.out.println("Sisesta esimene arv:");
		Scanner a = new Scanner(System.in);
		double esimene = a.nextDouble();
		System.out.println("Sisesta teine arv:");
		Scanner b = new Scanner(System.in);
		double teine = b.nextDouble();
		
		double sum = esimene * teine;
		
		System.out.println("Math.sqrt("+ sum +")=" + Math.sqrt(sum));
	}
}
