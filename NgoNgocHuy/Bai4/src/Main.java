import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArraySort arraySort = new ArraySort();
        arraySort.input(scanner);
        arraySort.sort();
    }
}
