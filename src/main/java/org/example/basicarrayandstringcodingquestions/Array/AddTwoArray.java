package org.example.basicarrayandstringcodingquestions.Array;

public class AddTwoArray {
      public static int[] addTwoArray(int arr  [] , int arr1[]){
          int ans  [] = new int [arr.length +1];
           int carry  = 0;
           for(int i  =arr.length-1; i>=0; i--){
               int temp  =  arr[i] + arr1[i] + carry;
                 ans[i]  = temp%10;
                  carry = temp/10;
           }
           ans[0]  = carry;
            return  ans  ;
    }

    public static void main(String[] args) {
        int [] arr  = {9,9,9};
         int [] arr1  = {0,0,1};
       int [] ans =  addTwoArray(arr, arr1);
        for(int i  : ans){
            System.out.println(i);
        }

    }
}
