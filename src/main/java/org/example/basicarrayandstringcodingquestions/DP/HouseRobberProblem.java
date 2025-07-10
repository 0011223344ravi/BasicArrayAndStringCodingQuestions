package org.example.basicarrayandstringcodingquestions.DP;

public class HouseRobberProblem {

    public static int rob(int nums []){

     int n  = nums.length;
      if(n==0) return  0;
      if(n==1) return nums[0];
     int dp []  = new int [n+1];
      dp[0]  = nums[0];
      dp[1] = nums[1];
       for(int i =2; i <n ; i++){
            dp[i]  = Math.max(dp[i-1] , nums[i] + dp[i-2]);
       }
        return dp[n-1];
    }

    public static void main(String[] args) {
        int arr  [] ={2, 7, 9, 3, 1};
        int ans =rob(arr);
        System.out.println(ans);
    }
}
