package tuf;

public class _31_LL_ArrayToLL {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 6, 9, 10, 3};
        Node head = convertArrToLL(arr);
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
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
}
