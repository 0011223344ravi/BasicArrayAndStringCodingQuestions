package org.example.basicarrayandstringcodingquestions.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlantic {

    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        int m = heights.length;
        int n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        // DFS for Pacific (top row and left column)
        for (int i = 0; i < m; i++) {
            dfs(heights, pacific, i, 0, heights[i][0]);
        }
        for (int j = 0; j < n; j++) {
            dfs(heights, pacific, 0, j, heights[0][j]);
        }

        // DFS for Atlantic (bottom row and right column)
        for (int i = 0; i < m; i++) {
            dfs(heights, atlantic, i, n - 1, heights[i][n - 1]);
        }
        for (int j = 0; j < n; j++) {
            dfs(heights, atlantic, m - 1, j, heights[m - 1][j]);
        }

        // Add intersection cells to result
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }

        return result;
    }

    public static void dfs(int[][] heights, boolean[][] visited, int i, int j, int prevHeight) {
        int m = heights.length;
        int n = heights[0].length;

        // Out of bounds
        if (i < 0 || j < 0 || i >= m || j >= n)
            return;

        // Already visited or height is lower than previous cell
        if (visited[i][j] || heights[i][j] < prevHeight)
            return;

        visited[i][j] = true;

        // Move UP
        dfs(heights, visited, i - 1, j, heights[i][j]);
        // Move DOWN
        dfs(heights, visited, i + 1, j, heights[i][j]);
        // Move LEFT
        dfs(heights, visited, i, j - 1, heights[i][j]);
        // Move RIGHT
        dfs(heights, visited, i, j + 1, heights[i][j]);
    }

    // For testing
    public static void main(String[] args) {

        int[][] heights = {
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        };

        List<List<Integer>> result = pacificAtlantic(heights);
        for (List<Integer> cell : result) {
            System.out.println(cell);
        }
    }
}
