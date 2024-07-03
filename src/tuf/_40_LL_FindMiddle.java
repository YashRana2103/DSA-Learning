package tuf;

// in even length return the second value

public class _40_LL_FindMiddle {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static Node convertArrToDLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void print(Node head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 7, 8, 9, 2, 10};
        Node head = convertArrToDLL(arr);
        print(head);
        System.out.println();

        Node middleNode = findMiddle(head);
        System.out.println(middleNode.data);
    }
    
    public static Node findMiddle(Node head) {
        int middleNodePosition = (length(head) / 2) + 1;
        Node temp = head;
        while(temp != null) {
            middleNodePosition--;
            if(middleNodePosition == 0) break;
            temp = temp.next;
        }
        return temp;
    }
    
    public static int length(Node head) {
        Node temp = head;
        int len = 0;
        while(temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }
}
