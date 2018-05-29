import java.util.Scanner;
import java.lang.*;
public class Algus{
	public static void main(String args[]){
		System.out.println("Esimene arv:");
		Scanner a = new Scanner(System.in);
		double first = a.nextDouble();
		System.out.println("Teine arv:");
		Scanner b = new Scanner(System.in);
		double second = b.nextDouble();
		
		double sum = first * second;
		
		System.out.println("Math.sqrt("+ sum +")=" + Math.sqrt(sum));
	}
}