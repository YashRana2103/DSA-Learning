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
            mover.next = new Node(mover, arr[i], null);
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

//        head = insertBeforeHead(head, 69);
//        head = insertAtTail(head, 69);
//        head = insertBeforeTail(head, 69);
//        head = insertAtPosition(head, 69, 8);
//        head = insertBeforeNode(head, 69, head.next.next.next.next.next.next);
        print(head);
    }

    public static Node insertBeforeHead(Node head, int num) {
        if(head == null) return new Node(num);
        head.prev = new Node(null, num, head);
        head = head.prev;
        return head;
    }

    public static Node insertAtTail(Node head, int num) {
        if(head == null) return new Node(num);
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        temp.next = new Node(temp, num, null);
        return head;
    }

    public static Node insertBeforeTail(Node head, int num) {
        if(head == null) return null;
        if(head.next == null) {
            head.prev = new Node(null, num, head);
            head = head.prev;
            return head;
        }
        Node temp = head;
        while(temp.next.next != null) temp = temp.next;
        temp.next = new Node(temp, num, temp.next);
        temp.next.next.prev = temp.next;
        return head;
    }

    public static Node insertAtPosition(Node head, int num, int k) {
        if(head == null) return null;
        if(k == 1) {
            head.prev = new Node(null, num, head);
            head = head.prev;
            return head;
        }
        int cnt = 0;
        Node temp = head;
        while(temp != null) {
            cnt++;
            if(cnt == k - 1) {
                temp.next = new Node(temp, num, temp.next);
                return head;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node insertBeforeNode(Node head, int num, Node node) {
        if(node.next == null && node.prev == null) {
            head.prev = new Node(null, num, head);
            head = head.prev;
            return head;
        }
        if(node.prev == null) {
            head.prev = new Node(null, num, head);
            head = head.prev;
            return head;
        }
        if(node.next == null) {
            node.prev.next = new Node(node.prev, num, node);
            node.prev = node.prev.next;
            return head;
        }
        node.prev = new Node(node.prev, num, node);
        node.prev.prev.next = node.prev;
        return head;
    }
}
