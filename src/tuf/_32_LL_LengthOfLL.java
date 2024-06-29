package tuf;

public class _32_LL_LengthOfLL {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 6, 9, 10, 3, 30};
        Node head = convertArrToLL(arr);
        System.out.println(lengthOfLL(head));
    }
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
    public static Node convertArrToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {

            // creating new node with value = arrValue and next = null (assuming that this is the last element)
            Node temp = new Node(arr[i]);

            // assign new node's address to current node's next pointer
            mover.next = temp;

            // move mover to newly added node so that we can add more elements afterward
            mover = temp;
        }
        return head;
    }
    public static int lengthOfLL(Node head) {
        Node temp = head;
        int cnt = 0;
        while(temp != null) {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
}
