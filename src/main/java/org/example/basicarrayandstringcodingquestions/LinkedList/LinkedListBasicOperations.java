package org.example.basicarrayandstringcodingquestions.LinkedList;

public class LinkedListBasicOperations {

    private Node head;

    public void insertAtEnd(int value ){

        Node newNode  = new Node(value);
         if(head == null  ){
              head  = newNode;
              return;
         }
          Node current =  head;
          while(current.next != null){
              current =current.next;
          }
           current.next = newNode;
    }


    public void deleteNode(int value){

          if(head ==null){
              return;
          }
          if(head.value== value){
               head=head.next  ;
               return;
          }
           Node current  = head;
        while (current.next != null && current.next.value != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }

    }

     public void printList(){
        Node current  = head;
         while(current !=null){
             System.out.println(current.value +" -> ");
             current = current.next;
         }
         System.out.println("null");
     }
     public void deleteSpecificIndex(int index){
           if(head  ==null || index<0)
           {
               return;
           }
   // case 1  : delete head node

          if(index ==0){
               head  = head.next;
               return;
          }
          //traverse the node before one to delete
         Node current  = head;
         for(int i =0; current.next !=null && i <index-1 ; i++){
             current = current.next;
         }

         // if index is invalid and next is null then do nothing

         if(current ==null || current.next ==null){
             return;
         }
         current.next = current.next.next;
      }

    public static void main(String[] args) {
        LinkedListBasicOperations list = new LinkedListBasicOperations();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.print("Initial List: ");
        list.printList();  // 10 → 20 → 30 → 40 → null

        list.deleteNode(20);
        System.out.print("After deleting 20: ");
        list.printList();  // 10 → 30 → 40 → null

        list.insertAtEnd(50);
        System.out.print("After inserting 50: ");
        list.printList();  // 10 → 30 → 40 → 50 → null

        list.deleteSpecificIndex(0);
        System.out.print("After deleting index 0: ");
        list.printList();

       // System.out.println("Length of list: " + list.getLength()); // 4
    }

}
