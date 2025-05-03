public class FourDirectionMazePath {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 6;
        boolean[][] isvisited = new boolean[rows][cols]; // by default ->false
        print(0, 0, rows - 1, cols - 1, "", isvisited);
    }

    private static void print(int sr, int sc, int er, int ec, String s, boolean[][] isvisited) {
        if (sr < 0 || sc < 0 || sr > er || sc > ec || isvisited[sr][sc]== true) return;
        // Base case: Reached the destination
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        // Mark the current cell as visited
        isvisited[sr][sc] = true;

        // Recursive calls for all four directions
        print(sr + 1, sc, er, ec, s + "D", isvisited); // down
        print(sr - 1, sc, er, ec, s + "U", isvisited); // up
        print(sr, sc + 1, er, ec, s + "R", isvisited); // right
        print(sr, sc - 1, er, ec, s + "L", isvisited); // left
        // Backtrack: Unmark the current cell
        isvisited[sr][sc] = false;
    }
 }



//  public class FourDirectionMazePath {
//     public static void main(String[] args) {
//         int rows = 4;
//         int cols = 6;
//         print(1, 1, rows, cols, "");
//     }

//     private static void print(int sr, int sc, int er, int ec, String s, boolean[][] visited) {
//         // Out of bounds or already visited
//         if (sr < 1 || sc < 1 || sr > er || sc > ec) return;
//         // Base case: Reached the destination
//         if (sr == er && sc == ec) {
//             System.out.println(s);
//             return;
//         }

//         // Recursive calls for all four directions
//         print(sr + 1, sc, er, ec, s + "D", visited); // down
//         print(sr - 1, sc, er, ec, s + "U", visited); // up
//         print(sr, sc + 1, er, ec, s + "R", visited); // right
//         print(sr, sc - 1, er, ec, s + "L", visited); // left
//     }
// }