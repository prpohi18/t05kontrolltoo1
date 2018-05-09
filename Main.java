import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("andmed.txt"));
        List<String> andmed = new ArrayList<String>();
        String rida=br.readLine();
            while(rida != null) {
                andmed.add(new andmed(rida));
                rida=br.readLine();
        }
        br.close();
        System.out.println(andmed);
    }
}