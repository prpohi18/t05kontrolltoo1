import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class funktsioonid{
	ArrayList<Integer> ainetePunktid=new ArrayList<Integer>();
	ArrayList<Integer> aineteHinded=new ArrayList<Integer>();
	
	public double kaalutudKeskmine(ArrayList<Integer> ainetePunktid, ArrayList<Integer> aineteHinded){
		int osaKaal=0;
		int ainepunktide_summa=0;
		
		for(int i=0; i<ainetePunktid.size(); i++){
			osaKaal+=ainetePunktid.get(i)*aineteHinded.get(i);
			ainepunktide_summa+=ainetePunktid.get(i);	
		}
		double kaalutud_keskmine=(double) osaKaal/ainepunktide_summa;

		return kaalutud_keskmine;
	}
	
	public int hinneteVaartused(String hinne){		
		if(hinne.equals("A")){
			return 5;
		}
		if(hinne.equals("B")){
			return 4;
		}
				if(hinne.equals("C")){
			return 3;
		}
				if(hinne.equals("D")){
			return 2;
		}
				if(hinne.equals("E")){
			return 1;
		}
				if(hinne.equals("F")){
			return 0;
		}
		return -1;
	}
}