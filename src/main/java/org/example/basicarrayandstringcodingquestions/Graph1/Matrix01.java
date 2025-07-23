package org.example.basicarrayandstringcodingquestions.Graph1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Matrix01 {

    public static int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    result[i][j] = 0;
                } else {
                    result[i][j] = bfs(mat, i, j);
                }
            }
        }

        return result;
    }
    public static int bfs(int[][] mat, int startRow, int startCol) {
        int m = mat.length, n = mat[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { startRow, startCol });
        visited[startRow][startCol] = true;
        int distance = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            distance++;

            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int r = curr[0], c = curr[1];

                // Check all 4 directions
                if (r > 0 && !visited[r - 1][c]) {
                    if (mat[r - 1][c] == 0) return distance;
                    visited[r - 1][c] = true;
                    queue.offer(new int[] { r - 1, c });
                }

                if (r < m - 1 && !visited[r + 1][c]) {
                    if (mat[r + 1][c] == 0) return distance;
                    visited[r + 1][c] = true;
                    queue.offer(new int[] { r + 1, c });
                }

                if (c > 0 && !visited[r][c - 1]) {
                    if (mat[r][c - 1] == 0) return distance;
                    visited[r][c - 1] = true;
                    queue.offer(new int[] { r, c - 1 });
                }

                if (c < n - 1 && !visited[r][c + 1]) {
                    if (mat[r][c + 1] == 0) return distance;
                    visited[r][c + 1] = true;
                    queue.offer(new int[] { r, c + 1 });
                }
            }
        }

        return distance;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
       int ans  [][]=   updateMatrix(mat);
        for(int [] a: ans){
            System.out.println(Arrays.toString(a));
        }
    }
}
