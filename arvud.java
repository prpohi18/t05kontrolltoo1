import java.util.Scanner;
public class arvud{
	public static void main(String[] args){
		int arv1, arv2;
		int korrutis;
		double ruutjuur;
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("Sisesta 2 arvu ja leitakse nende arvude korrutis ning saadud tulemuse ruutjuur");
	arv1 = input.nextInt();
	arv2 = input.nextInt();
	
	input.close();
	
	korrutis = arv1*arv2;
	ruutjuur = Math.sqrt(korrutis);
	
	System.out.println("2 arvu korrutis on " + korrutis + " ja korrutise ruutjuur on " + ruutjuur);
	
		
	
	}
	
}
	