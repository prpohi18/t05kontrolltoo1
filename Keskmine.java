import java.util.Arrays;
public class Keskmine{
	public static int[] arvudeks(String[] tekstid){
		int[] vastus=new int[tekstid.length];
		for(int i=0; i<tekstid.length; i++){
			vastus[i]=Integer.parseInt(tekstid[i]);
		}
		return vastus;
	}
	public static float kiirusteKeskmine(int[] vastus){
		//minutit km kohta
		float minutit = 0;
		int loendur = 0;
		for(int i=0; i<vastus.length; i++){
			loendur++;
			minutit = (60.0f/vastus[i]*1.0f) + minutit; 
		}
		//keskmine kiirus
		float tulemus = 60*1.0f/minutit;
		System.out.println(tulemus);
		float keskmine = tulemus * loendur;
		System.out.println(keskmine);
		return keskmine;
	}
	public static void main(String[] arg){
		try{
			int[] vastus=arvudeks(arg);
			System.out.println("Massiiv: "+Arrays.toString(vastus));
			System.out.println("Kiiruste keskmine: "+kiirusteKeskmine(vastus));
		}catch(Exception e){
			System.out.println("Probleem: "+e.getMessage());
		}
	}
	
}

