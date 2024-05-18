/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.levannhat;

/**
 *
 * @author levannhat
 */
public class Advance5 {

    /*Kiểm tra một số có đối xứng không
      * Nếu đối xứng trả về true, ngược lại trả về false
      * VD: 112 -> false, 12121 -> true
     */
    public boolean kiemTraDoiXung(int number) {
        StringBuilder xau = new StringBuilder();
        String str = number + "";
        xau.append(str);
        String check = xau.reverse().toString();
        return str.equals(check);
    }
}

