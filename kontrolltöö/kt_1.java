import java.util.Scanner;

public class kt_1{
    public static void main(String[] args) throws Exception{
		
	Scanner input = new Scanner (System.in);
	System.out.println("Sisesta 2 arvu ja leitakse nende arvude korrutis ning saadud tulemuse ruutjuur");
	double a = input.nextInt();
	double b = input.nextInt();
	
	input.close();
	
	System.out.println("Ruutjuur arvudest " + a + " ja " + b + " on: " + Math.sqrt(a*b));
    }
	
}

