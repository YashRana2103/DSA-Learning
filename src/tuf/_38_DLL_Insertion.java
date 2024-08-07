package tuf;

import selfpractice._36_DLL_Insertion;

public class _38_DLL_Insertion {

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
        int[] arr = {3, 1, 4, 8, 9, 2, 10};
        Node head = convertArrToDLL(arr);

//        head = insertAtHead(head, 134);
//        head = insertAtTail(head, 134);
//        head = insertBeforeTail(head, 134);
//        head = insertAtPosition(head, 134, 7);
        head = insertBeforeNode(head, 134, head.next);
        print(head);
    }

    public static Node insertAtHead(Node head, int num) {
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
        while(temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(temp.prev, num, temp);
        temp.prev.next = newNode;
        temp.prev = newNode;
        return head;
    }

    public static Node insertAtPosition(Node head, int num, int k) {
        if(head == null) return head;
        if(k == 1) {
            Node newNode = new Node(null, num, head);
            head.prev = newNode;
            head = newNode;
            return head;
        }
        int cnt = 0;
        Node temp = head;
        while(temp != null) {
            cnt++;
            if(cnt == k) {
                if(temp.next == null) {
                    temp.next = new Node(temp, num, null);
                    break;
                }
                Node newNode = new Node(temp.prev, num, temp);
                temp.prev.next = newNode;
                temp.prev = newNode;
                break;
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
