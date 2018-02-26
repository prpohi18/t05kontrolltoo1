public class KT {
	public static void main(String[] arg){
		Andmed auto1 = new Andmed();
		auto1.kaugus = (150);
		auto1.kiirus = (100);
		
		Andmed auto2 = new Andmed();
		auto2.kaugus = (100);
		auto2.kiirus = (50);
		
		System.out.println("Esimene auto on " + auto1.kaugus + " kilomeetri kaugusel ja liigub kiirusel " + auto1.kiirus + " kilomeetrit tunnis\n");
		System.out.println("Teine auto on " + auto2.kaugus + " kilomeetri kaugusel ja liigub kiirusel " + auto2.kiirus + " kilomeetrit tunnis\n");
		
		//double asukoht3sek;
		//double asukoht5min;
		//int asukoht2h;
		
		//Kaugused 3sek pärast (3 sek = 0.00083333h)
		//auto1.kaugus3sek = (auto1.kiirus * 0.00083333 + auto1.kaugus);
		//auto2.kaugus3sek = 
		
		//System.out.println("Esimene auto on jõudnud kolme sekundiga " + auto1.kaugus3sek + " kilomeetri kaugusele\n");
		//System.out.println();
		
		//Kaugused 5min pärast
		auto1.kaugus5min = (auto1.kiirus / 12 + auto1.kaugus);
		auto2.kaugus5min = (auto2.kiirus / 12 + auto2.kaugus);
		
		System.out.println("Esimene auto on jõudnud viie minutiga " + auto1.kaugus5min + " kilomeetri kaugusele\n");
		System.out.println("Teine auto on jõudnud viie minutiga " + auto2.kaugus5min + " kilomeetri kaugusele\n");
		
		//Kaugused 2h pärast
		auto1.kaugus2h = ((auto1.kiirus * 2) + auto1.kaugus);
		auto2.kaugus2h = ((auto2.kiirus * 2) + auto2.kaugus);
		
		System.out.println("Esimene auto on jõudnud kahe tunniga " + auto1.kaugus2h + " kilomeetri kaugusele\n");
		System.out.println("Teine auto on jõudnud kahe tunniga " + auto2.kaugus2h + " kilomeetri kaugusele\n");		
	}
}