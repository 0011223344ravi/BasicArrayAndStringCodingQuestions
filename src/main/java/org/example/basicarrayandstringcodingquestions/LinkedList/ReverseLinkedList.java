package org.example.basicarrayandstringcodingquestions.LinkedList;

public class ReverseLinkedList {

    public static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nextTemp = curr.next; // save next node
            curr.next = prev;              // reverse link
            prev = curr;                   // move prev to curr
            curr = nextTemp;               // move curr ahead

        }

        return prev; // new head
    }
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.value + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static Node createSampleList() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        return head;
    }

    public static void main(String[] args) {
        Node head = createSampleList();
        System.out.print("Original List: ");
        printList(head);

        Node reversedIterative = reverseList(head);
        System.out.print("Reversed (Iterative): ");
        printList(reversedIterative);

    }
}
