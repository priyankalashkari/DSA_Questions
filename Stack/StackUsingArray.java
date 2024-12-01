package Stack;

import java.util.Stack;

public class StackUsingArray {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    boolean isEmpty() {
        return (top<0);
    }
    StackUsingArray() {
        top = -1;
    }

    // push
    boolean push(int x) {
        if(top >= (MAX - 1))  {
            System.out.println("overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed");
            return true;
        }
    }

    // pop
    int pop() {
        if(top < 0)  {
            System.out.println("underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    // peek
    int peek() {
        if(top < 0)  {
            System.out.println("underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }

    // print
    void print() {
        for(int i=top; i>=0; i--) {
            System.out.print(" " + a[i]);
        }
    }

    public static void main(String[] args) {
        StackUsingArray s = new StackUsingArray();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("top element is: " + s.peek());

        System.out.println(s.pop() + " popped");
        System.out.println("top element is: " + s.peek());
        System.out.print("element :");
        s.print();
    }
}
