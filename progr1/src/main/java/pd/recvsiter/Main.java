package pd.recvsiter;

public class Main {
    private static int fibRec(int n) {
        if (n < 3) {
            return 1;
        }
        return fibRec(n - 2) + fibRec(n - 1);
    }

    private static int fibIter(int n) {
        int a = 0;
        int b = 1;
        int c = 0;

        if (n < 2) {
            return n;
        }
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    private static double powRek (double x, int n){
        int a = 1;
        while(n>0){
            a*=x;
            n--;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(fibRec(2));
        System.out.println(fibIter(2));
        System.out.println(powRek(3,3));
    }
}


