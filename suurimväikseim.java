import java.io.*;
import java.util.*;

class suurimväikseim{
 public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("numbers.txt"));
            int largest = file.nextInt();
			int lowest = file.nextInt();

            while(file.hasNextInt()) {
                int number = file.nextInt();

                if(number > largest) {
                    largest = number;
                }
				
				 if(number < lowest) {
                    lowest = number;
                }

                //System.out.println(number);
            }

            file.close();
			
			
            System.out.println("suurim on: " + largest);
			System.out.println("väikseim on: " + lowest);
			
			
	   } catch(IOException e) {
            System.out.println(e.getMessage());
		}
    }
}
		
		
