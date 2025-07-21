package org.example.basicarrayandstringcodingquestions.LinkedList;

public class FindLengthOfLinkedLIst {
    private Node head;
   public static  int findLength(Node head){
        int count =0;
         if(head==null)
              return count;
        while(head.next !=null){
            head= head.next;
            count++;
        }
        return count;
   }
   public static Node createLinkedList(){
        Node n  = new Node(10);
        n.next = new Node(20);
        n.next.next = new Node(30);
        n.next.next.next  = new Node(40);
         return n;
   }
    public static void main(String[] args) {

   Node head =createLinkedList();
   int length  = findLength(head);
        System.out.println(length);
    }
}
