package org.example.basicarrayandstringcodingquestions.Array;

public class PushAll0ToEnd {

     public static void push0toEnd(int arr[]){

          int i  = 0;
          int j  = arr.length-1;
          while(i<j){

               if(arr[j] ==0){
                  j--;
              }
              if(arr[i]!=0){
                  i++;
              }
               else if (arr[i] ==0 ){
                   int temp = arr[j];
                   arr[i] = temp;
                   arr[j]  = 0;
                   i++;
                   j--;
              }

          }

     }

    public static void main(String[] args) {
        int arr  []  = {1,2,3,0,1,2,0,5,6,2,0};
         push0toEnd(arr);
         for(Integer i : arr){
             System.out.print(i +" ");
         }
    }

}
