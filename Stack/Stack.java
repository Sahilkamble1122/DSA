package DSA;
import java.util.Scanner;

class Stack_Class {
    int tos, Maxsize, s[];

    Stack_Class(int size) {
        tos = -1;
        Maxsize = size;
        s = new int[Maxsize];
    }

    void push(int e) {
        tos++;
        s[tos] = e;
        // or simply: s[++tos] = e;
    }

    boolean isFull() {
        return (tos == Maxsize - 1);
    }

    int pop() {
        int temp = s[tos];
        tos--;
        return temp;
        // or: return s[tos--];
    }

    int peek() {
        return s[tos];
    }

    boolean isEmpty() {
        return (tos == -1);
    }

    void printStack() {
        for (int i = tos; i > -1; i--) {
            System.out.println(s[i]);
        }
    }
}


public class Stack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of stack:");
        int size = sc.nextInt();

        Stack_Class stack = new Stack_Class(size);

        int t = 0;

        do {
            System.out.println("\n1. Push\n2. Pop\n3. Peek\n4. Print\n5. Exit");
            System.out.println("Enter operation:");
            t = sc.nextInt();

            switch (t) {
                case 1:
                    System.out.println("Enter element:");
                    if(stack.isFull()) {
                    	System.out.println("stack is full");
                    }
                    else {
                    	int temp = sc.nextInt();
                        stack.push(temp);
					}
                    break;
                case 2:
                	if (stack.isEmpty()) {
                		System.out.println("Stack is empty");
                	}else {
                    stack.pop();
                	}
                    break;
                case 3:
                    System.out.println(stack.peek());
                    break;
                case 4:
                	stack.printStack();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        } while (t != 5);

        sc.close();
        
    }
}

