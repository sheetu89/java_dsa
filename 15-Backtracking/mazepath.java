public class mazepath {

    public static void main(String[] args) {
        int rows = 2;
        int cols = 2;
        int count = maze(1, 1, rows, cols);
        // 1,1 is the starting point and row and col are the ending point.
        System.out.println(count);

    }

    private static int maze(int startRow, int startCol, int endRow, int endCol) {
        if (startRow > endRow || startCol > endCol)
            return 0;
        if (startRow == endRow && startCol == endCol)
            return 1; // base case
        int downWays = maze(startRow + 1, startCol, endRow, endCol);
        int rightWays = maze(startRow, startCol + 1, endRow, endCol);
        int totalWays = downWays + rightWays;
        return totalWays;
    }
}
