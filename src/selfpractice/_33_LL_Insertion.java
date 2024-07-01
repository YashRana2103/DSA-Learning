package selfpractice;

public class _33_LL_Insertion {

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

    public static Node convertArrToLL(int[] arr, int n) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < n; i++) {
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
        int[] arr = {2, 7, 15, 5};
//        int[] arr = {2};
        Node head = convertArrToLL(arr, arr.length);
//        Node head = null;

        head = insertAtHead(head, 999);
        print(head);
    }

    public static Node insertAtHead(Node head, int num) {
        if(head == null) return new Node(num);
        return new Node(num, head);
    }

}
