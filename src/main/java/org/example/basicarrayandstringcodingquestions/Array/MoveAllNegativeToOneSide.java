package org.example.basicarrayandstringcodingquestions.Array;

public class MoveAllNegativeToOneSide {
     public static  void move(int arr[]){

           int i =0; int j   = arr.length-1;
           while(i<=j){
               if(arr[i] <0){
                   i++;
               }
                else if (arr[j]>=0){
                    j--;
               }
                else{
                    int temp = arr[i];
                    arr[i]  = arr[j] ;
                    arr[j]= temp;
                    i++;
                    j--;
               }
           }
     }

    public static void main(String[] args) {
        int arr  []  = {-1,2,3,5,3,-2,0,-3,-5,9};
        move(arr);
         for(int n : arr){
             System.out.println(n);
         }
    }
}
