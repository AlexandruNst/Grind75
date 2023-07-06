class Solution {

    // T: O(n + m)
    // S: O(1) we are just shifting the nodes, not creating new ones
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode res = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head.next = list1;
                head = head.next;
                list1 = list1.next;
            } else {
                head.next = list2;
                head = head.next;
                list2 = list2.next;
            }
        }

        if (list1 == null)
            head.next = list2;
        if (list2 == null)
            head.next = list1;

        return res.next;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }
    }
}

// Create a new head, attach whichever is smallest until one is null, then
// attach the other.
