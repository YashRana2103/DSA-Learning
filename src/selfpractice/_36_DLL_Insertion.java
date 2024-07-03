package selfpractice;

public class _36_DLL_Insertion {
    
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
        int[] arr = {3, 5, 6, 9, 10, 14, 20};
//        int[] arr = {3};
        Node head = convertArrToDLL(arr);
//        Node head = null;

        head = insertAtHead(head, 69);
//        head = insertAtTail(head, 134);
//        head = insertBeforeTail(head, 134);
//        head = insertAtPosition(head, 134, 7);
//        head = insertBeforeNode(head, 134, head.next);
        print(head);
    }

    public static Node insertAtHead(Node head, int num) {
        if(head == null) return new Node(num);
        head.prev = new Node(null, num, head);
        head = head.prev;
        return head;
    }
}
