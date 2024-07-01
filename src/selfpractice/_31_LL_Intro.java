package selfpractice;

public class _31_LL_Intro {

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
        int[] arr = {2, 4, 5, 7, 10, 12};
        Node head = convertArrToLL(arr, arr.length);

        print(head);
    }

    public static int lengthOfLL(Node head) {
        int cnt = 0;
        Node temp = head;
        while(temp != null) {
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    public static boolean searchInLL(Node head, int val) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == val) return true;
            temp = temp.next;
        }
        return false;
    }
}
