import java.util.Scanner;

public class Kilometerconveter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter miles: ");
        double miles = scanner.nextDouble();
        
        double kilometers = miles * 1.60935;
        
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
        
        scanner.close();
    }
}