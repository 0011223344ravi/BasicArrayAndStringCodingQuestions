package org.example.basicarrayandstringcodingquestions.Graph1;

public class NoOfISlands {
    public static  int noOfIslands(int [][] grid){
         int rows = grid.length;
         int cols  = grid[0].length;
         int count =0;
         for(int i  =0; i<rows; i++ ){
             for (int j =0; j< cols; j++){
                 if(grid[i][j] ==1){
                     count++;
                     dfs(grid,i,j);
                 }
             }
         }
          return count;
    }
     public static void dfs(int [][] grid , int i , int j){
          if(i<0 || i>=grid.length || j <0 || j>= grid[0].length|| grid[i][j] ==0){
              return;
          }
           grid[i][j]  =0;
          dfs(grid, i-1, j);
         dfs(grid, i+1, j); dfs(grid, i, j-1);
         dfs(grid, i, j+1);


     }

    public static void main(String[] args) {
        int [][] grid =  {
                {0, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 0, 0, 0},
                {1, 1, 1, 0}
        };
        int ans  = noOfIslands(grid);
        System.out.println("no of island " + ans);
    }
}
