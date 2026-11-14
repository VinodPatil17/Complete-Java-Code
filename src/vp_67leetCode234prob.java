import java.util.LinkedList;

//LEETCODE PROBLEM NO = 234
public class vp_67leetCode234prob{
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int data){
            this.val = data;
            this.next = null;
        }
    }

    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static ListNode findMidList(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static boolean solution(ListNode head){
        if(head == null || head.next == null){
            return true;
        }

        ListNode middle = findMidList(head);
        ListNode secondHalf = reverse(middle.next);
        ListNode firstHalf = head;
        if(firstHalf.val != secondHalf.val){
            return false;
        }

        return true;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        // head.next = new ListNode(2);
        // head.next.next = new ListNode(1);
        System.out.println(solution(head));
    }
}