import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");
        double farenheit = scanner.nextDouble();
        System.out.println(farenheit);
        double celsius = ((farenheit-32.0)*5/9);
        System.out.printf("%.6f\n",celsius);
        System.out.println(celsius);
        System.out.printf("If it were 2\u00b0 warmer it would be: %.6f\n"+ (celsius+2));

    }

}
