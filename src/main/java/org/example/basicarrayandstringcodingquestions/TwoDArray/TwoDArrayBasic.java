package org.example.basicarrayandstringcodingquestions.TwoDArray;

public class TwoDArrayBasic {



         public static void print2dArray(int  arr[][]){

               for(int i  =0; i< arr.length ; i++){
                   for (int j =0; j<arr[0].length; j++){
                       System.out.print(arr[i][j]+" ");
                   }
                   System.out.println();
               }
         }

    public static void main(String[] args) {
        int arr  [][] ={{1,1,1},{1,0,0},{0,0,1}};
        print2dArray(arr);
    }
}
