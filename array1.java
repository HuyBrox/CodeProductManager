package REFECTOR;
import java.util.Arrays;
import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        System.out.println("Đề bài: Viết chương trình Java nhập một mảng số nguyên a0, a1, a2, …, an-1. Hãy sắp xếp mảng theo thứ tự tăng dần");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        readArrayFromUser(arr, scanner);
        sortArrayAscending(arr);
        printSortedArray(arr);
    }

    private static void readArrayFromUser(int[] arr, Scanner scanner) {
        System.out.print("Nhập các phần tử của mảng:\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
    }

    private static void sortArrayAscending(int[] arr) {
        Arrays.sort(arr);
    }

    private static void printSortedArray(int[] arr) {
        System.out.println("Dãy số được sắp xếp tăng dần: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}