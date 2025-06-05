package DSA;

import java.util.Scanner;
import java.util.Stack;

public class infix_post
{
static int precedence(char c) {
if(c=='+' || c=='-')
return 1;
else if(c=='*' || c=='/')
return 2;
else if(c=='^')
return 3;
else
return 0;
}
static String convert(String in)
{
String post="";// 
Stack<Character> s=new Stack<>();//stack 
for(char c:in.toCharArray())
{
if(c=='(')
s.push(c);
else if (c==')')
{
while(s.peek()!='(')
post+=s.pop();

s.pop();//remove '(' 
}
else if (c=='+' || c=='-' || c=='*' || c=='/')
{
while(!s.empty() && precedence(s.peek())>=precedence(c))
{
post+=s.pop();//if lower pop it out 
}
s.push(c);//push new 
}
else//operand 
	{
post+=c;
}
}//infix over 
while(!s.empty())
post+=s.pop();
return post;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter In-fix Expression:");
String infix=sc.next();
String postfix=infix_post.convert(infix);
System.out.println("Postfix is:"+postfix);
}
}
