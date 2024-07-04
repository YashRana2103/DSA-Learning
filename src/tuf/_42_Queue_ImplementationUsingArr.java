package tuf;

public class _42_Queue_ImplementationUsingArr {
    static int cnt = 0;
    static int front = 0;
    static int rear = 0;
    static int n = 5;
    static int[] arr = new int[n];

    public static void main(String[] args) {
        push(30);
        push(2);
        push(3);
        push(10);
        print();
        System.out.println();

        pop();
        print();
        System.out.println();

        push(40);
        push(9);
        push(91);
        print();

        pop();
        pop();
        print();

        push(99);
        print();
        System.out.println(top());
    }

    public static void push(int ele) {
        if(cnt == n) System.out.println("Queue is full!");
        else {
            arr[rear % n] = ele;
            System.out.println("\n"+ele + " pushed");
            rear++;
            cnt++;
        }
    }

    public static void pop() {
        if(cnt == 0) System.out.println("Queue is empty!");
        else {
            System.out.println("\n"+arr[front % n] +" popped");
            arr[front % n] = -1;
            front++;
            cnt--;
        }
    }

    public static int top() {
        if(cnt == 0) return -1;
        return arr[front % n];
    }

    public static void print() {
        if(cnt == 0) System.out.println("Queue is empty!");
        for (int i = front; i < rear; i++) System.out.print(arr[i % n] + " ");
    }
}
