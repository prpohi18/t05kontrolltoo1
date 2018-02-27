import java.math.*;

public class Main {
  public static void main(String[] args) {
    Massiiv1 koordinaadid1 = new Massiiv1(2, 3, 4);
    Massiiv2 koordinaadid2 = new Massiiv2(3, 2, 3);

    System.out.println("\nKolmnurga X ja Y koordinaadid:");
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

    //arvutan külgede a, b ja c vahed
    double ab_vahe = a - b;
    if (ab_vahe < 0) {
        ab_vahe *= -1;
    }
    double bc_vahe = b - c;
    if (bc_vahe < 0) {
        bc_vahe *= -1;
    }
    double ca_vahe = c - a;
    if (ca_vahe < 0) {
        ca_vahe *= -1;
    }

    //kontrollin kas küljed sarnased 
    if (ab_vahe <= min_vahe && bc_vahe <= min_vahe && ca_vahe <= min_vahe) {
      System.out.println("\nKülgede pikkused sarnased, järelikult tegemist on ligikaudselt võrdkülgse kolmnurgaga.\n");
    } else {
      System.out.println("\nKülgede suuruste vahed suured, ei ole võrdkülgne kolmnurk.\n");
    }
  }
}

/* Kertus-MacBook-Pro:t05kontrolltoo1 kertu$ java Main

Kolmnurga X ja Y koordinaadid:
Kolmnurga x-koordinaadid 9, 5, 1
Kolmnurga y-koordinaadid 2, 3, 8

Külgede suuruste vahed suured, ei ole võrdkülgne kolmnurk.

Kertus-MacBook-Pro:t05kontrolltoo1 kertu$ java Main

Kolmnurga X ja Y koordinaadid:
Kolmnurga x-koordinaadid 2, 3, 4
Kolmnurga y-koordinaadid 3, 2, 3

Külgede pikkused sarnased, järelikult tegemist on ligikaudselt võrdkülgse kolmnurgaga.
*/