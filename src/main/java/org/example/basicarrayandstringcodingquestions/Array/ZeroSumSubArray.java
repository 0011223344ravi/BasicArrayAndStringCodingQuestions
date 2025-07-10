package org.example.basicarrayandstringcodingquestions.Array;

import java.util.HashSet;

public class ZeroSumSubArray {
     public static boolean hasZeroSumSubArray(int arr  []){

         HashSet <Integer>  hs  = new HashSet<>();
         int sum  =0;
         for (int n : arr){
              sum = sum+n;
              if(sum  ==0  || hs.contains(sum)){
                  return true ;
              }
               hs.add(n);
         }
         return  false;
     }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        System.out.println("Zero sum subarray exists: " + hasZeroSumSubArray(arr));
    }
}
