package org.example.service.collections;

public class LinkedListCycleDetection {

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle if the list is empty or has only one node
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;        // Move slow pointer by one step
            fast = fast.next.next;   // Move fast pointer by two steps

            if (slow == fast) {
                return true;  // Cycle detected
            }
        }

        return false;  // No cycle found
    }

    public static void main (String [] args){
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next= head.next;

        boolean hasCycle = hasCycle(head);
        System.out.println("Does the linked list have a cycle? " + hasCycle);
    }

}


