package org.example.basicarrayandstringcodingquestions.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class NoOFIslands {

      public static  int noOfIslands(int grid [] []  ){
           if(grid ==null || grid.length ==0)return 0;

           int row  = grid.length;
           int col  = grid[0].length;
           int count =0;
           for(int i  =0; i< row; i++){
               for(int j =0; j<col;j++){
                    if(grid[i][j] == 1){

                         dfs1(grid,i,j);
                         count ++;
                    }
               }
           }
           return count ;
      }

     public static void dfs1(int grid  [][] , int i, int j){

                if(i<0 || j<0 || i>=grid.length|| j>=grid[0].length|| grid[i][j]==0){
                     return;
                }

                grid[i][j]=0;
                dfs1(grid ,i+1,j);
                dfs1(grid,i-1,j);
                dfs1(grid,i,j+1);
                dfs1(grid,i,j-1);

      }
     public static void dfs(int grid  [][]  , int start , boolean visited []){

          visited[start] = true ;

          System.out.println("node "+ start);
          for(int neighbor =0; neighbor< grid.length; neighbor++){
               if(grid[start][neighbor] ==1 && !visited[neighbor]){
                    dfs(grid,neighbor, visited);
               }
          }
     }

      public static void bfs(int grid[][] , int start ){
          int n  = grid.length;
          boolean visited[]  = new boolean[n];
           Queue<Integer> q = new LinkedList<>();
           visited[start]  = true ;
           q.offer(start);

           while(!q.isEmpty()){
                int current  = q.poll();
                System.out.println("node "+current);
                for(int neighbor  =0; neighbor< grid[0].length; neighbor++){

                     if(grid[current][neighbor] ==1 && !visited[neighbor]){
                          visited[neighbor] = true ;
                          q.offer(neighbor);
                     }
                }
           }
      }

     public static void main(String[] args) {
          int [][] adjMatrix  ={ {0, 1, 0, 0, 1},
                  {1, 0, 1, 1, 1} ,
                  {0 ,1, 0, 1, 0},
                  {0, 1, 1, 0, 1},
                  {1, 1, 0, 1, 0} };

         // bfs(adjMatrix,0);

          System.out.println("...............");
          boolean visited [] = new boolean[adjMatrix.length];
        //  dfs(adjMatrix,0,visited);

          int[][] grid = {
                  {1, 1, 0, 0, 0},
                  {1, 1, 0, 0, 0},
                  {0, 0, 1, 0, 0},
                  {0, 0, 0, 1, 1}
          };

         int ans  = noOfIslands(grid);
          System.out.println(ans);
     }
}
