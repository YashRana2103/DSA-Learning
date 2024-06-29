package tuf;

public class _34_LL_Deletion {
    static class Node {
        int data;
        Node next;
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 6, 9, 10, 3, 30};
        Node head = convertArrToLL(arr);
        print(head);
        System.out.println();

//        head = deleteAtHead(head);
//        head = deleteAtTail(head);
        head = deleteAtPosition(head, 5);
        print(head);
        System.out.println();
    }

    public static void print(Node head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node convertArrToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static Node deleteAtHead(Node head) {
        if(head == null) return head;
        head = head.next;
        return head;
    }

    public static Node deleteAtTail(Node head) {
        if(head == null || head.next == null) return null;
        Node temp = head;
        while(temp.next.next != null) temp = temp.next;
        temp.next = null;
        return head;
    }

    public static Node deleteAtPosition(Node head, int position) {
        if(head == null) return head;
        if(position == 1) return deleteAtHead(head);
        int len = lengthOfLL(head);
        if(position == len) return deleteAtTail(head);
        Node temp = head;
        Node prev = null;
        int cnt = 0;
        while(temp != null) {
            cnt++;
            if(cnt == position) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        if(cnt > position) return head;
        return head;
    }

    public static int lengthOfLL(Node head) {
        Node temp = head;
        int cnt = 0;
        while(temp != null) {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
}
