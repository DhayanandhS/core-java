package practice;
import java.util.Scanner;

public class Test2 {
    public static void sort012(int[] arr) {
        int c0 = 0, c1 = 0, c2 = 0;
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            if (arr[i] == 0) {
                c0++;
            } else if (arr[i] == 1) {
                c1++;
            } else if (arr[i] == 2) {
                c2++;
            }
        }

        for (int i = 0; i < len; i++) {
            if (i < c0) {
                arr[i] = 0;
            } else if (i < c0 + c1) {
                arr[i] = 1;
            } else {
                arr[i] = 2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 elements (0s, 1s, 2s):");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sort012(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
