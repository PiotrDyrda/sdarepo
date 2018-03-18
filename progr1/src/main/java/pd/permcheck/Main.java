package pd.permcheck;
import java.util.Arrays;

public class Main {
}
// you can also use imports, for example:
// import java.util.*;
//import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int a = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == i + 1) {
                a++;
            }

        }
        if (a == A.length){
            return 1;
        }else{
            return 0;
        }
    }
}
