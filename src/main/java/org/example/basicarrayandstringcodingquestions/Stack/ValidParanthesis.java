package org.example.basicarrayandstringcodingquestions.Stack;

import java.util.Stack;

public class ValidParanthesis {


    public static boolean isValid(String s) {
        Stack<Character>  st = new Stack<>();
       for(int i =0; i < s.length(); i++){
             if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i) =='['){
                  st.push(s.charAt(i));
             }
              else {
                   if(st.isEmpty())
                       return false;
                  Character top  =st.pop();
                  Character c  =s.charAt(i);
                   if( (c ==')' && top !='(') ||  (c =='}' && top !='{')||  (c ==']' && top !='['))
                       return false;
             }

       }
       return st.empty();
    }

    public static void main(String[] args) {
      //  System.out.println(isValid("()[]{}")); // true
      //  System.out.println(isValid("(]"));     // false
      //  System.out.println(isValid("{[]}"));
        System.out.println(isValid("]"));
    }

}
