package org.example.basicarrayandstringcodingquestions.Array;

public class MergeTwoSortedArray {

    public static int []  merge(int arr1  [] , int arr2[]){

       int arr []  = new int [arr1.length + arr2.length];
       for (int i  =0; i< arr1.length; i ++){
            arr[i]  = arr1[i];

       }
        for(int i  =0; i< arr2.length ; i++){
            arr[arr1.length+i]  = arr2[i];
        }
         return  arr ;
     }

    public static void main(String[] args) {
        int arr1  []  = {1,2,3,4};
        int arr2  []  = {5,6,7,8};
         int ans  []  = merge(arr1,arr2);
         for(int n : ans){
             System.out.println(n);
         }
    }

}
