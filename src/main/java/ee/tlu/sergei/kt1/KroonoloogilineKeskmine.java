
package ee.tlu.sergei.kt1;

public class KroonoloogilineKeskmine {

    /*public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int c = 3;
    System.out.println(KronKesk(a, b, c));
    // output: 2.0
    
    double[] b = {1,2,3,4,5,6,7};
    System.out.println(KronKesk2(b));
    //output: 4.0
    }*/
    
    
    public static double KronKesk(double a, double b, double c){
        return (a/2+b+c/2)/2;
        
    } 
    
    
     public static double KronKesk2(double[] b){
        int jag = 0;
        double sum = 0;
        for (int i = 0; i < b.length; i++) {
            jag++;
        }
        jag = jag - 1;
        sum = ArraySum(b) - b[0] - b[b.length-1];
        return (b[0]/2 + sum +b[b.length-1]/2)/jag;
     }
     
     
    public static double ArraySum(double[] a){
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum+a[i];   
        }
        return sum;
    }

    public static void main(String[] args) {
        
    
    }
    
}
