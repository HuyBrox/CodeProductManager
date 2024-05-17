/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KHOA PC
 */
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Đề bài: Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.\r\nSắp xếp các phần tử trong mảng theo thứ tự ngược lại.");

        int n = inputNumber("Nhập vào n:", scanner);
        int[] numbers = new int[n];

        inputNumbers("Nhap so nguyen:", numbers, scanner);

        System.out.println("Mang truoc khi dao: ");
        printArray(numbers);

        reverseArray(numbers);

        System.out.println("mang sau khi dao: ");
        printArray(numbers);
    }

    private static int inputNumber(String prompt, Scanner scanner) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    private static void inputNumbers(String prompt, int[] numbers, Scanner scanner) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(prompt);
            numbers[i] = scanner.nextInt();
        }
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
