public class pallindreome{
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode findMiddle(ListNode head){
        // using the rabbit and turtle algo for jump 1 jump for turtle and 2 jump for rabbit
        ListNode rabbit = head;
        ListNode turtle = head;
        while(rabbit.next.next != null && rabbit.next != null){
            rabbit = rabbit.next.next;
            turtle = turtle.next;
        } 
        return turtle;
    }
    public ListNode reverse(ListNode head){
        if(head == null|| head.next == null){
            return head;
        }
        ListNode newhead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) { //checking that it if the LL has no element or only one element
            return true;
        }
        ListNode middle = findMiddle(head); // it will tell the first halfs end 
        ListNode secondhalfstart = reverse(middle.next); // we will revese this part of the linked list 
        // now lets compare 
        ListNode firsthalf = head;
        while (secondhalfstart != null) {
            if (firsthalf.val != secondhalfstart.val)
                return false;
            secondhalfstart = secondhalfstart.next;
            firsthalf = firsthalf.next;
        }
        return true;
    }
}

}