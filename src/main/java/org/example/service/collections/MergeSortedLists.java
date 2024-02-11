package org.example.service.collections;

public class MergeSortedLists {

    public ListNode mergeSortedLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        // If one list is longer than the other
        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            current.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // Example usage
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);
        list2.next.next.next = new ListNode(8);
        list2.next.next.next.next = new ListNode(10);
        list2.next.next.next.next.next = new ListNode(12);


        MergeSortedLists merger = new MergeSortedLists();
        ListNode result = merger.mergeSortedLists(list1, list2);

        // Print the merged list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

