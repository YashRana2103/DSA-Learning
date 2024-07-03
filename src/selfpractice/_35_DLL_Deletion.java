package selfpractice;

public class _35_DLL_Deletion {

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

    public static Node convertArrToDLL(int[] arr, int n) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < n; i++) {
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
//        int[] arr = {20};
        Node head = convertArrToDLL(arr, arr.length);

//        head = deleteHead(head);
//        head = deleteTail(head);
//        head = deletePosition(head, 7);
//        head = deleteNode(head, head.next.next.next.next.next.next);
        print(head);
    }

    public static Node deleteHead(Node head) {
        if(head == null || head.next == null) return null;
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        return head;
    }

    public static Node deleteTail(Node head) {
        if(head == null || head.next == null) return null;
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        temp.prev.next = null;
        temp.prev = null;
        return head;
    }

    public static Node deletePosition(Node head, int k) {
        if(head == null) return null;
        if(head.next == null && k == 1) return null;
        if(k == 1) {
            Node temp = head;
            head = head.next;
            head.prev = null;
            temp.prev = null;
            return head;
        }
        int cnt = 0;
        Node temp = head;
        while(temp != null) {
            cnt++;
            if(cnt == k) {
                if(temp.next == null) {
                    temp.prev.next = null;
                    temp.prev = null;
                    return head;
                }
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                temp.prev = temp.next = null;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node deleteNode(Node head, Node node) {
        // given node will be not a head node
        // means head node will never be deleted
        if(node.next == null) {
            node.prev.next = null;
            node.prev = null;
            return head;
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.prev = node.next = null;
        return head;
    }
}
