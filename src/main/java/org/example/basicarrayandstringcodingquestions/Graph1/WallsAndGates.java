package org.example.basicarrayandstringcodingquestions.Graph1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class WallsAndGates {
    public static void wallsAndGates(int[][] rooms) {
         int rows = rooms.length;
         int cols = rooms[0].length;
        Queue<int []>  queue = new LinkedList<>();

         for(int i  =0; i< rows; i++){
              for(int j  =0; j< cols  ; j++){
                  if(rooms[i][j] ==0){
                      queue.add(new int  [] {i,j});
                  }
              }
         }
         while(!queue.isEmpty()){
             int []  current  = queue.poll();
             int x = current[0];
             int y  = current[1];
             int currentDis  = rooms[x][y];

             if(x-1>=0 &&  rooms[x-1][y]  == Integer.MAX_VALUE ){
                 rooms[x-1][y]  = currentDis+1;
                  queue.add(new int [] {x-1,y});
             }
             if(x+1<rows &&  rooms[x+1][y]  == Integer.MAX_VALUE ){
                 rooms[x+1][y]  = currentDis+1;
                 queue.add(new int [] {x+1,y});
             }
             if(y-1>=0 &&  rooms[x][y-1]  == Integer.MAX_VALUE ){
                 rooms[x][y-1]  = currentDis+1;
                 queue.add(new int [] {x,y-1});
             }
             if(y+1<cols &&  rooms[x][y+1]  == Integer.MAX_VALUE ){
                 rooms[x][y+1]  = currentDis+1;
                 queue.add(new int [] {x,y+1});
             }
         }
    }

    public static void main(String[] args) {
        int INF = Integer.MAX_VALUE;
        int[][] rooms = {
                {INF, -1, 0, INF},
                {INF, INF, INF, -1},
                {INF, -1, INF, -1},
                {0, -1, INF, INF}
        };

        wallsAndGates(rooms);

        for (int[] row : rooms) {
            System.out.println(Arrays.toString(row));
        }
    }
}
