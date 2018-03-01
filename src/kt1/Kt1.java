package kt1;

import java.util.Arrays;
import java.net.*;
import java.io.*;
import java.util.*;
import java.awt.image.*;
import java.awt.*;
import javax.imageio.*

public class Kt1 {

    public static void main(String[] args) throws Exception {
        // Loon massiivi
        int [] sisend = {7, 8, 10, 99, 85};
        int min = Arrays.stream(sisend).min().getAsInt();
        int max = Arrays.stream(sisend).max().getAsInt();
	// Kuvab massiivi	
	System.out.println("Järjestatult massiiv alates vähimast:");
		
	Arrays.sort(sisend); 
        
        for ( int i = 0 ; i < sisend.length ; i++ ) {
            System.out.println(sisend[i]);
		}
        System.out.println("Väikseim arv massiivis on " + min);
        System.out.println("Suurim arv massiivis on " + max); 
        
       /* int sum = 0;
        for (int d : sisend) sum += d;
        double average = sum / sisend.length;
        System.out.println(average);
        int veerand = 0;
        int pool = (int)average;
        int kolmveerand = 0;*/
        
        
    }
}
