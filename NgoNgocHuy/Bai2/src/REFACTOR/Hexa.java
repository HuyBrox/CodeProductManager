package REFACTOR;


public class Hexa {
    public void FourNumber() {
        for (int decimal = 0; decimal <= 0xFFFF; decimal++) {
            System.out.printf("%04X\t%d%n", decimal, decimal);
        }
    }
}
