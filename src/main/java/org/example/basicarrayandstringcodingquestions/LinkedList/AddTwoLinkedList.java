package org.example.basicarrayandstringcodingquestions.LinkedList;

public class AddTwoLinkedList {


    public static Node addTwoLinkedList(Node a , Node b){
        int sum =0;
        int carry   =0;
        Node Ra = reverseLinkedList(a);
        Node Rb  = reverseLinkedList(b);
         Node dummy = new Node(-1);
         Node result = dummy;

         while(Ra!=null || Rb!=null){
             int temp  = Ra.value + Rb.value + carry;
             result.next = new Node(temp%10);
              carry = temp/10;
              Ra =Ra.next;
              Rb  = Rb.next;
             result = result.next;
         }


         if(carry!=0){
             result.next=new Node(carry);
         }
         Node ans  = reverseLinkedList(dummy.next);
    return  ans;
     }

    public static Node reverseLinkedList(Node head){
          Node prev = null;

          while(head !=null){
              Node nextNode = head.next;
              head.next = prev;
              prev  = head;
              head = nextNode;
          }
        return prev;
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
         Node a = createSampleList(new int[]{9, 9,9});
         Node b = createSampleList(new int[]{0,0,1});
         Node ans = addTwoLinkedList(a,b);
         printList(ans);
    }
}
