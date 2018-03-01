public class Teine {
    
    public static void main(String[] arg){
        int[] arvud = {1, 7, 2, 3, 4, 6};
        int keskmine1 = (arvud[0]+arvud[1]+arvud[2])/3;
        int keskmine2 = (arvud[1]+arvud[2]+arvud[3])/3;
        int keskmine3 = (arvud[2]+arvud[3]+arvud[4])/3;
        int keskmine4 = (arvud[3]+arvud[4]+arvud[5])/3;
        for(int i=0; i<4; i++){
            int[] keskmised = new int[4];
            keskmised[0] = keskmine1;
            keskmised[1] = keskmine2;
            keskmised[2] = keskmine3;
            keskmised[3] = keskmine4;
            System.out.println(keskmised[i]);
        }
    }
    
}
