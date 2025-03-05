package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class ratInMazeProblem {
    public static void main(String[] args) {
        // Properly initializing the maze as an ArrayList of ArrayLists
        ArrayList<ArrayList<Integer>> maze = new ArrayList<>();
        maze.add(new ArrayList<>(List.of(1, 0, 0, 0)));
        maze.add(new ArrayList<>(List.of(1, 1, 0, 1)));
        maze.add(new ArrayList<>(List.of(0, 1, 0, 0)));
        maze.add(new ArrayList<>(List.of(1, 1, 1, 1)));

        // Find paths and print them
        ArrayList<String> paths = findPath(maze);
        System.out.println(paths);
    }
    public static void helper(ArrayList<ArrayList<Integer>> maze, int r, int c, String path,
                              ArrayList<String> ans, boolean[][] vis) {
        int n = maze.size();

        // Base case: Out of bounds, obstacle, or already visited
        if (r < 0 || c < 0 || r >= n || c >= n || maze.get(r).get(c) == 0 || vis[r][c])
            return;

        // If reached destination
        if (r == n - 1 && c == n - 1) {
            ans.add(path);
            return;
        }

        // Mark as visited
        vis[r][c] = true;

        // Move Down
        helper(maze, r + 1, c, path + "D", ans, vis);
        // Move Right
        helper(maze, r, c + 1, path + "R", ans, vis);
        // Move Left
        helper(maze, r, c - 1, path + "L", ans, vis);
        // Move Up
        helper(maze, r - 1, c, path + "U", ans, vis);

        // Backtrack
        vis[r][c] = false;
    }

    public static ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        int n = mat.size();
        ArrayList<String> ans = new ArrayList<>();

        // If starting or ending cell is blocked, no path exists
        if (mat.get(0).get(0) == 0 || mat.get(n - 1).get(n - 1) == 0)
            return ans;

        boolean[][] vis = new boolean[n][n];
        helper(mat, 0, 0, "", ans, vis);
        return ans;
    }
}
