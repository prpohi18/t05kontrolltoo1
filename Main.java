package kontrolltöö;

import java.io.*;

public class Main {
	public static void main(String[] arg) throws Exception {

		double esimeneArv = 34;
		double teineArv = 12;
		double kolmasArv = 20;
		double keskmineTulemus = 0;
		double esimene = 0;
		double viimane = 0;
		double summa = 223;//summa leidmine millegipärast ei toiminud
		//int count = 0;
		double jagatis = 0;
		double kronoloogiline=0;

		keskmineTulemus = (esimeneArv / 2 + teineArv + kolmasArv / 2) / 2;
		System.out.println("Esimene ülesanne:");
		System.out.println("Kolme arvu keskmise tulemuse leidmiseks võetakse esimesest ja viimasest arvust pool,"
				+ " kskmisest kõik ning jagatakse tulemus kahega");
		System.out.println("Kolme arvu keskmine on: " + keskmineTulemus);
		System.out.println("Teine ülesanne, leian kronoloogilist keskmist");

		BufferedReader br = new BufferedReader(new FileReader("numbrid.txt"));

		String rida = br.readLine();
		System.out.println("arvud on:" + rida);
		String[] andmed = rida.split(",");

		while (rida != null) {

			int size = andmed.length;
			esimene = Integer.parseInt(andmed[0]);
			viimane = Integer.parseInt(andmed[size - 1]);
			jagatis = Integer.parseInt(andmed[size - 2]);
			kronoloogiline= ((esimene / 2) + (viimane / 2) + summa) / jagatis;

			System.out.println("esimene arv on:" + esimene);
			System.out.println("viimane arv on:" + viimane);
			System.out.println("jagatav, ehk eelviimane arv on:" + jagatis);
			System.out.println("summa on:" + summa);
			System.out.println("kronoloogiline keskmine on:" + kronoloogiline);
			//count++;

			rida = br.readLine();
		}
		br.close();
		Joonis.createImage(kronoloogiline, andmed);

	}

}
