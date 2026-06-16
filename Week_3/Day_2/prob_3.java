class Solution {

    // Step 1: Find middle
    public ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // middle node
    }

    // Step 2: Reverse linked list
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // store next
            curr.next = prev;         // reverse link 🔥
            prev = curr;              // move prev
            curr = next;              // move curr
        }

        return prev; // new head
    }

    // Main function
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        // 1. Find mid
        ListNode mid = findMid(head);

        // 2. Reverse second half
        ListNode right = reverse(mid);
        ListNode left = head;

        // 3. Compare both halves
        while (right != null) {
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }
}
