package Chapter_04;

class Stack {
    private int[] arr;
    private int top;
    private  int capacity;

    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;

        System.out.println("Inserted " + x);
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Empty");
            return -1;
        }
        return arr[top--];
    }
}

public class Problem_01 {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(5);
        stack.push(30);
        stack.push(15);
        stack.push(25);
        System.out.println("Popped element: " + stack.pop());
    }
}
