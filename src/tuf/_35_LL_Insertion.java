package tuf;

public class _35_LL_Insertion {

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

    public static void main(String[] args) {
        int[] arr = {3, 5, 10, 9, 15, 20, 2, 33};
//        Node head = null;
        Node head = convertArrToLL(arr);
        print(head);
        System.out.println();

//        head = insertAtHead(head, 99);
//        head = insertAtTail(head, 99);
        print(head);
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

    public static void print(Node head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node insertAtHead(Node head, int num) {
        Node newNode = new Node(num, head);
        return newNode;
    }

    public static Node insertAtTail(Node head, int num) {
        Node newNode = new Node(num);
        if(head == null) {
            head = newNode;
            return head;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static Node insertAtPosition(Node head, int num, int pos) {
        return head;
    }
}
