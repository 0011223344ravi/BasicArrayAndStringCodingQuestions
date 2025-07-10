package org.example.basicarrayandstringcodingquestions.LinkedList;

public class DetectCycle {
     public static boolean hasCycle(Node head){

         Node slow  = head;
         Node fast = head;

         while(fast !=null && fast.next !=null){
             slow  = slow.next;
             fast = fast.next.next;
              if(fast ==slow) return true;
         }
          return  false;
     }

    public static Node createListWithCycle(boolean cycle) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        if (cycle) {
            // connect last node to node 2 (cycle)
            head.next.next.next.next.next = head.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Node listWithCycle = createListWithCycle(true);
        System.out.println("Has Cycle: " + hasCycle(listWithCycle)); // true

        Node listWithoutCycle = createListWithCycle(false);
        System.out.println("Has Cycle: " + hasCycle(listWithoutCycle)); // false
    }
}
