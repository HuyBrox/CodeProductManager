/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.levannhat;

/**
 *
 * @author levannhat
 */
public class Triangle {

    private final int number1;
    private final int number2;
    private final int number3;

    public Triangle(int number1, int number2, int number3) {
        super();
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public int maxLength() {
        if (number1 >= number2) {
            if (number1 > number3) {
                return number1;
            } else {
                return number3;
            }
        }
        if (number2 > number3) {
            return number2;
        } else {
            return number3;
        }
    }
}
