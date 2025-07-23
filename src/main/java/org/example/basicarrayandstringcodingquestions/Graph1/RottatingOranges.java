package org.example.basicarrayandstringcodingquestions.Graph1;

import java.util.LinkedList;
import java.util.Queue;

public class RottatingOranges {
    public static int  orangesRotting(int[][] grid) {
     int rows  = grid.length;
      int cols = grid[0].length;
        int time =0;
         int fresh =0;
        Queue<int []>  queue = new LinkedList<>();
      for(int i  =0; i< rows ; i++){
          for(int j =0; j< cols; j++){
               if(grid[i][j] ==1){
                   fresh ++;
               }
               if(grid[i][j] ==2){
                 queue.add(new int [] {i,j});
               }
          }
      }
       while(!queue.isEmpty() && fresh>0){
           int size  = queue.size();
            for(int i  =0; i< size; i++){
                int [ ] rottenOrage  = queue.poll();
                int x = rottenOrage[0];
                int y = rottenOrage[1];
                if(x-1>0&& grid[x-1][y] ==1){
                    grid[x-1][y]  =2;
                    queue.add(new int [] {x-1,y});
                    fresh--;
                }
                if(x+1<rows&& grid[x+1][y] ==1){
                    grid[x+1][y]  =2;
                    queue.add(new int [] {x+1,y});
                    fresh--;
                }
                if(y-1>0&& grid[x][y-1] ==1){
                    grid[x][y-1]  =2;
                    queue.add(new int [] {x,y-1});
                    fresh--;
                }
                if(y+1<cols&& grid[x][y+1] ==1){
                    grid[x][y+1]  =2;
                    queue.add(new int [] {x,y+1});
                    fresh--;
                }
            }
            if(!queue.isEmpty()) time++;
       }

        return fresh == 0 ? time : -1;
    }

    public static void main(String[] args) {
        int[][] grid1 = {
                {2,1,1},
                {1,1,0},
                {0,1,1}
        };
       int ans =   orangesRotting(grid1);
        System.out.println(ans);
    }
}
