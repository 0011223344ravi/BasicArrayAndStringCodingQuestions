package org.example.basicarrayandstringcodingquestions.Graph1;

import java.util.ArrayList;
import java.util.List;

public class PacificAtlantic {
    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
         int rows = heights.length;
         int cols = heights[0].length;
         boolean [][]  pacific = new boolean[rows][cols];
         boolean [][]   atlantic  = new boolean[rows][cols];
         //top left
          for(int i =0; i< rows; i++){
              dfs(heights,pacific,i,0,heights[i][0]);
          }
        for(int i =0; i< cols; i++){
            dfs(heights,pacific,0,i,heights[0][i]);
        }
        //bottom right
        for(int i =0; i< cols; i++){
            dfs(heights,atlantic,rows-1,i,heights[rows -1][i]);
        }
        for(int i =0; i< rows; i++){
            dfs(heights,atlantic,i,cols-1,heights[i][cols-1]);
        }

         List<List<Integer>> ans = new ArrayList<>();
         for(int i =0; i< rows; i++){
             for(int j =0; j< cols; j++){
                 if(pacific[i][j] && atlantic[i][j]){
                     List<Integer> al = new ArrayList<>();
                     al.add(i);
                     al.add(j);
                     ans.add(al);
                 }

             }
         }
         return ans;
    }
     public static void dfs(int [][] heights , boolean [][] visited , int i , int j , int previousHeight){

         if(i<0 || j<0 || i>=heights.length || j>= heights[0].length){
             return;
         }
         if( visited[i][j]||heights[i][j]<previousHeight){
             return;
         }
         visited[i][j] =true;
         dfs(heights, visited, i - 1, j, heights[i][j]);
         dfs(heights, visited, i , j-1, heights[i][j]);
         dfs(heights, visited, i +1, j, heights[i][j]);
         dfs(heights, visited, i , j+1, heights[i][j]);

     }

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
