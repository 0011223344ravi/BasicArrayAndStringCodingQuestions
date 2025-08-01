package org.example.basicarrayandstringcodingquestions.DP;

public class CostOfClimbing {
     public  static  int costOfClimbing(int cost[]){
    int n  = cost.length;
    int dp[]  = new int [n+1];
     dp[0]  = 0;
     dp[1] = 0;

       for(int i  =2; i<= n ;  i++){

           dp[i] = Math.min(dp[i-1]+cost[i-1] , dp[i-2] + cost[i-2]);
       }
        return dp[n];
     }

    public static void main(String[] args) {
        int arr  [] = {10, 15, 20};
       int ans  =  costOfClimbing(arr);
        System.out.println(ans);
    }
}
