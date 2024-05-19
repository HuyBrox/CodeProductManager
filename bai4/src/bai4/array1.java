/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.util.Arrays;

/**
 *
 * @author phong
 */
public class array1 {
    public class Array1 {
    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Đề bài: Viết chương trình Java nhập một mảng số nguyên a0, a1, a2, …, an-1. Hãy sắp xếp mảng theo thứ tự tăng dần");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Mảng đã được sắp xếp theo thứ tự tăng dần: ");
        System.out.println(Arrays.toString(arr));
    }
}
}
