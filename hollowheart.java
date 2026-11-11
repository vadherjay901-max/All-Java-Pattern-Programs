import java.util.Scanner;
public class  hollowheart{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter heart size: ");
        int n = sc.nextInt();
        if (n < 4) {
            System.out.println("Please enter a number greater than 3.");
            return;
        }
        for (int i = n / 2; i <= n; i += 2) {
            for (int j = 1; j < n - i; j += 2)
                System.out.print("  ");
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n - i; j++)
                System.out.print("  ");
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
