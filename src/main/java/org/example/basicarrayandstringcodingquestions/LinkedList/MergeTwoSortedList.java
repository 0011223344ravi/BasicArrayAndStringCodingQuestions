package org.example.basicarrayandstringcodingquestions.LinkedList;

public class MergeTwoSortedList {

     public  static  Node mergeTwoSortedList(Node a, Node b){

         Node dummy  = new Node(-1);
         Node ans  =dummy;

          while(a!=null && b!=null) {
              if (a.value > b.value) {
                      ans.next = new Node(b.value);
                      b = b.next;
                  } else {
                      ans.next = new Node(a.value);
                      a = a.next;
                  }
                  ans = ans.next;
              }

          //appending left nodes

         while(a!=null){
              ans.next  = new Node(a.value);
              a= a.next;
              ans = ans.next;
         }

         while(b!=null){
             ans.next  = new Node(b.value);
             b= b.next;
             ans = ans.next;
         }
          return dummy.next ;
     }
    public static Node createSampleList(int[] arr) {
        Node dummy = new Node(-1);
        Node curr = dummy;
        for (int val : arr) {
            curr.next = new Node(val);
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void printList(Node head){
        Node current  = head;
        while(current !=null){
            System.out.println(current.value +" -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
         int arr  [] = {1,2,3};
         int arr1  []  = {4,5,6};
                        Node a  = createSampleList(arr);
                        Node b  = createSampleList(arr1);

                     Node merged  =   mergeTwoSortedList(a,b);
                     printList(merged);
    }
}
