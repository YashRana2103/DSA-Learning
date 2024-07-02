package selfpractice;

public class _35_DLL_Deletion {

    static class Node{
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

    public static Node convertArrToDLL(int[] arr, int n) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < n; i++) {
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

    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 9, 10, 14, 20};
        Node head = convertArrToDLL(arr, arr.length);

        head = deleteHead(head);
        print(head);
    }

    public static Node deleteHead(Node head) {
        if(head == null || head.next == null) return null;
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        return head;
    }
}
