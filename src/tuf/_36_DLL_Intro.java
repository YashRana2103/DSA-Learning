package tuf;

public class _36_DLL_Intro {

    static class Node {
        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.prev = null;
            this.data = data;
            this.next = null;
        }

        Node(Node prev, int data) {
            this.prev = prev;
            this.data = data;
            this.next = null;
        }

        Node(Node prev, int data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 6, 2, 9};
        Node head = convertArrToDLL(arr);
        print(head);
    }

    public static Node convertArrToDLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            mover.next = new Node(mover, arr[i]);
            mover = mover.next;
        }
        return head;
    }

    public static void print(Node head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
