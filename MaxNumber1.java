/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenphuocyen;

/**
 *
 * @author PC
 */
public class MaxNumber1 {

    public static int max3(int number1, int number2, int number3) {
        if (number1 > number2) {
            if (number1 > number3) {
                return number1;
            } else {
                return number3;
            }
        } else if (number2 > number3) {
            return number2;
        } else {
            return number3;
        }
    }
}

    

