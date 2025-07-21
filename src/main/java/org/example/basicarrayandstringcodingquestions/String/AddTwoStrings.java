package org.example.basicarrayandstringcodingquestions.String;

public class AddTwoStrings {
     public  static  String addTwoString(String str1 , String str2 ){

          StringBuffer sum = new StringBuffer("");
           int carry  =0;
           for(int i = str1.length()-1; i>=0 ; i--){
               int temp = Integer.parseInt(String.valueOf(str1.charAt(i))) +
               Integer.parseInt(String.valueOf(str2.charAt(i))) + carry;
               sum  = sum.append(""+temp %10);
               carry = temp/10;
           }
           sum.append(carry+"");
         return   sum.reverse().toString();
     }

    public static void main(String[] args) {
         String str1  = "999";
         String str2  = "001";

         String ans  =addTwoString(str1, str2);
        System.out.println(ans);

    }
}
