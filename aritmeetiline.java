import java.util.Scanner;
 
public class aritmeetiline {
 
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
   
	System.out.print("Sisesta esimene arv: ");
	float num1 = in.nextInt();
   
	System.out.print("Sisesta teine arv: ");
	float num2 = in.nextInt();
   
	System.out.print("Sisesta kolmas arv: ");
	float num3 = in.nextInt();
 
	System.out.println("Sisestatud kolme arvu aritmeetiline keskmine on: " + 
	(num1 + num2 + num3) / 3);
	}
}
