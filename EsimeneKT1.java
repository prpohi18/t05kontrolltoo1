import java.io.*; 
import java.util.*; 
public class EsimeneKT1{
	ArrayList<Integer> punktid=new ArrayList<Integer>(); 
	ArrayList<Integer> hinded=new ArrayList<Integer>(); 
	public int Teisendamine(String hinne){		 
		if(hinne.equals("F")){ 
			return 0; 
		} 
		if(hinne.equals("E")){ 
			return 1; 
		} 
		if(hinne.equals("D")){ 
			return 2; 
		} 
		if(hinne.equals("C")){ 
			return 3; 
		} 
		if(hinne.equals("B")){ 
			return 4; 
		} 
		if(hinne.equals("A")){ 
			return 5; 
		} 
		return -1; 
	}
	public double kaalutud(ArrayList<Integer> punktid, ArrayList<Integer> hinded){ 
		int kaalutudsumma=0; 
		int ainepunktidesumma=0; 
		for(int i=0; i<punktid.size(); i++){ 
			kaalutudsumma+=punktid.get(i)*hinded.get(i); 
			ainepunktidesumma+=punktid.get(i);	 
		} 
		double keskmine=(double) kaalutudsumma/ainepunktidesumma;	 
		return keskmine; 
	} 
}