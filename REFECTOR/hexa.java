package REFECTOR;


public class hexa {
    public void printHexaDecimalPairs() {
        for (int i = 0; i < 0x10000; i++) {
            System.out.println(String.format("%4s", Integer.toHexString(i)).replace(" ", "0") + "\t" + i);
        }
    }

    public static void main(String[] args) {
        new hexa().printHexaDecimalPairs();
    }
}



