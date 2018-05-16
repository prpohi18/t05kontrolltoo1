import java.io.*;
import java.util.*;

public class Keskmine{
    //teine osa
	
	ArrayList<Integer> hinded=new ArrayList<Integer>();
	ArrayList<Integer> ainepunktid=new ArrayList<Integer>();

	public double keskmineHinne(ArrayList<Integer> ainepunktid, ArrayList<Integer> hinded){
		int kk_summa=0;
		int ap_summa=0;
//kaalutud keskmine kk = kaalutud keskmine ap = ainepunkt				
		for(int i=0; i<ainepunktid.size(); i++){
			kk_summa+=ainepunktid.get(i)*hinded.get(i);
			ap_summa+=ainepunktid.get(i);	
		}
		double keskmine=(double) kk_summa/ap_summa;	
		return keskmine;
	}
//teisendamine hinneteks
	public int Hinded(String hinne){
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