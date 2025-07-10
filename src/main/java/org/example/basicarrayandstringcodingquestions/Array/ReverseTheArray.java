package org.example.basicarrayandstringcodingquestions.Array;

import java.util.List;

public class ReverseTheArray {
   public static int [] reversedArray(int arr []){
      int [] reversedArray  = new int [arr.length];
       int  j  =0;
      for(int i  = arr.length -1; i>=0; i--){
           reversedArray[j]  = arr[i];
           j++;
       }
       return  reversedArray;
    }

    public static void main(String[] args) {
        int arr [] = {-10,1,2,3,4,5,6,7,8,9};
        int ans  [] = reversedArray(arr);
     for (int i=0; i< ans.length; i++){
         System.out.println(ans[i]);
        }
    }
}
