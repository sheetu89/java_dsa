//A maze is an  N*N binary matrix of blocks where the upper left block is known as the source block,and the lower
// rightmost block is known as the destination block. if we consider the maze,then maze [0][0] is the source ,and maze
//  [N-1][N-1] is the destination. our main task is to reach the destination from the source.we have considered a rat as 
//  a character that can move either forward or downwards. in the maze matrix,a few blocks will be denoted by 0 and active
// blocks will be denoted by 1. the rat can only move to the active blocks. 

public class ratinadeadmaze {
    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };
        int n = maze.length;
        boolean[][] visited = new boolean[n][n]; // Tracks visited cells
        System.out.println("Paths from source to destination:");
        print(maze, 0, 0, "", visited, n);
    }

    private static void print(int[][] maze, int sr, int sc, String path, boolean[][] visited, int n) {
        // Out of bounds or invalid cell
        if (sr < 0 || sc < 0 || sr >= n || sc >= n || maze[sr][sc] == 0 || visited[sr][sc]) {
            return;
        }

        // Base case: Reached the destination
        if (sr == n - 1 && sc == n - 1) {
            System.out.println(path);
            return;
        }

        // Mark the current cell as visited
        visited[sr][sc] = true;

        // Recursive calls for possible moves
        print(maze, sr + 1, sc, path + "D", visited, n); // Move Down
        print(maze, sr, sc + 1, path + "R", visited, n); // Move Right

        // Backtrack: Unmark the current cell
        visited[sr][sc] = false;
    }
}