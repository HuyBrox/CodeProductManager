package REFECTOR;

public class maxnumber {
	public int max2(int a, int b) {
        return Math.max(a, b);
    }

    public int max3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    public static void main(String[] args) {
        maxnumber max = new maxnumber();

        int result1 = max.max2(10, 20);
        System.out.println("max : " + result1);

        int result2 = max.max2(-5, 0);
        System.out.println("max: " + result2);

}
}

