/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

/**
 *
 * @author phong
 */

    public class Sort {
    int a;
    int b;
    int c;

    public void ascSort() {
        swapIfGreater(a, b);
        swapIfGreater(a, c);
        swapIfGreater(b, c);
    }

    private void swapIfGreater(int i, int j) {
        if (i > j) {
            int temp = i;
            i = j;
            j = temp;
        }
    }
}
    

