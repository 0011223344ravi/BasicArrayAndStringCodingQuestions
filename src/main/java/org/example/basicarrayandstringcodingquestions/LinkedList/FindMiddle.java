package org.example.basicarrayandstringcodingquestions.LinkedList;

public class FindMiddle {

    public static Node  findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // 1 step
            fast = fast.next.next;    // 2 steps
        }

        return slow; // Middle node
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

    public static void main(String[] args) {
        Node head = createSampleList(new int[]{1, 2, 3, 4, 5});
        Node mid = findMiddle(head);
        System.out.println("Middle Node: " + mid.value);

        Node head2 = createSampleList(new int[]{1, 2, 3, 4, 5, 6});
        Node mid2 = findMiddle(head2);
        System.out.println("Middle Node: " + mid2.value);
    }
}
