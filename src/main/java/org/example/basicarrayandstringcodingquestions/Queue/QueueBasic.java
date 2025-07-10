package org.example.basicarrayandstringcodingquestions.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.poll(); // removes 1
        int front = queue.peek(); // 2

        System.out.println(" front is" + front);
    }
}
