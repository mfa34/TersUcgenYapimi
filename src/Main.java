import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen basamak sayisini giriniz :");
        int n = input.nextInt();

        for (int a = (n); a >= 1; a--) {
            for (int b = (n - a); b >= 1; b--) {
                System.out.print(" ");
            }
            for (int c = (2 * a - 1); c >= 1; c--) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
