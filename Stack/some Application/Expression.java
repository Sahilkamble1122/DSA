package DSA;

import java.util.Scanner;
import java.util.Stack;
import java.util.Scanner;
import java.util.Stack;



class pre {
	public static int evolve(String exp) {
        Stack<Integer> a = new Stack<>();
        
        for (int i=exp.length()-1 ; i >= 0 ; i--) {
        	char ch=exp.charAt(i);
            if (Character.isDigit(ch)) {
                a.push(ch - '0');
            } else {
                int op1 = a.pop();
                int op2 = a.pop();
                switch (ch) {
                    case '+':
                        a.push(op1 + op2);
                        break;
                    case '-':
                        a.push(op1 - op2);
                        break;
                    case '*':
                        a.push(op1 * op2);
                        break;
                    case '/':
                        a.push(op1 / op2);
                        break;
                    case '%':
                        a.push(op1 % op2);
                        break;
                }
            }
        }
        return a.pop();
    }
}
class Post {

    public static int evolve(String exp) {
        Stack<Integer> a = new Stack<>();
        for (char i : exp.toCharArray()) {
            if (Character.isDigit(i)) {
                a.push(i - '0');
            } else {
                int op2 = a.pop();
                int op1 = a.pop();
                switch (i) {
                    case '+':
                        a.push(op1 + op2);
                        break;
                    case '-':
                        a.push(op1 - op2);
                        break;
                    case '*':
                        a.push(op1 * op2);
                        break;
                    case '/':
                        a.push(op1 / op2);
                        break;
                    case '%':
                        a.push(op1 % op2);
                        break;
                }
            }
        }
        return a.pop();
    }
}

public class Expression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter postfix expression ");
        String exp = sc.next();
        int result = Post.evolve(exp);
        System.out.println("Result: " + result);
        
        sc.nextLine();
        
        System.out.print("Enter pre expression ");
        String exp2 = sc.nextLine();
        int result2 = pre.evolve(exp2);
        System.out.println("Result: " + result2);
        sc.close();
    }
}
