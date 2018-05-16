public class Auto_andmed {
	public static void main(String[] args){
		Autod Auto1 = new Autod();
		Auto1.auto = "Kollane auto";
		Auto1.kaugus = 70;
		Auto1.kiirus = 80;
		//Kaugus ja kiirus on KM'des
		System.out.println("Auto: "+Auto1.auto+ ", kaugus maantee otspunktist: "+Auto1.kaugus+" KM, auto kiirus on: "+Auto1.kiirus+ " KM/H.");
		Auto1.asukohad();
		System.out.println("Kaugus meetrites on: "+Auto1.kaugus_meetrites);
		System.out.println("Auto liigub: "+Auto1.kms+ " meetrit sekundis.");
		System.out.println("Auto uus kaugus meetrites on (3sekundit): "+Auto1.new_kaugus);
		System.out.println("Auto uus kaugus meetrites on (300sekundit): "+Auto1.new_kaugus1);
		System.out.println("Auto uus kaugus meetrites on (7200sekundit): "+Auto1.new_kaugus2);
		
		Autod Auto2 = new Autod();
		Auto2.auto = "Punane auto";
		Auto2.kaugus = 120;
		Auto2.kiirus = 70;
		System.out.println("Auto: "+Auto2.auto+ ", kaugus maantee otspunktist: "+Auto2.kaugus+" KM, auto kiirus on: "+Auto2.kiirus+ " KM/H.");
		Auto2.asukohad();
		System.out.println("Kaugus meetrites on: "+Auto2.kaugus_meetrites);
		System.out.println("Auto liigub: "+Auto2.kms+ " meetrit sekundis.");
		System.out.println("Auto uus kaugus meetrites on (3sekundit): "+Auto2.new_kaugus);
		System.out.println("Auto uus kaugus meetrites on (300sekundit): "+Auto2.new_kaugus1);
		System.out.println("Auto uus kaugus meetrites on (7200sekundit): "+Auto2.new_kaugus2);
		
	}
} 