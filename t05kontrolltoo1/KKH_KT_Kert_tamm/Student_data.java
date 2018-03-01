public class Student_data{
	protected String eesnimi;
	protected String perekonnanimi;	
	
	protected String aine1nimi;
	protected int aine1eap;
	protected int aine1hinne;
	
	protected String aine2nimi;
	protected int aine2eap;
	protected int aine2hinne;
	
	protected String aine3nimi;
	protected int aine3eap;
	protected int aine3hinne;
		
	public int eapsum(int aine1eap, int aine2eap, int aine3eap){
		int EAP=aine1eap+aine2eap+aine3eap;
		return EAP;				
	}
	
	public double kkh(int aine1eap, int aine1hinne, int aine2eap, int aine2hinne, int aine3eap, int aine3hinne){		
		double A=(aine1eap*aine1hinne)+(aine2eap*aine2hinne)+(aine3eap*aine3hinne);
		double KKH = A/(aine1eap+aine2eap+aine3eap);
		return KKH;			
		
	}	
}