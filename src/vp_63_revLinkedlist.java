//IMPORTANT
//REVERSE THE LINKEDLIST
public class vp_63_revLinkedlist {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void printList(Node head){
        Node temp = head;

        while(temp != null){

            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void reverseLinkedlist(Node l1, Node l2){
        Node prev1 = null;
        Node curr1 = l1;
        Node next1;

        while(curr1 != null){
            next1 = curr1.next;
            curr1.next = prev1;
            prev1 = curr1;
            curr1 = next1;
        }

        Node prev2 = null;
        Node curr2 = l2;
        Node next2;

        while(curr2 != null){
            next2 = curr2.next;
            curr2.next = prev2;
            prev2 = curr2;
            curr2 = next2;
        }

        printList(prev1);
        printList(prev2);


    }
    public static void main(String[] args){
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);

        reverseLinkedlist(l1,l2);
    }
}
