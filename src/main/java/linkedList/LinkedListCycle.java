package linkedList;

public class LinkedListCycle {

    public static void main(String[] args) {

    }
    public static boolean hasCycle(ListNode head) {

        if(head==null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow!=fast){
            if(fast==null || fast.next==null){
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
