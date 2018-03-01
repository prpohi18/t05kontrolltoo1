import java.io.*;

public class Student_input{

public static void main(String[] args) throws IOException{
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		
		Student_data opilaneID=new Student_data();
		
		System.out.println("Sisesta 6pilase eesnimi:");
		String eesnimi=buffer.readLine();
		opilaneID.eesnimi=eesnimi;
		
		System.out.println("Sisesta 6pilase perekonnanimi:");
		String perekonnanimi=buffer.readLine();
		opilaneID.perekonnanimi=perekonnanimi;
		
// Aine 1		
		System.out.println("Sisesta aine nimetus:");
		String aine1nimi=buffer.readLine();
		opilaneID.aine1nimi=aine1nimi;
		
		System.out.println("Sisesta aine "+aine1nimi+" EAP maht:");
		String Aine1EAP=buffer.readLine();
		int aine1eap=Integer.parseInt(Aine1EAP);
		opilaneID.aine1eap=aine1eap;
		
		System.out.println("Sisesta 6pilase "+eesnimi+" "+perekonnanimi+" aine "+aine1nimi+" hinne:");
		String Aine1HINNE=buffer.readLine();
		int aine1hinne=Integer.parseInt(Aine1HINNE);
		opilaneID.aine1hinne=aine1hinne;
		
// Aine 2		
		System.out.println("Sisesta aine nimetus:");
		String aine2nimi=buffer.readLine();
		opilaneID.aine2nimi=aine2nimi;
		
		System.out.println("Sisesta aine "+aine2nimi+" EAP maht:");
		String Aine2EAP=buffer.readLine();
		int aine2eap=Integer.parseInt(Aine2EAP);
		opilaneID.aine2eap=aine1eap;
		
		System.out.println("Sisesta 6pilase "+eesnimi+" "+perekonnanimi+" aine "+aine2nimi+" hinne:");
		String Aine2HINNE=buffer.readLine();
		int aine2hinne=Integer.parseInt(Aine2HINNE);
		opilaneID.aine2hinne=aine2hinne;
		
// Aine 3		
		System.out.println("Sisesta aine nimetus:");
		String aine3nimi=buffer.readLine();
		opilaneID.aine3nimi=aine3nimi;
		
		System.out.println("Sisesta aine "+aine3nimi+" EAP maht:");
		String Aine3EAP=buffer.readLine();
		int aine3eap=Integer.parseInt(Aine3EAP);
		opilaneID.aine3eap=aine3eap;
		
		System.out.println("Sisesta 6pilase "+eesnimi+" "+perekonnanimi+" aine "+aine3nimi+" hinne:");
		String Aine3HINNE=buffer.readLine();
		int aine3hinne=Integer.parseInt(Aine3HINNE);
		opilaneID.aine3hinne=aine3hinne;		
		
		int eapsum = opilaneID.eapsum(aine1eap, aine2eap, aine3eap);	
		double kkh = opilaneID.kkh(aine1eap, aine1hinne, aine2eap, aine2hinne, aine3eap, aine3hinne);	
		
		String Opilased = "6pilased/" +opilaneID.eesnimi +" "+ opilaneID.perekonnanimi+ ".txt";
		String OpilasteHinnetelehed = "6pilaste hinnetelehed/" + opilaneID.eesnimi + " " + opilaneID.perekonnanimi + ".txt";

		try{
            PrintWriter pw=new PrintWriter(new FileWriter(Opilased));
			pw.println("6pilase eesnimi: " +opilaneID.eesnimi);	
			pw.println("6pilase perekonnanimi: " +opilaneID.perekonnanimi);
			pw.println("6pilase 6ppekava t2idetud mahus: " +eapsum+" EAP");
			pw.printf("6pilase KKH: %.2f",kkh);
            pw.close();
           } catch(Exception ex){
               ex.printStackTrace();
           }
		   
		try{
            PrintWriter pw=new PrintWriter(new FileWriter(OpilasteHinnetelehed));
			pw.println("6pilase nimi: " +opilaneID.eesnimi+" "+opilaneID.perekonnanimi);
			pw.println("6pilase EAP kokku: " +eapsum+" EAP");
			pw.printf("6pilase KKH: %.2f\n",kkh);	
			pw.println(opilaneID.aine1nimi+" [Hinne: "+opilaneID.aine1hinne+" / "+opilaneID.aine1eap+" EAP]");
			pw.println(opilaneID.aine2nimi+" [Hinne: "+opilaneID.aine2hinne+" / "+opilaneID.aine2eap+" EAP]");
			pw.println(opilaneID.aine3nimi+" [Hinne: "+opilaneID.aine3hinne+" / "+opilaneID.aine3eap+" EAP]");
			
            pw.close();
           } catch(Exception ex){
               ex.printStackTrace();
           }		   
    }	
}