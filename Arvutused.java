import java.util.*;
public class Arvutused{
	public void andmed(String uuedAndmed){
        andmedList = uuedAndmed;
    }
    public static int Max(int andmed){
        int maxValue = andmed[0];
        for (int i = 1; i < andmed.length; i++) {
            if (andmed[i] > maxValue) {
                maxValue = andmed[i];
            }
        }
        return maxValue;
    public static int MaxValue(int[] andmed){
        for (int i = 0; i <= andmed.length; i++){
            int max = 0;
            if (max > andmed[i]){
                max = andmed[i];
            }
        }
        return max; 
}