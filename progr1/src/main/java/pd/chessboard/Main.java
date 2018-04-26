package pd.chessboard;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean startingPosition(String moves) {
        int left = 0;
        int right = 0;
        int up = 0;
        int down = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'L':
                    left++;
                    break;
                case 'P':
                    right++;
                    break;
                case 'G':
                    up++;
                    break;
                case 'D':
                    down++;
                    break;
                default:
                    System.out.println("wrong character sequence");
                    return false;
            }
            if (left == right && up == down) {
                return true;
            }
        }
        return false;
    }
}
