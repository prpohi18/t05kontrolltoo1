package ee.tlu.mjae.kontrolltoo1;

import java.util.Arrays;

public class masiiv {
    public static void main(String[] arg){
    int[] a = {12, 23, 45, 34, 98, 72};
    int min = Arrays.stream(a).min().getAsInt();
    int max = Arrays.stream(a).max().getAsInt();
    System.out.println("Massiiv järjestatud kasvavas järjekorras: ");
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    System.out.println("Vähim: "+ min);
    System.out.println("Suurim: "+ max);
}
}

