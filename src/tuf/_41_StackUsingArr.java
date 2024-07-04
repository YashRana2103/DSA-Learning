package tuf;

public class _41_StackUsingArr {
    static int[] arr = new int[5];
    static int top = -1;

    public static void main(String[] args) {
        push(2);
        print();
        System.out.println();

        push(3);
        push(4);
        push(5);
        push(6);
        print();
        System.out.println();

        pop();
        print();
        System.out.println();

//        System.out.println(top());
    }

    public static void push(int ele) {
        arr[++top] = ele;
    }

    public static void pop() {
        top--;
    }

    public static int top() {
        return arr[top];
    }

    public static int size() {
        return top + 1;
    }

    public static boolean isEmpty() {
        if(top == -1) return true;
        return false;
    }

    public static void print() {
        if(top == -1) System.out.println("Stack is empty!");
        for (int i = 0; i < size(); i++) System.out.print(arr[i] + " ");
    }
}
