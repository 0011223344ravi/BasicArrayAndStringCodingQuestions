package org.example.basicarrayandstringcodingquestions.Queue;

import java.util.PriorityQueue;

public class KthLargestElement {

     public static int kthLargestElement(int arr [], int k){
         PriorityQueue<Integer> priorityQueue  = new PriorityQueue<>();
      for(int n : arr){
             priorityQueue.offer(n);
             if(priorityQueue.size()>k){
                priorityQueue. poll();
             }
      }
       return priorityQueue.peek();
     }

    public static void main(String[] args) {
        int arr  []  = {7,2,3,5,2,4,6};
        int ans =kthLargestElement(arr, 2);
        System.out.println(ans);

    }

}
