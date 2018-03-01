public class Esimene {
    
    public static void main (String[] args){
        int[] arvud = {3, 4, 5};
        int summa = 0;
        int keskmine = 0;
        for(int i=0; i<arvud.length; i++){
            summa+=arvud[i];
        }
        System.out.println("Summa on: "+summa);
        for(int i=0; i<arvud.length; i++){
            keskmine = summa/arvud.length;
        }
        System.out.println("Keskmine on: "+keskmine);
                
    }
}  
