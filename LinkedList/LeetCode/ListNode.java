
public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    class Solution {

        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode curr = head;
            int size = 0;
            while(curr.next != null){
                size++;
            }
            ListNode prev = head;
            curr = head.next;
            for(int i = 0 ; i<size ; i++){
                curr = curr.next;
                prev = prev.next;
            }
            prev.next = curr.next;
            
        }
    }
}
