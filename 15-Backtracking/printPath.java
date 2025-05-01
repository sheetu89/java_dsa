public class printPath {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        print(1, 1, rows, cols, "");
    }

    private static void print(int sr, int sc, int er, int ec, String s) {
        if (sr > er || sc > ec)
            return; // out of bounds
        if (sr == er && sc == ec) { // base case
            System.out.println(s);
            return;
        }

        // Recursive calls
        print(sr + 1, sc, er, ec, s + "D"); // down
        print(sr, sc + 1, er, ec, s + "R"); // right
    }
}
