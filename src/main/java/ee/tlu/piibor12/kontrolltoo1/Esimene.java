
package ee.tlu.piibor12.kontrolltoo1;
    

public class Esimene {
    public static void main(String[] args){
        int[] arvud={1, 7, 2, 3, 4, 6};
        float kokku=0;
        float summa=0;
        float aritm_keskm=0;
        for(int i=0; i<6; i++){
            summa = summa + arvud[i];
            kokku=kokku +1;
            
            
        }
        aritm_keskm=summa/kokku ;
        System.out.println("Summa on: "+summa);
        System.out.println("kokku on arve: "+kokku);
        System.out.println("Aritmeetiline keskmine: "+aritm_keskm);
    }
}
