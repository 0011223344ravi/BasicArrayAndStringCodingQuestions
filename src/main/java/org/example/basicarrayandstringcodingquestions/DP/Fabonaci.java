package org.example.basicarrayandstringcodingquestions.DP;

public class Fabonaci {

     // bottom up approach

    public static  int fab(int n ){
        if(n<=1)
             return n;
        int dp []  = new int [n+1];
        dp[0]  =0;
        dp[1]  =1;
        for(int i =2;  i<=n ; i++){

            dp[i]  = dp[i-1] + dp[i-2];
        }
         return dp[n];
    }

    public static void main(String[] args) {
        System.out.println("fab of 4 is " + fab(4));
         // 0,1,1,2,3
    }
}
