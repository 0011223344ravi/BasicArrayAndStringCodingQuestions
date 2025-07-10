package org.example.basicarrayandstringcodingquestions.Array;

import java.util.ArrayList;
import java.util.List;

public class FindMaxAndMinElement {

      public static List<Integer>  getMaxAndMin(int arr[]){
          List<Integer>  maxMin  =new ArrayList<>();
          int min  =Integer.MAX_VALUE;
          int max  = Integer.MIN_VALUE;
          for(int i =0; i< arr.length  ; i++){
             if(arr[i]<min){
                 min =  arr[i];
             }
              if(arr[i]>max){
                  max = arr[i];
              }
          }
          maxMin.add(min);
          maxMin.add(max);
          return maxMin;
      }
    public static void main(String[] args) {
    int arr [] = {-10,1,2,3,4,5,6,7,8,9};
       List<Integer>  ans = getMaxAndMin(arr);
        System.out.println(ans);
    }
}
