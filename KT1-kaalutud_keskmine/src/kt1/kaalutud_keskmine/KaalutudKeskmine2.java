package kt1.kaalutud_keskmine;

import java.util.*;

public class KaalutudKeskmine2 {
    ArrayList<Integer> points = new ArrayList<>();
    ArrayList<Integer> grades = new ArrayList<>();
 
    public double Conversion(String grade) {
        if(grade.equals("A")){
            return 5.0;
        }
        if(grade.equals("B")){
            return 4.0;
        }
        if(grade.equals("C")){
            return 3.0;
        }
        if(grade.equals("D")){
            return 2.0;
        }
        if(grade.equals("E")){
            return 1.0;
        }
        if(grade.equals("F")){
            return 0;
        }
        return -1;
    }
    
    public double weightedArithmetic(ArrayList<Integer> points, ArrayList<Integer> grades){
        int weightedSum = 0;
        int EAPSum = 0;
        
        for(int i=0; i<points.size(); i++){
            weightedSum = weightedSum + points.get(i)*grades.get(i);
            EAPSum = EAPSum + points.get(i);
        }
        double Average = weightedSum / EAPSum;
        return Average;
    }
}
