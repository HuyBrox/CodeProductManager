/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.levannhat;

/**
 *
 * @author levannhat
 */
public class Advance4 {

    public boolean isPrimeNumber(int n) {
// so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
// check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
