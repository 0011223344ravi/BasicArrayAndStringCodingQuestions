package org.example.basicarrayandstringcodingquestions.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthMaxAndMinElement {

     public static List<Integer> kthMaxAndMin(int arr [] , int k){

         Arrays.sort(arr);
         List<Integer>  ans  = new ArrayList<>();
         ans.add(arr[k-1]);
          ans.add(arr[arr.length-k]);
          return  ans ;
     }

    public static void main(String[] args) {
        int arr [] = {-10,1,2,3,4,5,6,7,8,9};
      List<Integer> ans  =  kthMaxAndMin(arr, 3);
        System.out.println(ans);
    }
}
