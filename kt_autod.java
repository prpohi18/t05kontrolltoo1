import java.net.*;
import java.io.*;


public class kt_autod {
	public String auto;
	public double kaugus;
	public double kiirus;
	public double kiirus_meetrit_sekundis;
	public double kaugus_meetrites;
	public double uus_kaugus;
	public double uus_kaugus1;
	public double uus_kaugus2;
	public double distants_aeg_sekund = 3;
	public double distants_aeg_minut = 300;
	public double distants_aeg_minut1 = 7200;
	//distants_aeg on välja toodud sekundites
	
	
	
	public void asukohtade_m22ramine(){
		kiirus_meetrit_sekundis = kiirus * 0.27;
		kaugus_meetrites = kaugus * 1000;
		uus_kaugus = kaugus_meetrites - (kiirus_meetrit_sekundis * distants_aeg_sekund);
		uus_kaugus1 = kaugus_meetrites - (kiirus_meetrit_sekundis * distants_aeg_minut);
		uus_kaugus2 = kaugus_meetrites - (kiirus_meetrit_sekundis * distants_aeg_minut1);
	}

}