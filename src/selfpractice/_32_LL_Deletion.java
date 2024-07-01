package selfpractice;

public class _32_LL_Deletion {

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
        int[] arr = {3, 4, 7, 8, 10, 15, 20};
//        int[] arr = {3};
        Node head = convertArrToLL(arr, arr.length);
//        Node head = null;

//        head = deleteHead(head);
//        head = deleteTail(head);
//        head = deletePosition(head, 3);
//        head = deleteElement(head, 2);
        print(head);
    }

    public static Node deleteHead(Node head) {
        if(head == null || head.next == null) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        return head;
    }

    public static Node deleteTail(Node head) {
        if(head == null || head.next == null) return null;
        Node temp = head;
        while(temp.next.next != null) temp = temp.next;
        temp.next = null;
        return head;
    }

    public static Node deletePosition(Node head, int k) {
        if(head == null) return null;
        if(k == 1) {
            Node temp = head;
            head = head.next;
            temp.next = null;
            return head;
        }
        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while(temp != null) {
            cnt++;
            if(k == cnt) {
                prev.next = temp.next;
                temp.next = null;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static Node deleteElement(Node head, int element) {
        if(head == null || (head.data == element && head.next == null)) return null;
        if(head.data == element) {
            Node temp = head;
            head = head.next;
            temp.next = null;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null) {
            if(temp.data == element) {
                prev.next = temp.next;
                temp.next = null;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
}
