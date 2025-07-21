package org.example.basicarrayandstringcodingquestions.Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthMinElement {
     public static  int findKthSmallestElement(int arr [] , int k){

         PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

           for(int n : arr){
               priorityQueue.offer(n);
               if(priorityQueue.size()>k){
                   priorityQueue.poll();
               }
           }
           return priorityQueue.peek();
     }

    public static void main(String[] args) {
        int arr [] = {8,2,3,4,7,5,6,1};
       int ans = findKthSmallestElement(arr,2);
        System.out.println(ans);
    }

}
