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

//        head = insertAtHead(head, 999);
//        head = insertAtTail(head, 999);
//        head = insertAtPosition(head, 999, 5);
//        head = insertBeforeElement(head, 999, 2);
        print(head);
    }

    public static Node insertAtHead(Node head, int num) {
        if(head == null) return new Node(num);
        return new Node(num, head);
    }

    public static Node insertAtTail(Node head, int num) {
        if(head == null) return new Node(num);
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        temp.next = new Node(num);
        return head;
    }

    public static Node insertAtPosition(Node head, int num, int k) {
        if(head == null) {
            if(k == 1) return new Node(num);
            else return null;
        }
        if(k == 1) return new Node(num, head);
        int cnt = 0;
        Node temp = head;
        while(temp != null) {
            cnt++;
            if(cnt == k - 1) {
                temp.next = new Node(num, temp.next);
                return head;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node insertBeforeElement(Node head, int num, int element) {
        if(head == null) return null;
        if(head.data == element) return new Node(num, head);
        Node temp = head;
        while(temp.next != null) {
            if(temp.next.data == element) {
                temp.next = new Node(num, temp.next);
                return head;
            }
            temp = temp.next;
        }
        return head;
    }
}
