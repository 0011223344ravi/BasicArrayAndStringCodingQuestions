package org.example.basicarrayandstringcodingquestions.Recusrsion;

public class Fabonaci {
     public static int fabonaci(int n){
         if(n==0 || n==1)
             return 1;
         return fabonaci(n-1) + fabonaci(n-2);
     }

    public static void main(String[] args) {
        System.out.println(fabonaci(6));
    }
}
