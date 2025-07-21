package org.example.basicarrayandstringcodingquestions.Stack;

import java.util.Stack;

public class DailyTemperature {
    public static int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>(); // stores indices

        for (int i = 0; i < n; i++) {
            // Check if current temp is greater than temperature at top of stack
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }

            // Push current index to stack
            stack.push(i);
        }

        // Remaining stack elements will have 0 in answer (no warmer day)
        return answer;
    }
    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(temperatures);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
