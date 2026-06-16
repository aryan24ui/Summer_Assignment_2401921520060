class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;
        ListNode slow = head;

        // fast ko n steps aage le jao
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // agar fast null ho gaya → first node delete
        if (fast == null) {
            return head.next;
        }

        // dono ko saath chalao
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // delete node
        slow.next = slow.next.next;

        return head;
    }
}
