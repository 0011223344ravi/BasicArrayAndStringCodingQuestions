package org.example.basicarrayandstringcodingquestions.PrefixSum;

public class PrefixSumExample {

    public static int[] computePrefixSum(int[] arr) {

        int prefixSum  []  = new int [arr.length];
         prefixSum[0]  = arr[0];
        for(int i =1; i< arr.length; i++){
             prefixSum[i]  =  prefixSum[i-1] + arr[i];
        }
         return prefixSum;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 1, 3};
        int[] prefix = computePrefixSum(arr);

        // Print the prefix sum array
        for (int sum : prefix) {
            System.out.print(sum + " ");
        }
    }
}
