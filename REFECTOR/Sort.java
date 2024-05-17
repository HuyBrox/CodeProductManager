package REFECTOR;

public class Sort {
    int a;
    int b;
    int c;

    public void ascSort() {
        if (a > b) swap(a, b);
        if (a > c) swap(a, c);
        if (b > c) swap(b, c);
    }

    private void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
    public static void main(String[] args) {
        Sort s = new Sort();

        s.a = 5;
        s.b = 2;
        s.c = 8;

        s.ascSort();

        System.out.println("Các số sau khi sắp xếp tăng dần: " + s.a + ", " + s.b + ", " + s.c);
}
}

