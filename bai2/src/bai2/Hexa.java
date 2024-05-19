/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author phong
 */
public class Hexa {
    
    public void fourNumber() {
        char[] digits = "0123456789ABCDEF".toCharArray();
        for (int i = 0; i < 0x10000; i++) {
            String hex = String.format("%04X", i);
            System.out.println(hex + "\t" + i);
        }
    }

    public static void main(String[] args) {
        Hexa hexa = new Hexa();
        System.out.println("Hexa\tDecimal");
        hexa.fourNumber();
    }
}
    
}
