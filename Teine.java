package kt1;
import java.util.ArrayList;
import java.util.Arrays;





public class Teine {
    public static void main(String[] args){
        int[] arvud={1, 7, 2, 3, 4, 6};
        float[] keskmised = new float [10];
        float keskmine1=0;
        float keskmine2=0;
        float keskmine3=0;
        float keskmine4=0;
        float vahe_summa1=0;
        float vahe_summa2=0;
        float vahe_summa3=0;
        float vahe_summa4=0;
        for(int i=0; i<3; i++){
            vahe_summa1 = arvud[i] + vahe_summa1;
        }
        keskmised[0]=keskmine1; 
        for(int i=1; i<4; i++){
            vahe_summa2 = arvud[i] + vahe_summa2;
                        
        }
        keskmised[1]=keskmine2;
        for(int i=2; i<5; i++){
            vahe_summa3 = arvud[i] + vahe_summa3;            
            
        }
        keskmised[2]=keskmine3;
        for(int i=3; i<6; i++){
            vahe_summa4 = arvud[i] + vahe_summa4;
                 
        }


       /* ArrayList<Float> keskmised_array= new ArrayList<Float>();
        keskmised_array.add(keskmine1);
       */
       keskmine1 = vahe_summa1 / 3;
       keskmine2 = vahe_summa2 / 3;
       keskmine3 = vahe_summa3 / 3;
       keskmine4 = vahe_summa4 / 3;
       
       for (int i=0; i<4;i++){
           keskmised[0]=keskmine1;
           keskmised[1]=keskmine2;
           keskmised[2]=keskmine3;
           keskmised[3]=keskmine4;
           System.out.println(keskmised[i]);
       }
        
       
        
        
        
        System.out.println("keskmised: "+keskmine1+" "+keskmine2+" "+keskmine3+" "+keskmine4);

    }



}