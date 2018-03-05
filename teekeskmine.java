import java.io.*;
public class teekeskmine{
    protected int kiirusKesk;
    public static final String kiiruskaust="teekeskmine/";
    public teekeskmine(int kiirusKesk){
        this.kiirusKesk=kiirusKesk;

    }
    public boolean kiirusKeskKontroll (){
        if (loeKiirus()!=kiirusKesk){
            kirjutaKiirus(kiirusKesk);
            return true;

        }
        return false;
    }

    public boolean kasOlemas(){
        return new File(kiirusFailiNimi()).exists();
    }

    protected String kiirusFailiNimi(){
         return kiiruskaust + "kiirus.txt";
    }

    protected boolean looKiirusFail(){
      if(!kasOlemas()){
        kirjutaKiirus(kiirusKesk);
        return true;
      } return false;

    }
    public int loeKiirus(){
      try{
        BufferedReader br=new BufferedReader(new FileReader(kiirusFailiNimi()));
        int kkirus=Integer.parseInt(br.readLine());
        br.close();

        return kkirus;
      }catch(Exception ex){
            ex.printStackTrace();
        }
        return -1;
    }

    public boolean kirjutaKiirus(int km_h){
      try{
        PrintWriter pw=new PrintWriter(new FileWriter(kiirusFailiNimi()));
        pw.println(km_h);
        pw.close();
        return true;
      } catch(Exception ex){
             ex.printStackTrace();
         }
       return false;
    }


}
