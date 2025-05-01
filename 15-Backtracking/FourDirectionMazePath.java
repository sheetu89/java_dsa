public class FourDirectionMazePath {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 6;
        boolean[][] visited = new boolean[rows][cols]; // Create a visited array
        print(0, 0, rows - 1, cols - 1, "", visited);
    }

    private static void print(int sr, int sc, int er, int ec, String s, boolean[][] visited) {
        // Out of bounds or already visited
        if (sr < 0 || sc < 0 || sr > er || sc > ec || visited[sr][sc]) {
            return;
        }

        // Base case: Reached the destination
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        // Mark the current cell as visited
        visited[sr][sc] = true;

        // Recursive calls for all four directions
        print(sr + 1, sc, er, ec, s + "D", visited); // down
        print(sr - 1, sc, er, ec, s + "U", visited); // up
        print(sr, sc + 1, er, ec, s + "R", visited); // right
        print(sr, sc - 1, er, ec, s + "L", visited); // left
        // Backtrack: Unmark the current cell
        visited[sr][sc] = false;
    }
 }