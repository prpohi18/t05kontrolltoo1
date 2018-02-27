import java.io.*;
import java.util.*;

public class kt2{
	
	ArrayList<Integer> punktid=new ArrayList<Integer>();
	ArrayList<Integer> hinded=new ArrayList<Integer>();
	
	public double keskmineHinne(ArrayList<Integer> punktid, ArrayList<Integer> hinded){
		int kaalutud_summa=0;
		int ainepunktide_summa=0;
	//KAALUTUD KESKMINE				
		for(int i=0; i<punktid.size(); i++){
			kaalutud_summa+=punktid.get(i)*hinded.get(i);
			ainepunktide_summa+=punktid.get(i);	
		}
		double keskmine=(double) kaalutud_summa/ainepunktide_summa;	
		return keskmine;
	}
	//TEISENDUS
	public int Teisendus(String hinne){		
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