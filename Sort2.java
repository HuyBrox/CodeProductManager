/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenphuocyen;

/**
 *
 * @author PC
 */
public class Sort2 {
    int number1;
    int number2;

    public Sort2(int number1, int number2) {
        super();
        this.number1 = number1;
        this.number2 = number2;
    }

    public void sortDesc() {
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
}

    
}
