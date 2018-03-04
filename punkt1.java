import java.awt.image.*;
import javax.imageio.*;
import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.lang.Math;

public class punkt1{
	public static void main(String[] arg) throws Exception{
		Scanner input = new Scanner(System.in);
		float kiirus1;
        float kiirus2;
		float kiirus3;
		float kiirus4;
		float teepikkus = 1;
		float aeg1km;
		float aeg2km;
		float aegkokku;

		System.out.print("Ette on antud teepikkus, palun sisesta kiirus, millega kavatsed seda läbida.\n");
		System.out.print("Kiiruse ühik on: km/h.\n");
		
        System.out.print("Esimese kilomeetri distantsi kiirus: ");
        kiirus1 = input.nextFloat();

		System.out.print("Teise kilomeetri distantsi kiirus: ");
        kiirus2 = input.nextFloat();
		
		double distants2kmkeskmine = (kiirus1 + kiirus2) / 2;
		System.out.print("Kahe kilomeetri keskmine kiirus on: "+distants2kmkeskmine+" km/h\n");
		aeg1km = (teepikkus / kiirus1) * 100;
		System.out.print("Aeg esimese kilomeetri läbimiseks: "+aeg1km+" minutit\n");
		aeg2km = (teepikkus / kiirus2) * 100;
		System.out.print("Aeg teise kilomeetri läbimiseks: "+aeg2km+" minutit\n");
		aegkokku = aeg1km + aeg2km;
		System.out.print("Aega läks kahe kilomeetri läbimiseks: "+aegkokku+" minutit\n");
	}
}