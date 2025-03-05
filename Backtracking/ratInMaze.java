package Backtracking;

public class ratInMaze {
    public static void main(String[] args) {
        // Initializing the maze as a 2D integer array
        int[][] maze = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };

        // Find paths and print them
        String[] paths = findPath(maze);
        for (String path : paths) {
            System.out.println(path);
        }
    }

    public static void helper(int[][] maze, int r, int c, String path,
                              java.util.List<String> ans) {
        int n = maze.length;

        // Base case: Out of bounds, obstacle, or already visited
        if (r < 0 || c < 0 || r >= n || c >= n || maze[r][c] == 0 || maze[r][c] == -1)
            return;

        // If reached destination
        if (r == n - 1 && c == n - 1) {
            ans.add(path);
            return;
        }

        // Mark as visited
        maze[r][c] = -1;

        // Move Down
        helper(maze, r + 1, c, path + "D", ans);
        // Move Right
        helper(maze, r, c + 1, path + "R", ans);
        // Move Left
        helper(maze, r, c - 1, path + "L", ans);
        // Move Up
        helper(maze, r - 1, c, path + "U", ans);

        // Backtrack
        maze[r][c] = 1;
    }

    public static String[] findPath(int[][] mat) {
        int n = mat.length;
        java.util.List<String> ans = new java.util.ArrayList<>();

        // If starting or ending cell is blocked, no path exists
        if (mat[0][0] == 0 || mat[n - 1][n - 1] == 0)
            return new String[0];

        boolean[][] vis = new boolean[n][n];
        helper(mat, 0, 0, "", ans);

        return ans.toArray(new String[0]); // Convert List to String array
    }
}
