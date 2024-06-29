package tuf;

public class _33_LL_SearchInLL {
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
        System.out.println(searchInLL(head, 11));
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

    private static boolean searchInLL(Node head, int value) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == value) return true;
            temp = temp.next;
        }
        return false;
    }
}
