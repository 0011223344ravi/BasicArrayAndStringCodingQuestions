package org.example.basicarrayandstringcodingquestions.Graph1;

import java.util.LinkedList;
import java.util.Queue;

public class GraphBasics {

    public static void bfs(int [][] grid, int [] start , int [] end ){

        int rows = grid.length;
        int cols  = grid[0].length;
        boolean[][] visited  = new boolean[rows][cols];
        Queue<int [] > queue  = new LinkedList<>();
        queue.add(start);
        visited[start[0]][start[1]] = true;

        while(!queue.isEmpty()){
            int current  [] = queue.poll();
             int row  = current[0];
             int col  = current[1] ;
            System.out.println("visiting node "+ "["+current[0]+"," +current[1]+"]" );

             if(current[0] == end[0] && current[1]==end[1]){
                 System.out.println("Found the end "+"["+current[0]+"," +current[1]+"]");
                 return;
             }
            if(row-1 >=0 && !visited[row-1][col] && grid[row-1][col]!=1){
                queue.add(new int []{row-1,col});
                visited[row-1 ][col] = true;
            }

             if(row+1 <rows && !visited[row+1][col] && grid[row+1][col]!=1){
                  queue.add(new int []{row+1,col});
                 visited[row+  1][col] = true;

             }
            if(col-1 >=0 && !visited[row][col-1] && grid[row][col-1]!=1){
                queue.add(new int []{row,col-1});
                visited[row][col-1] = true;
            }
            if(col+1 <cols && !visited[row][col+1] && grid[row][col+1]!=1){
                queue.add(new int []{row,col+1});
                visited[row][col+1] = true;
            }


        }

        System.out.println("end not reachable");
    }

     public static  void dfs(int grid [][] , int start [] , int end[] ){

         int rows  = grid.length;
         int cols  = grid[0].length;
         int row  = start[0];
          int col = start[1];
           boolean [][] visited  = new boolean[rows][cols];
         if(dfsHelper(grid,visited,row,col,end)){
             System.out.println("path exist");
         }
         else{
             System.out.println("no path");

         }
     }
     public static boolean dfsHelper(int [][] grid , boolean[][] visited , int row , int col, int [] end){

        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length||visited[row][col]|| grid[row][col]==1){
            return false;
        }
         System.out.println("visiting node "+ "["+row+"," +col+"]" );
        if(row == end[0] && col==end[1]){
            System.out.println("reached at end ");
            return  true ;
        }
         visited[row][col] = true;
       return dfsHelper(grid,visited,row-1,col,end)||
         dfsHelper(grid,visited,row+1,col,end)||
         dfsHelper(grid,visited,row,col-1,end)||
         dfsHelper(grid,visited,row,col+1,end);

     }


    public static void main(String[] args) {


        int[][] grid = {
                {0, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 0, 0, 0},
                {1, 1, 1, 0}
        };
        int[] start = {0, 0}; // S at (0, 0)
        int[] end = {3, 3};   // E at (3, 3)

        bfs(grid, start, end);
        System.out.println(".....................");
        dfs(grid,start,end);
    }
}
