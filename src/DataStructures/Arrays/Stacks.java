package DataStructures.Arrays;

public class Stacks {
    int size;
    int[] arr;
    int top;

    Stacks(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int pushedElement) {
        if (!isFull()) {
            top++;
            arr[top] = pushedElement;
            System.out.println("Pushed element:" + pushedElement);
        } else {
            System.out.println("Stack is Occupied.");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int returnedTop = top;
            top--;
            System.out.println("Popped element :" + arr[returnedTop]);
            return arr[returnedTop];

        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }

    public int peek() {
        if (!this.isEmpty())
            return arr[top];
        else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (size - 1 == top);
    }

    public static void main(String[] args) {
        Stacks stack = new Stacks(7);
        stack.pop();
        System.out.println(" ");
        stack.push(10);
        stack.push(8);
        stack.push(19);
        stack.push(40);
        System.out.println(" ");
        stack.pop();
        stack.pop();
        stack.pop();

    }
}