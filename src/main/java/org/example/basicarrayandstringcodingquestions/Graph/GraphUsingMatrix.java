package org.example.basicarrayandstringcodingquestions.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class GraphUsingMatrix {
    private int vertices ;
    private int [][] adjMatrix;

    public GraphUsingMatrix(int vertices) {
        this.vertices = vertices;
        this.adjMatrix = new int [vertices][vertices];
    }

    public void addEdge (int u , int v ){
        adjMatrix[u][v]  =1;
        adjMatrix[v][u] =1;
    }

      public void printMatrix(){
          System.out.println("adjacency matrix");
          for(int i =0; i< vertices; i++){
              for (int j =0; j<vertices; j++){

                  System.out.print(adjMatrix[i][j]+" ");
              }
              System.out.println();

          }
    }

    public static void bfs(int [][] matrix , int start){

        int n = matrix.length;
        boolean[] visited  =  new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        visited[start] = true ;
// 1, 0, 1, 1, 1
         while(!queue.isEmpty()){

             int node = queue.poll();
             System.out.println(node +" ");
              for(int i =0; i< n; i++){

                  if(matrix[node][i] ==1 && !visited[i]){
                    queue.offer(i);
                    visited[i] = true;
                  }
              }

         }

    }

     public static  void dfs(int adjMatrix [][] , boolean[] visited , int node){
        visited[node]  = true ;
         System.out.println(" "+node);
          for(int i =0; i< adjMatrix.length; i++){
              if(adjMatrix[node][i] ==1 &&!visited[i]){
                  dfs(adjMatrix,visited,i);
              }
          }
     }

    public static void main(String[] args) {
        GraphUsingMatrix graph = new GraphUsingMatrix(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printMatrix();

        int [][] adjMatrix  ={ {0, 1, 0, 0, 1},
                {1, 0, 1, 1, 1} ,
                {0 ,1, 0, 1, 0},
                {0, 1, 1, 0, 1},
                {1, 1, 0, 1, 0} };
       // bfs(adjMatrix,1);
        boolean [] visited = new boolean[adjMatrix.length];
        dfs(adjMatrix,visited,0);
    }
}

