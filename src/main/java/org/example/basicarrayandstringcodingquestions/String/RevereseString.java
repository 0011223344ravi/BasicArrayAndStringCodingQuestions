package org.example.basicarrayandstringcodingquestions.String;

public class RevereseString {

    public static String reverseString(String str){
           String ans  = "";
          for(int  i =str.length()-1; i>=0; i--){
               ans  = ans  +str.charAt(i)  ;
          }
  return  ans ;
     }

    public static void main(String[] args) {
          String str = " abcd";
         String ans  = reverseString(str);
        System.out.println(ans );
    }
}
