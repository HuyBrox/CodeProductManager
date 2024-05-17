package REFACTOR;

public class maxnumber {
    public maxnumber() {
    }

//    public int max2(int a, int b) {
//        if (a >= b)
//            return a;
//        else
//            return b;
//    }
//
//    public int max3(int a, int b, int c) {
//        if (a >= b)
//            if (a >= c)
//                return a;
//            else
//                return c;
//        else if (b >= c)
//            return b;
//        else
//            return c;
//    }


    public int max2(int a, int b) {
        return Math.max(a, b);
    }
    public int max3(int a, int b, int c) {
        return max2(max2(a, b), c);
    }
}