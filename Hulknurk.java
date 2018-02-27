import java.math.*;

public class Hulknurk {
  public static void main(String[] args) {
    Hulknurk1 koordinaadid1 = new Hulknurk1(9, 5, 1, 2, 5);
    Hulknurk2 koordinaadid2 = new Hulknurk2(2, 3, 8, 4, 2);

    System.out.println("\nHulknurga X ja Y koordinaadid:");
    System.out.println(koordinaadid1);
    System.out.println(koordinaadid2);

    int x;
    int y;
    double min_vahe=1;
    //esimene külg a, Pythagorase teoreemiga 
    x = koordinaadid1.x1 - koordinaadid1.x2;
    if (x < 0) {
        x *= -1;
    }
    y = koordinaadid2.y1 - koordinaadid2.y2;
    if (y < 0) {
        y *= -1;
    }
    double a = Math.sqrt((x * x)+(y * y));

    //teine külg b, Pythagorase teoreemiga 
    x = koordinaadid1.x2 - koordinaadid1.x3;
    if (x < 0) {
        x *= -1;
    }
    y = koordinaadid2.y2 - koordinaadid2.y3;
    if (y < 0) {
        y *= -1;
    }
    double b = Math.sqrt((x * x)+(y * y));

    //kolmas külg c, Pythagorase teoreemiga 
    x = koordinaadid1.x3 - koordinaadid1.x1;
    if (x < 0) {
        x *= -1;
    }
    y = koordinaadid2.y3 - koordinaadid2.y1;
    if (y < 0) {
        y *= -1;
    }
    double c = Math.sqrt((x * x)+(y * y));

    //neljas külg d, Pythagorase teoreemiga 
    x = koordinaadid1.x3 - koordinaadid1.x1;
    if (x < 0) {
        x *= -1;
    }
    y = koordinaadid2.y3 - koordinaadid2.y1;
    if (y < 0) {
        y *= -1;
    }
    double d = Math.sqrt((x * x)+(y * y));

    //viies külg e, Pythagorase teoreemiga 
    x = koordinaadid1.x3 - koordinaadid1.x1;
    if (x < 0) {
        x *= -1;
    }
    y = koordinaadid2.y3 - koordinaadid2.y1;
    if (y < 0) {
        y *= -1;
    }
    double e = Math.sqrt((x * x)+(y * y));

    //arvutan külgede a, b, c, d ja e vahed
    double ab_vahe = a - b;
    if (ab_vahe < 0) {
        ab_vahe *= -1;
    }
    double bc_vahe = b - c;
    if (bc_vahe < 0) {
        bc_vahe *= -1;
    }
    double cd_vahe = c - d;
    if (cd_vahe < 0) {
        cd_vahe *= -1;
    }
    double de_vahe = d - e;
    if (de_vahe < 0) {
        de_vahe *= -1;
    }
    double ea_vahe = e - a;
    if (ea_vahe < 0) {
        ea_vahe *= -1;
    }

    //kontrollin kas küljed sarnased 
    if (ab_vahe <= min_vahe && bc_vahe <= min_vahe && cd_vahe <= min_vahe && de_vahe <= min_vahe && ea_vahe <= min_vahe) {
      System.out.println("\nKülgede pikkused sarnased \n");
    } else {
      System.out.println("\nKülgede pikkused ei ole sarnased\n");
    }
  }
}