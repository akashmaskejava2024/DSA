package BackTRacking;

public class GridWays {

    static int gridWays = 0;

    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int[][] grid = new int[n][m];
        findGridWay(grid, 0, 0);
        System.out.println(GridWays.gridWays);
    }
    public static void findGridWay(int[][] grid, int row, int col) {
        // reached destination
        if (row == grid.length - 1 && col == grid[0].length - 1) {
            GridWays.gridWays++;
            return;
        }
        // base case: out of bounds
        if (row >= grid.length || col >= grid[0].length) {
            return;
        }
        findGridWay(grid, row + 1, col);
        findGridWay(grid, row, col + 1);
    }

}
