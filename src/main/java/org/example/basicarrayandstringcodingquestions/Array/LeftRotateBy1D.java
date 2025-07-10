package org.example.basicarrayandstringcodingquestions.Array;

public class LeftRotateBy1D {
     public static void leftRotate(int arr  []){

          int n  = arr.length;
          int nth  = arr[n-1];
          arr[n-1]  = arr[0];

          for (int i  =0; i< arr.length-2 ; i++){
              arr[i]  = arr[i+1];
          }
           arr[arr.length-2] = nth;
     }

    public static void main(String[] args) {
        int arr  []  ={1,2,3,4,5};
        leftRotate(arr);
        for(int n  :arr){
            System.out.println(n);
        }
    }
}
