package selfpractice;

public class _34_DLL_Intro {

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

    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 9, 10, 14, 20};
    }
}
