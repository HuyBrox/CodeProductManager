
import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    private int[] arr;

    public void input(Scanner scanner) {
        System.out.println("Đề bài: Viết chương trình Java nhập một mảng số nguyên a0, a1, a2, …, an-1. Hãy sắp xếp mảng theo thứ tự tăng dần");
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        arr = new int[n]; // Sử dụng arr của lớp thay vì tạo biến mới
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
    }

    public void sort() {
        Arrays.sort(arr);
        System.out.println("Dãy số được sắp xếp tăng dần:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}










