//A maze is an  N*N binary matrix of blocks where the upper left block is known as the source block,and the lower
// rightmost block is known as the destination block. if we consider the maze,then maze [0][0] is the source ,and maze
//  [N-1][N-1] is the destination. our main task is to reach the destination from the source.we have considered a rat as 
//  a character that can move either forward or downwards. in the maze matrix,a few blocks will be denoted by 0 and active
// blocks will be denoted by 1. the rat can only move to the active blocks. 

public class ratinadeadmaze {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        int[][] maze = {
                {1, 1, 1, 1},
                {1, 0, 1, 1},
                {0, 1, 1, 1},
                {1, 1, 0, 1}};
        // Call the print method to find paths
        print(maze, 0, 0, rows - 1, cols - 1, "");
    }

    private static void print(int[][] maze, int sr, int sc, int er, int ec, String S) {
        // Out of bounds or invalid cell
        if (sr > er || sc > ec || maze[sr][sc] == 0) {
            return;
        }

        // Base case: Reached the destination
        if (sr == er && sc == ec) {
            System.out.println(S);
            return;
        }

        // Recursive calls for possible moves
        print(maze, sr + 1, sc, er, ec, S + "D"); // Move Down
        print(maze, sr, sc + 1, er, ec, S + "R"); // Move Right
    }
}
