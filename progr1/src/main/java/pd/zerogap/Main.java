package pd.zerogap;

public class Main {
    public static void main(String[] args) {

    }
    public static int zeroGap (int N){
        String binary = Integer.toBinaryString(N);
        int longestGap = 0;
        int zeroCount = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                zeroCount = 0;
            } else {
                zeroCount++;
                if (longestGap < zeroCount) {
                    longestGap = zeroCount;
                }
            }
        }
        return longestGap;
    }
}
