/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmoonilinekeskmine;
import java.net.*;
import java.io.*;

public class URLReader{
     public static void reader(String[] args) throws Exception {
        URL link = new URL("http://greeny.cs.tlu.ee/~sevtrobe/javaKT/keskminekiirus.txt");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(link.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
            
        in.close();
     }
}
