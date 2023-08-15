
//Array sum and average                                                                                                                                                 //Array sum and average

import java.util.*;
import java.util.Scanner;

public class sumaverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum:" + sum);
        System.out.println("Average:" + (sum / n));
    }
}