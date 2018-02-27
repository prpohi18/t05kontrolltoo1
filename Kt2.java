//Libisev keskmine 2.ülesanne
import java.net.*;
import java.io.*;
import java.util.*;


public class Kt2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Sisesta viis arvu (lõpetamiseks ok): ");
		List<Integer> arvud = new ArrayList<Integer>();
		while(scan.hasNextInt()){
			arvud.add(scan.nextInt());
		}
		System.out.println(arvud);
		
		double keskmine1=0;
		double keskmine2=0;
		double keskmine3=0;
		int summa1=0;
		int summa2=0;
		int summa3=0;

		summa1=arvud.get(0) + arvud.get(1) + arvud.get(2);
		System.out.println(summa1);
		keskmine1= summa1*1.0/3;
		System.out.println(keskmine1);
		summa2=arvud.get(1) + arvud.get(2) + arvud.get(3);
		System.out.println(summa2);
		keskmine2= summa2*1.0/3;
		System.out.println(keskmine2);
		summa3=arvud.get(2) + arvud.get(3) + arvud.get(4);
		System.out.println(summa3);
		keskmine3= summa3*1.0/3;	
		System.out.println(keskmine3);
		
		List<Double> keskmised = new ArrayList<Double>();
		keskmised.add(new Double(keskmine1));
		keskmised.add(new Double(keskmine2));
		keskmised.add(new Double(keskmine3));

		System.out.println("Uus massiiv keskmistest" +keskmised);

	}
}


/*[ojavgret@greeny Programmeerimine]$ java Kt2
Sisesta viis arvu (lõpetamiseks ok):
1 2 3 4 5 ok
[1, 2, 3, 4, 5]
6
2.0
9
3.0
12
4.0
Uus massiiv keskmistest[2.0, 3.0, 4.0]
*/
