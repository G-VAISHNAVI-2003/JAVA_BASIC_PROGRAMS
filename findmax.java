import java.util.Scanner;

public class findmax
 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(c, Math.max(a, b));
        System.out.println("THE MAXIMUM VALUE AMONG a,b,c: " + max);
    }
}