import java.util.Arrays;

public class Sort {
    int a;
    int b;
    int c;

    public Sort(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    private void ascSort() {
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        a = arr[0];
        b = arr[1];
        c = arr[2];
    }

    public void output() {
        ascSort();
        System.out.println("Các số sau khi sắp xếp tăng dần: " + a + ", " + b + ", " + c);
    }
}
