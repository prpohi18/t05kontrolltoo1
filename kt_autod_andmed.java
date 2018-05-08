public class kt_autod_andmed {
	public static void main(String[] args){
		kt_autod Auto1 = new kt_autod();
		Auto1.auto = "Kollane auto";
		Auto1.kaugus = 70;
		Auto1.kiirus = 80;
		//Kaugus ja kiirus on KM'des
		System.out.println("Auto: "+Auto1.auto+ ", kaugus maantee otspunktist: "+Auto1.kaugus+" KM, auto kiirus on: "+Auto1.kiirus+ " KM/H.");
		Auto1.asukohtade_m22ramine();
		System.out.println("Kaugus meetrites on: "+Auto1.kaugus_meetrites);
		System.out.println("Auto liigub: "+Auto1.kiirus_meetrit_sekundis+ " meetrit sekundis.");
		System.out.println("Auto uus kaugus meetrites on (3sekundit): "+Auto1.uus_kaugus);
		System.out.println("Auto uus kaugus meetrites on (300sekundit): "+Auto1.uus_kaugus1);
		System.out.println("Auto uus kaugus meetrites on (7200sekundit): "+Auto1.uus_kaugus2);
		
		kt_autod Auto2 = new kt_autod();
		Auto2.auto = "Punane auto";
		Auto2.kaugus = 120;
		Auto2.kiirus = 70;
		System.out.println("Auto: "+Auto2.auto+ ", kaugus maantee otspunktist: "+Auto2.kaugus+" KM, auto kiirus on: "+Auto2.kiirus+ " KM/H.");
		Auto2.asukohtade_m22ramine();
		System.out.println("Kaugus meetrites on: "+Auto2.kaugus_meetrites);
		System.out.println("Auto liigub: "+Auto2.kiirus_meetrit_sekundis+ " meetrit sekundis.");
		System.out.println("Auto uus kaugus meetrites on (3sekundit): "+Auto2.uus_kaugus);
		System.out.println("Auto uus kaugus meetrites on (300sekundit): "+Auto2.uus_kaugus1);
		System.out.println("Auto uus kaugus meetrites on (7200sekundit): "+Auto2.uus_kaugus2);
		
	}
}