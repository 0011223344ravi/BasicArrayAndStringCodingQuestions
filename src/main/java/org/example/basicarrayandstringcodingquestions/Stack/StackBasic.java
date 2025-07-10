package org.example.basicarrayandstringcodingquestions.Stack;

import java.util.Stack;

public class StackBasic {

    public static void main(String[] args) {
        Stack<Integer>  st = new Stack<>();
        st.push(10);
        st.push(20);
        st.pop();
        int top = st.peek();
        System.out.println("top is " + top);
    }
}
