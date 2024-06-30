package tuf;

public class _38_DLL_Insertion {

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

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 8, 9, 2, 10};
        Node head = convertArrToDLL(arr);

//        head = insertAtHead(head, 134);
        head = insertAtTail(head, 134);
        print(head);
    }

    public static Node insertAtHead(Node head, int num) {
        if(head == null) return new Node(num);
        Node newNode = new Node(null, num, head);
        head.prev = newNode;
        head = newNode;
        return head;
    }

    public static Node insertAtTail(Node head, int num) {
        if(head == null) return new Node(num);
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        temp.next = new Node(temp, num, null);
        return head;
    }
}
