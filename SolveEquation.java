/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenphuocyen;

/**
 *
 * @author PC
 */
public class SolveEquation {
    public int number1;
    public int number2;

    public String linearEquation() {
        if (number1 == 0) {
            if (number2 == 0) {
                return "Multi roots";
            } else {
                return "No root";
            }
        } else {
            return "One root";
        }
    }
}
    

