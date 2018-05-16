import java.net.*;
import java.io.*;


public class Autod{
	public String auto;
	public double kaugus;
	public double kiirus;
	public double kms;
	public double kaugus_meetrites;
	public double new_kaugus;
	public double new_kaugus1;
	public double new_kaugus2;
	public double distants_sekundid = 3; //3 sekundit
	public double distants_minutid = 300; //5 minutit
	public double distants_minutid2 = 7200; //2 tundi
	
	
	public void asukohad(){
		kms = kiirus * 0.27;
		kaugus_meetrites = kaugus * 1000;
		new_kaugus = kaugus_meetrites - (kms * distants_sekundid/1000);
		new_kaugus1 = kaugus_meetrites - (kms * distants_minutid/1000);
		new_kaugus2 = kaugus_meetrites - (kms * distants_minutid2/1000);
	}

} 


