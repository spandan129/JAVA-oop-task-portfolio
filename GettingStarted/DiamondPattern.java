///Task4. Application that prints the following diamond shape. Don’t print any unneeded characters**
public class DiamondPattern {
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int p = 3;
        int r = 1;

        for (int i = 3; i >= 0; i--) {
            p = p - 1;
            r = r + 2;

            while (a > 0) {
                System.out.print(" ");
                a = a - 1;
            }

            a = p;

            while (b > 0) {
                System.out.print("*");
                b = b - 1;
            }

            b = r;
            System.out.println();
        }
        a=1;
        b=5;
        p=1;
        r=5;
        for (int i = 2; i >= 0; i--) {
            p = p + 1;
            r = r - 2;

            while (a > 0) {
                System.out.print(" ");
                a = a - 1;
            }

            a = p;

            while (b > 0) {
                System.out.print("*");
                b = b - 1;
            }

            b = r;
            System.out.println();
        }
    }
       

}
